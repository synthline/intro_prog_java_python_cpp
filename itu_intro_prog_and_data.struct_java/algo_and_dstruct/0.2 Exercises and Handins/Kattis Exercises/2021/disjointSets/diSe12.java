// import java.util.*;

// public class diSe12 {
    
//     private static Integer[] id;
//     private int n;
//     private int count;
//     private String[] fNum;
//     private String[] cNum;
//     private ArrayList<Integer> numbers;

//     public diSe12(int n) {

//         this.n = n;
//         id = new Integer[n];
//         for (int i =0 ; i < n; i++) {
//         id[i] = i;
//         }

//         this.count = n;

//         ArrayList<Integer> numbers = new ArrayList<>();
//     }

//     public int find(int a) {
//         return id[a];
//     }

//     public void union(int p, int q) {
//         int pID = find(p);
//         int qID = find(q);
        
//         if (pID == qID) {
//             return; 
//             }
//         for (int i=0; i < id.length; i++) {
//         if (id[i] == pID) {
//             id[i] = qID;
//             count --;
//             }
//         }
//     }

//     public boolean connected (int p, int q) {
//         return (find(p) == find(q));
//     }     
//     public static void main(String[] args) {
        
//         var scan = new Scanner(System.in);

//         var N = scan.nextLine().trim();
//         String[] fNum = N.split(" ");
//         int n = Integer.parseInt(fNum[0]);
//         diSe12 ds = new diSe12(n);

       


//          for (int i=0; i < Integer.parseInt(fNum[1]); i++) {
//             ArrayList<Integer> numbers = new ArrayList<>();
        
//             var M = scan.nextLine().trim();
//             String[] cNum = M.split(" ");
//             for (String no : cNum) {
//                 numbers.add(Integer.parseInt(no));
//                 } 

//             int command = numbers.get(0); 
//             int p = numbers.get(1); 
//             int q = numbers.get(2);


//         switch(command) {
        
//             case 0:
//                 if ( ds.find(p) == ds.find(q)) {
//                     System.out.println("1");
//                 } else {
//                     System.out.println("0");
//                 }
//                 break;
        
//             case 1:
//                 ds.union(p, q);
//                 break;
                

//             case 2:

        
//             break;   

//             }
//         }     
//     }
// }
