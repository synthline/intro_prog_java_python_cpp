
/** @author alfi
*   @since 19.10.20
*   @version 1st try actuallt #miraclesDoHappen
**/
import java.util.*;

public class Todo implements Comparator<Task> {
    private ArrayList<Task> todoList;

    public Todo() {
        this.todoList = new ArrayList<>();
    }

    protected int completedWork = 0;

    public int compare(Task e, Task f) {
        int result = 0;
        if (e.getTime() < f.getTime()) {
            result = -1;
        }
        if (e.getTime() > f.getTime()) {
            result = 1;
        }
        return result;
    }

    public void addTask(String description, int priority, int time) {
        Task e = new Task(description, priority, time);
        if (priority > 4 || priority < 1) {
            throw new IllegalArgumentException(description + " has invalid priority");
        }
        if (time < 0) {
            throw new IllegalArgumentException(description + " has invalid workload");
        }
        todoList.add(e);
    }

    public void completeTask(int index) {
        if (!(index > -1 && index <= todoList.size() - 1)) {
            throw new IllegalArgumentException("Invalid index");
        } else {
            int completedWorkTime = +todoList.get(index).getTime();
            completedWork += completedWorkTime;

            todoList.remove(index);
        }
    }

    public void print() {
        System.out.println("Todo:");
        System.out.println("-----");
        if (!(todoList.isEmpty())) {
            for (Task e : todoList)
                System.out.println(e.toString());
        } else if (todoList.isEmpty()) {
            System.out.println("You're all done for today! #TodoZero");
        }
        if (completedWork > 0) {
            System.out.println(completedWork + " minutes of work done!");
        }
    }

    public void printPriority(int limit) {
        System.out.println("Filtered todo:");
        System.out.println("--------------");
        for (Task e : todoList) {
            if (e.getPriority() <= limit) {
                System.out.println(e.toString());
            } else if (limit == 0) {
                System.out.println("No tasks given priority");
            }
        }
    }

    public void printPrioritized() {
        System.out.println("Prioritized todo:");
        System.out.println("-----------------");
        ArrayList<Task> pList1 = new ArrayList<>();
        ArrayList<Task> pList2 = new ArrayList<>();
        ArrayList<Task> pList3 = new ArrayList<>();
        ArrayList<Task> pList4 = new ArrayList<>();
        Comparator<Task> com = new Todo();
   
        for (Task e : todoList) {
            if (e.getPriority() == 1) {
                pList1.add(e);
                pList1.sort(com);
            } else if (e.getPriority() == 2) {
                pList2.add(e);
                pList2.sort(com);
            } else if (e.getPriority() == 3) {
                pList3.add(e);
                pList3.sort(com);
            } else if (e.getPriority() == 4) {
                pList4.add(e);
                pList4.sort(com);
            } else {
            }
        }
        for (Task g : pList1) {
            System.out.println(g.toString());
        }
        for (Task g : pList2) {
            System.out.println(g.toString());
        }
        for (Task g : pList3) {
            System.out.println(g.toString());
        }
        for (Task g : pList4) {
            System.out.println(g.toString());
        }
    }
}