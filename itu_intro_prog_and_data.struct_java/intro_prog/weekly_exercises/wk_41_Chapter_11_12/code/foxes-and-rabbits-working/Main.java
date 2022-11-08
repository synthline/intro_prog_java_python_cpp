public class Main {
    public static void main(String[] args) {
        
        Simulator s1 = new Simulator(100, 100);

        Randomizer r1 = new Randomizer();

       // s1.simulateOneStep();
    
  //  s1.simulate(50);


  s1.runLongSimulation();

  s1.reset();

  s1.runLongSimulation();

  // r1.reset();

  s1.reset();

  
    }
}
