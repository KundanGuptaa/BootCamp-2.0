import java.util.*;
public class deleteRowWithMaxSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] mat=new int[row][col];
        int[] sum=new int[mat.length];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
                sum[i]+=mat[i][j];
            }
        }
        int highest=0;
        int hIdx=0;
        for(int i=0;i<sum.length;i++){
            if(highest<sum[i]){
                highest=sum[i];
                hIdx=i;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(hIdx==i){
                    continue;
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
