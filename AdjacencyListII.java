import java.util.LinkedList;

public class AdjacencyListII {
    
    static public class Edge{
        int destinationVertex;
        int weight;

        public Edge(int destinationVertex,int weight)
        {
            this.destinationVertex=destinationVertex;
            this.weight=weight;
        }


        @Override
        public String toString() {
            return "{" +
                    destinationVertex +
                    "," + weight +
                    '}';
        }
    }

    static public class GraphSecond {
        int n;
        LinkedList<Edge> adjacencyList[];

        public GraphSecond(int n) {
            this.n = n;
            adjacencyList = new LinkedList[n];
            for (int i = 0; i < n; i++) {
                adjacencyList[i] = new LinkedList<Edge>();
            }
        }

        public void addEdge(int source ,int destination,int weight)
        {
            adjacencyList[source].add(0,new Edge(destination,weight));
        }
        @Override
        public String toString() {
            String result="";
            for(int i=0;i<adjacencyList.length;i++)
            {
                result+=i+"-->"+adjacencyList[i]+"\n";
            }
            return result;
        }
    }
    public static void main(String[] args)
    {
        GraphSecond g=new GraphSecond(5);
        g.addEdge(0,1,0);
        g.addEdge(0,4,0);
        g.addEdge(1,0,0);
        g.addEdge(1,4,0);
        g.addEdge(1,3,0);
        g.addEdge(1,2,0);
        g.addEdge(2,1,0);
        g.addEdge(2,3,0);
        g.addEdge(3,2,0);
        g.addEdge(3,1,0);
        g.addEdge(3,4,0);
        g.addEdge(4,1,0);
        g.addEdge(4,3,0);

        System.out.println(g);
    }


}
