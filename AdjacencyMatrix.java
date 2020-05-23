public class AdjacencyMatrix {
//     No of Vertices in the graph.
       int n;
//     Declarying the matrix..
       int[][] matrix;
       public AdjacencyMatrix(int n)
       {
           this.n=n;
           matrix=new int[n][n];
       }
//      Method to connect the graph.
       public void addEdge(int source,int destination,int weight)
       {
           matrix[source][destination]=weight;
           matrix[destination][source]=weight;
       }
//      Method to print the graph .
       public void printGraph()
       {
           for(int i=0;i<matrix.length;i++)
           {
               for(int j=0;j<matrix[0].length;j++)
               {
                   System.out.print(matrix[i][j]+" ");
               }
               System.out.println();
           }
       }
//      Main function.....
       public static void main(String[] args)
       {
//         Calling the constructor.
           AdjacencyMatrix am=new AdjacencyMatrix(5);
           am.addEdge(0,1,1);
           am.addEdge(0,4,1);
           am.addEdge(1,0,1);
           am.addEdge(1,4,1);
           am.addEdge(1,3,1);
           am.addEdge(1,2,1);
           am.addEdge(2,1,1);
           am.addEdge(2,3,1);
           am.addEdge(3,2,1);
           am.addEdge(3,1,1);
           am.addEdge(3,4,1);
           am.addEdge(4,1,1);
           am.addEdge(4,3,1);


           am.printGraph();
       }
}
