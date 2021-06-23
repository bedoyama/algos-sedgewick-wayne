package com.telluriac.datastruct;

public interface IGraph {
    /*
    number of vertices
     */
    int V();

    /*
    number of edges
     */
    int E();

    /*
    add edge v-w to this graph
     */
    void addEdge(int v, int w);

    /*
    vertices adjacent to v
     */
    Iterable<Integer> adj(int v);
}
