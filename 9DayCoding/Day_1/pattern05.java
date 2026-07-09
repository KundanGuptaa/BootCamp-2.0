public class pattern05 {
     public static void main(String[] args){
        int s=5;
        for(int i=s;i>=1;i--){
            for(int k=1;k<=s-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
