/**
 * @author alfi
 * @since 19.10.20
 * @version 1st try actuallt #miraclesDoHappen
 */

public class Task {

    private String description;
    private int time;
    private String priority;
    private int priorityNo;

    public Task(String description, int priority, int time) {
        this.description = description;
        this.time = time;
        this.priorityNo = priority;
        if (priority == 1) {
            this.priority = "very important";
        } else if (priority == 2) {
            this.priority = "important";
        } else if (priority == 3) {
            this.priority = "unimportant";
        } else if (priority == 4) {
            this.priority = "after learn Portuguese";
        }
    }

    public int getTime() {
        return time;
    }

    public int getPriority() {
        return priorityNo;
    }

    public String toString() {
        return description + " takes " + time + " minutes and has priority " + priority;
    }
}
