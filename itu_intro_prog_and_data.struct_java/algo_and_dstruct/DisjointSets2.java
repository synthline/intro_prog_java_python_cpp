/**
 * @author Teresa Møller
 * @email term@itu.dk
 * @create date 2022-02-01 11:05:12
 * @modify date 2022-02-01 11:05:12
 * @desc DisjointSets
 */
package Kattis.DisjointSets;

//import java.io.FileInputStream;   - used for local testing of inputs
import java.io.FileNotFoundException;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class DisjointSets2 {

    private class UF {

        private int[] parent;
        private byte[] rank;
        private int count;

        public UF(int n) {
            if (n < 0)
                throw new IllegalArgumentException();
            count = n;
            parent = new int[n];
            rank = new byte[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public String toString() {
            return "<UnionFind\np " + Arrays.toString(parent) + "\nr>";
        }

        public int find(int p) {
            validate(p);
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public int count() {
            return count;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ)
                return;

            if (rank[rootP] < rank[rootQ])
                parent[rootP] = rootQ;
            else if (rank[rootP] > rank[rootQ])
                parent[rootQ] = rootP;
            else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            count--;
        }

        private void validate(int p) {
            int n = parent.length;
            if (p < 0 || p >= n) {
                throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
            }
        }

/*         public void disconnect(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
        } */

        public void move(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ)
                return;
            else {
                //StdOut.println(toString());
                union(p, q);
                //StdOut.println(toString()); 
            }
        }
    }

    public void move(UF uf, int s, int t) {
        uf.move(s, t);
    }

    public void query(UF uf, int s, int t) {
        int S = uf.find(s);
        int T = uf.find(t);
        if (S == T) {
            StdOut.println(1);
        } else {
            StdOut.println(0);
        }
    }

    public void union(UF uf, int s, int t) {
        uf.union(s, t);
    }

    public static void main(String[] args) throws FileNotFoundException {
        DisjointSets2 ds = new DisjointSets2();
        String firstLine = StdIn.readLine();
        String[] initialValues = firstLine.split(" ");
        if (initialValues.length != 2) {
            throw new IllegalArgumentException("Expected 2 input values on the first line e.g. '4 9'");
        }

        int n = Integer.parseInt(initialValues[0]);
        int m = Integer.parseInt(initialValues[1]);
        UF uf = ds.new UF(n);
        int i = 0;

        while (i < m && (i == m - 1 || StdIn.hasNextLine())) {
            String line = StdIn.readLine();
            String[] values = line.split(" ");
            if (values.length != 3) {
                throw new IllegalArgumentException("Expected 3 input values on the first line e.g. '0 0 1'");
            }

            int operation = Integer.parseInt(values[0]);
            int s = Integer.parseInt(values[1]);
            int t = Integer.parseInt(values[2]);

            if (operation == 0) {
                ds.query(uf, s, t);
            }
            if (operation == 1) {
                ds.union(uf, s, t);
            }
            if (operation == 2) {
                ds.move(uf, s, t);
            }

            i++;
        }
    }
}
