import java.util.List;
import java.util.Iterator;
import java.util.Random;

public abstract class Animal {

   protected static final Random rand = Randomizer.getRandom();

   protected int age;

   protected boolean alive;

   protected Location location;

   protected Field field;

   public Animal(Field field, Location location) {
      age = 0;
      alive = true;
      this.field = field;
      this.setLocation(location);
   }

}
