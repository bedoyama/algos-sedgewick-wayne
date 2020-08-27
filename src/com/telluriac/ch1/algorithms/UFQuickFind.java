package com.telluriac.ch1.algorithms;

import com.telluriac.ch1.section14.Stopwatch;
import com.telluriac.stdlibrary.StdIn;
import com.telluriac.stdlibrary.StdOut;

public class UFQuickFind implements UF {
    private int[] id; // access to component id (site indexed)
    private int count; // number of components

    public UFQuickFind(int N) { // Initialize component id array.
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public void union(int p, int q) { // Put p and q into the same component.
        int pID = find(p);
        int qID = find(q);

        // Nothing to do if p and q are already in the same component.
        if (pID == qID) return;

        // Change values from id[p] to id[q].
        for (int i = 0; i < id.length; i++)
            if (id[i] == pID) id[i] = qID;
        count--;
    }

    // See page 222 (quick-find),page 224 (quick-union) andpage 228 (weighted).
    public static void main(String[] args) { // Solve dynamic connectivity problem on StdIn.
        Stopwatch timer = new Stopwatch();
        int N = StdIn.readInt(); // Read number of sites.
        UF uf = new UFQuickFind(N); // Initialize N components.
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt(); // Read pair to connect.
            if (uf.connected(p, q)) continue; // Ignore if connected.
            uf.union(p, q); // Combine components
            StdOut.println(p + " " + q); // and print connection.
        }
        StdOut.println(uf.count() + " components");
        double time = timer.elapsedTime();
        StdOut.println("Elapsed " + time + "seconds");
    }
}