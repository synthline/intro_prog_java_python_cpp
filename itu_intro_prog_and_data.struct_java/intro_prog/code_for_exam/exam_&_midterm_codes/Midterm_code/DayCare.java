import java.util.ArrayList;


public class DayCare
{

    private String name;
    private ArrayList<Child> children;
    private int ChildCount;


    public DayCare(String name, int maxChild)
    {
        this.name = name;
        children = new ArrayList<>();
        
    }

}
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



}