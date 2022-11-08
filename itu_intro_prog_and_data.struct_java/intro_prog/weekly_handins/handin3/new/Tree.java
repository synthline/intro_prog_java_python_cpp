public class Tree {
   private int age;
   private double height;
   private double growthPct;

   public Tree(double growthPct) {
      this.age = 1;
      this.height = 0.25;
      this.growthPct = growthPct;

   }

   public String toString() {
      return "Tree(age = " + age + ", height = " + height + ")";
   }

   public int getAge() {
      return age;
   }

   public double getHeight() {
      return height;
   }

   public void growOneYear() {
      age = age + 1;
      if (height < 20) {
         if (height * (1 + growthPct * 0.01) < 20) {
            height = (height * (1 + growthPct * 0.01));
         } else {
            height = 20;
         }
      }
   }




}
