package cacttus.education.graphs.interfaces;

import cacttus.education.queue.Queue;
import cacttus.education.queue.QueueOverflowException;
import cacttus.education.queue.QueueUnderflowException;

import java.util.List;

public interface Graph {
    enum GraphType {
        DIRECTED,
        UNDIRECTED
    }

    void addEdge(int vertex1, int vertex2);

    List<Integer> getAdjacentVertices(int vertex);

    void removeEdge(int vertex1, int vertex2);

    public static void depthFirstTraversal(Graph graph, int[] visited, int currentVertex) {
        if (visited[currentVertex] == 1) return;//kthehu

        visited[currentVertex] = 1; //marko poziten e saj si te vizituar

        List<Integer> list = graph.getAdjacentVertices(currentVertex); //gjej fqinjet e nyjes currentVertex
        for (int vertex : list) {
            depthFirstTraversal(graph, visited, vertex);//kthehet ketu ne momentin qe ska fqinje me vizitu
        }
        System.out.println(currentVertex + " -> ");
    }

    public static void dfs(Graph graph, int node) {
        int[] visited = new int[node]; //default jane te mbushura me zero
        for (int i = 0; i < node; i++) {
            depthFirstTraversal(graph, visited, i);
        }
    }

    public static void breadthFirstTraversal(Graph grap, int[] visited, int currentVertex)
            throws QueueOverflowException, QueueUnderflowException {
        Queue<Integer> queue = new Queue<>(Integer.class); // FIFO -> FIRST IN, FIRST OUT
        queue.enqueue(currentVertex); //jam duke vendose per shqyrtim nyjen ne fjale

        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();

            if (visited[vertex] == 1) continue; //nese e kemi vizitu, bani skip pjeses se mbetur vazhdo ne while
            System.out.println(vertex + " -> ");
            visited[vertex] = 1; //markoje si te viziituar
            List<Integer> list = grap.getAdjacentVertices(vertex); // gjej fqinjet e saj
            for (int v : list) {
                if (visited[v] != 1) //nse nuk eshte vizituar
                    queue.enqueue(v);
            }
        }
    }

    public static void bfs(Graph graph, int node) throws QueueUnderflowException, QueueOverflowException {
        int[] visited = new int[node];
        for (int i = 0; i < node; i++) {
            breadthFirstTraversal(graph, visited, i);
        }
    }

}







