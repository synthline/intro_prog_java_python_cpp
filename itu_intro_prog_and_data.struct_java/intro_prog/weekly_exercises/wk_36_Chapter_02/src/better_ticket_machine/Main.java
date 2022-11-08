package better_ticket_machine;

public class Main {
    public static void main(String[] args) {
      /*  TicketMachine btm = new TicketMachine(100);
        btm.getPrice();
        btm.insertMoney(100);
        btm.getBalance();
        btm.printTicket();*/
    
     
        // Exercise 2.48

        TicketMachine btm2 = new TicketMachine(150);
        btm2.getPrice();
        btm2.insertMoney(250);
        btm2.printTicket();
      
        

        // Exercise 2.60

        // it won't compile because price was defined as an integer already.

        // Exercise 2.61

        TicketMachine btm3 = new TicketMachine(100);
        System.out.println(btm3.getPrice());
        btm3.insertMoney(150);
        btm3.printTicket();
        System.out.println("Returning money:"+btm3.emptyMachine());
        System.out.println("Balance="+btm3.getBalance());
    }
}