import java.lang.ProcessBuilder.Redirect;

public class Main {
    public static public static void main(String[] args) {
        
    } main(String[] args) {
    	// provided code
        Triangle triangle1 = new Triangle(); // Example of how to create an object.
        triangle1.makeVisible(); // Makes you able to see it when you run the code.
        Canvas.getCanvas(); // Creates the picture you can see it on.

        // Exercise 1.1
            triangle1.makeInvisible();
            Circle circle1 = new Circle();
            Square square1 = new Square();
            circle1.makeVisible();
            square1.makeVisible();

        // Exercise 1.2
            square1.moveDown();
            square1.moveDown(); 
            square1.moveDown(); // square moves down arbitrarily.

            square1.makeInvisible();
            square1.makeInvisible(); // it stays invisible? 

        // Exercise 1.3
        circle1.moveVertical(5);
        circle1.slowMoveVertical(5);
        circle1.changeSize(200);
        circle1.moveHorizontal(70);
        
        // Exercise 1.4
        circle1.changeColor("red");
        circle1.changeColor("pink"); // made it black lol.
        circle1.changeColor("grey"); //still black ??? wtf
        circle1.changeColor("blue"); // I'm blue dabadibadabaaa


 
        // Exercise 1.6
        circle1.changeColor("Red"); // Error

    }
}