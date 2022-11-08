// import java.util.*;
// import edu.princeton.cs.algs4.UF;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.StdOut;

// public class DisjointSets {

//     private int []id;
//     private int count;

//     public DisjointSets(int n) {

//         count =n;
//         id = new int[n];
//         for (int i=0; i<n; i++) {
//             id[i]=i;
//         }
//     }

// public int count() {
//     return count;
// }

// public boolean connected(int p, int q) {
//     return find(p) == find(q);
// }

// public int find(int p) {
//     return id[p];
// }


// public void union (int p, int q) {
//     int pID = find(p);
//     int qID = find(q);

//     if (pID == qID) {
//         return;
//     }

//     for ( int i = 0 ; i < id.length; i++) {
//     if (id[i] == pID) id[i] = qID;
//     count --;

//     }
// }


// public static void main(String[] args) {

// int n = StdIn.readInt();
// DisjointSets ds = new DisjointSets(n);

// while( !StdIn.isEmpty()) {
//     int p = StdIn.readInt();
//     int q = StdIn.readInt();
//     int action = StdIn.readInt();

//     if (ds.connected(p,q)) continue;
//     ds.union(p, q);


//     }

// }





// }