package naive_ticket_machine;

public class Main {
    public static void main(String[] args) {
        /* 
        The first thing you need to do is create a TicketMachine object (like Circle circle = new Circle();).
        Remember to check whether the Constructor takes any argument. If it does it could look something like
        this: Circle circle = new Circle(50);
        */
        TicketMachine tm = new TicketMachine(100);
        
                // Which methods are available in the TicketMachine class? Try to play around with these and see what you get.
        // You can use System.out.println() to test this.

        tm.printTicket();

        // Exercise 2.2

        tm.getBalance();

        // Exercise 2.3

        tm.insertMoney(7890);
        tm.printTicket();
        
        tm.insertMoney(-1000);
        tm.printTicket();
        tm.getBalance();
        System.out.println(tm.getBalance());

        // Exercise 2.8

        //it works//

        // Exercise 2.9

        //It doesn't//

        // Exercise 2.11

        // I dunno //

        // Exercise 2.37

        tm.prompt();

        // Exercise 2.38

        //it would be a text//

        // Exercise 2.41

        tm.showPrice();

        // Exercise 2.42

        TicketMachine tm2 = new TicketMachine(10);
        tm2.showPrice();

        TicketMachine tm3 = new TicketMachine(20);
        tm3.showPrice();

        //it is different since the int cost of the ticket is the price of the ticket//
    }
}