public class Child {

    private String name;
    private int age;
    private boolean isHere;
    private String activity;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
        isHere = false;
        this.activity = "";
    }

    public void setIsHere(boolean state) {
        boolean isHere = state;
    }

    // public void setIsHere(setisHere())
    // {
    // boolean isHere = true;
    // }

    // overloading

    public boolean isOlderThan(int ageLimit) {
        if (ageLimit < age) {
            return true;
        }
        return false;
    }

    // public boolean setActivity(String newActivity)
    // {
    // if ( activity = "")
    // {
    // activity = newActivity;
    // reuturn true
    // }return false;

    public String getActivity() {
        return activity;
    }

// public void display()
// {
//     if ()
//     {
//         System.out.println(name + " (" + age + ")" + " - is here"); 
//     } else {
//         System.out.println("not here concatenate ");
//     }

// }
}






// Add a display() method, that prints the information of the child to standard
// out,
// using the format "name (age) - is [not ]here[, activity if isHere and not
// null]"
// Examples:
// "Anna (5) - is here"
// "Charlie (4) - is not here"
// "Bobby (3) - is here, riding a balance bike"
// Create a DayCare class, for representing the day care where the children are
// during the day.
// A day care has a name (a text string), children (an array of Child), and a
// childCount (a whole number) representing
// the total number of children signed up.
// Add a constructor to DayCare that takes as parameters the name (a text
// string), and a maximum number of children (an int).
// It must initialize children to be an array of size equal to the maximum
// number of children specified, and the childCount must initially be 0.
// Create a TooManyChildren class, that should be a checked exception, with an
// empty constructor (due to a bug on the server code, the
// empty constructor must be explicitly written; an implicit empty constructor
// is not accepted).
// Add a method signUp(Child) to DayCare, which should sign the child up in the
// day care.
// The child must be added to the children array if there is room left, and
// otherwise throw a TooManyChildren.
// Add a method attemptSignUp(Child), which uses signUp(Child) as a helper
// method, but which
// instead of throwing an exception returns true or false depending on whether
// the sign up succeeded.
// Add a method display(), which displays all of the children currently signed
// up to this daycare.
// The first line should be "--- name of day care (max capacity) ---",
// followed by the display string of each child in the order they were signed up
// in.

// In this problem, you will write the classes for modelling a daycare that
// keeps track of which children are currently there,
// and what each child is doing. Each completed sub task below will award
// points,
// so you don't need to solve all tasks. Each task corresponds to a test, and
// you may submit your solution as many times as you like.

// All fields must be private and all methods and constructors must be public.
// The return type of methods is void, if no return value is mentioned.

// Add a method isOlderThan(ageLimit) that returns true if the child is at least
// the given (int) ageLimit, and false otherwise.
// Add a method setActivity(newActivity) that updates the activity, but only if
// the child currently is doing nothing (has null activity),
// or the the newActivity is null. It must return true or false indicating
// whether the activity successfully changed.
// Add a method getActivity() that returns the current activity of the child.