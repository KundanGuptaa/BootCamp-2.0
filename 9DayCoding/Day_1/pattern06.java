public class pattern06 {
    public static void main(String[] args){
        int s=5;
        for(int i=1;i<=s;i++){
            int count=1;
            for(int k=1;k<=s-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
