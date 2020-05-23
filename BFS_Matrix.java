import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Matrix {
     static int n;
     static int[][] matrix;
    HashSet<Integer> visited=new HashSet<>();
    public BFS_Matrix(int n)
    {
        this.n=n;
        matrix=new int[n][n];
    }

    public void addEdge(int source,int destination)
    {
        matrix[source][destination]=1;
        matrix[destination][source]=1;
    }
    public void BFS(int start)
    {
        Queue<Integer> queue=new LinkedList<>();
        visited.add(start);
        queue.add(start);
        while(!queue.isEmpty()) {
            start=queue.remove();
            System.out.print(start+" ");

            for (int i = 0; i < n; i++) {
                int current = matrix[start][i];
                if(!visited.contains(i) && current==1)
                {
                    visited.add(i);
                    queue.add(i);
                }
            }
        }

    }

    public static void main(String[] args)
    {
        BFS_Matrix bfm=new BFS_Matrix(4);
        bfm.addEdge(0,2);
        bfm.addEdge(0,1);
        bfm.addEdge(1,2);
        bfm.addEdge(2,0);
        bfm.addEdge(2,3);
        bfm.addEdge(3,3);
        bfm.BFS(2);
    }
}
