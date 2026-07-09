public class pattern06 {
    public static void main(String[] args){
        int s=5;
        for(int i=1;i<=s;i++){
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
