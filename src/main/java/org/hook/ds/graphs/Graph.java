package org.hook.ds.graphs;

public class Graph {
  private int V; // number of verrtices in Graph
  private int E; // number of edges in Graph
  private int[][] adjMatrix;

  public Graph(int nodes) {
    this.V = nodes;
    this.E = 0;
    this.adjMatrix = new int[nodes][nodes];
  }

  public void addEdge(int u, int v) {
    this.adjMatrix[u][v] = 1;
    this.adjMatrix[v][u] = 1;// an undirected graph
    E++;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(V + " vertices, " + E + " edges " + "\n");
    for (int v = 0; v < V; v++) {
      sb.append(v + ": ");
      for (int w : adjMatrix[v]) {
        sb.append(w + " ");
      }
      sb.append("\n");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Graph g = new Graph(4);
    g.addEdge(0, 1);
    g.addEdge(1, 2);
    g.addEdge(2, 3);
    g.addEdge(3, 0);

    System.out.println(g);

    // graph will look like that
    //4 vertices, 4 edges
    //0: 0 1 0 1
    //1: 1 0 1 0
    //2: 0 1 0 1
    //3: 1 0 1 0
  }
}
