public class Graph {
    public static void main(String args[]) {
        int[][] graph = {
            {0, 1, 0, 0},  
            {0, 0, 1, 0},  
            {0, 0, 0, 0},  
            {1, 0, 0, 0}   
        };

        int sink = 0;

        for (int i = 0; i < graph.length; i++) {
            int zct = 0; 
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == 0) {
                    zct++;
                }
            }
            if (graph.length == zct) {
                System.out.println("Sink Node " + (char)(65 + i));
                sink++;
            }
        }

        System.out.print("No. of Sink Nodes: " + sink);
    }
}