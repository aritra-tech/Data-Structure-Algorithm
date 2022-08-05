// Implementation of BellmanFord Algorithm in java* 

package Data_Structure.Graph.GraphAlgorithms.Bellman_Ford_Algorithm;
 
import java.util.HashMap;
import java.util.Scanner;
 
public class BellmanFord {
 
    public static class edge {
        int u;
        int v;
 
        public edge(int u, int v) {
            this.u = u;
            this.v = v;
        }
 
        public String toString() {
            return this.u + " " + this.v;
        }
    }
 
    public static class Node {
        int val;

        int dist;
        String path;
 
        public Node(int val, int dist, String path) {
            this.val = val;
            this.dist = dist;
            this.path = path;
        }
 
        public String toString() {
            return "Distance of " + this.val + " from source is " + this.dist + " and path followed is " + this.path;
        }
 
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int[][] graph = new int[nodes + 1][nodes + 1];
        int numEdges = sc.nextInt();
        for (int edge = 0; edge < numEdges; edge++) {
            int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
            graph[u][v] = w;
        }
 
        bellmanford(sc.nextInt(), nodes, numEdges, graph);

 
    }
 
public static edge[] getEdges(int numEdges, int[][] graph) {
        edge[] rv = new edge[numEdges];
 
        int idx = 0;
        for (int u = 1; u < graph.length && idx < rv.length; u++) {
        for (int v = 1; v < graph[u].length && idx < rv.length; v++) {
                rv[idx] = new edge(u, v);
                idx = graph[u][v] != 0 ? idx + 1 : idx;
            }
        }
 
        return rv;
 
    }
 
public static void bellmanford(int src, int nodes, int edges, int[][] graph) {
        /*
         * we use hashmap to store the nodes of every vertex,
         * (vertex name, node) will be the key, value pair
         */
        HashMap<Integer, Node> nodesMap = new HashMap<>();
        for (int i = 1; i < graph.length; i++) {
            /*

             * initialize the shortest distance of the every
             *  vertex equal to Infinity as for this vertex
             *  the shortest distance is yet to be calculated,
             *  and initialize an empty path. But if the vertex
             *  is source vertex itself, then the shortest distance
             *  for it will be 0 and path will be initialized with
             *  vertex name.
             */
                nodesMap.put(i, new Node(i, i == src ? 0 : (int) 1e9 + 1, i == src ? Integer.toString(i) : ""));
        }
 
        /* outer loop will run for vertices - 1 times */
        for (int var = 1; var <= nodes - 1; var++) {
            /* running inner loop on the set of edges returned
             * from getEdges function */
            for (edge e : getEdges(edges, graph)) {
                Node u = nodesMap.get(e.u);
                Node v = nodesMap.get(e.v);
 
                /*
                 * the basic condition for updation of shortest
                 * distance of any node as mentioned in the above
                 * discussion.
                 */
                if (v.dist > u.dist + graph[u.val][v.val]) {
                    v.dist = u.dist + graph[u.val][v.val];
                    v.path = u.path + "->" + Integer.toString(v.val);
                }
            }
        }
 
        /*
         * one more loop in the random set of edges to detect if
         *  there is any negative cycle or not
         */
        for (edge e : getEdges(edges, graph)) {
            Node u = nodesMap.get(e.u);
            Node v = nodesMap.get(e.v);
 
            /*
             * if the we still are able to find shorted distance
             * this simply means that there is a negative cycle
             * for sure and hence we return from the function as
             * shortest distance for every vertex from source can
             * not be found for such graph as we can get even
             * shorter distance by looping once again in that
             * negative cycle.
             */
            if (v.dist > u.dist + graph[u.val][v.val]) {
                System.out.println("Negative Cycle Detected");
                return;
            }
        }
 
        for (int node : nodesMap.keySet()) {
            System.out.println(nodesMap.get(node));
        }
 
    }
 
}
 