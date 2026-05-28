import java.util.Scanner;
public class SumOfBoundaryOfElementOfMatrix {
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
        int sum=0;
        //top
        for(int i=0;i<mat[0].length;i++){
            sum+=mat[0][i];
        }
        //right
        for(int i=1;i<mat.length;i++){
            sum+=mat[i][mat[0].length-1];
        }
        //bottom
        for(int i=0;i<mat.length-1;i++){
            sum+=mat[mat.length-1][mat.length-i-2];
        }
        //left
        for(int i=1;i<mat.length-1;i++){
            sum+=mat[mat.length-i-1][0];
        }
        System.out.println("Sum:"+sum);
    }
}
