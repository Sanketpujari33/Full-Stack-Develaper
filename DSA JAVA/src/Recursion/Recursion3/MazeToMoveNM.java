package Recursion.Recursion3;

public class MazeToMoveNM {
    public static  int countPaths(int i, int j, int n, int m){
        if(i==n||j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int downPaths= countPaths(i+1, j, n, m);
        int rightPath=countPaths( i, j+1, n, m);
        return downPaths+rightPath;
    }
    public static void main(String[] args) {
        int n=3, m=3;
      int totelPaths=  countPaths( 0, 0, n, m);
        System.out.println(totelPaths);
    }
}
