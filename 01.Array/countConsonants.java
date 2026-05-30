import java.util.Scanner;

public class countConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        String allToLow = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = allToLow.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            }else{
                count++;
            }
        }
        System.out.println("Number of Consonants in " + str + " is:" + count);
        sc.close();
    }
}
