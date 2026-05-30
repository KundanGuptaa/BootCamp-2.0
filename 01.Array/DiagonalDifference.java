import java.util.*;
public class DiagonalDifference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int primaryDiagonal=0;
        int secondaryDiagonal=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    primaryDiagonal+=mat[i][j];
                }
                if(i+j==col-1){
                    secondaryDiagonal+=mat[i][j];
                }
            }
        }
        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
