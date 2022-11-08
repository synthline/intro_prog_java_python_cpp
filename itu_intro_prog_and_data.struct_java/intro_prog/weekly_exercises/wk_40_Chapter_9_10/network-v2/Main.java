public class Main {
   public static void main(String[] args) {
     
      NewsFeed nf1 = new NewsFeed();

      Post mp1 = new MessagePost("Alex", "What an amazing day!");
 //     Post pp1= new PhotoPost("Alex", "jpeg0035", "[caption]");

      mp1.addComment("Likewise");
      mp1.like();
      mp1.like();

   //   pp1.like();
     // pp1.addComment("so so nice");
      
      nf1.addPost(mp1);
     // nf1.addPost(pp1);

      
      nf1.show();
    


   }
}