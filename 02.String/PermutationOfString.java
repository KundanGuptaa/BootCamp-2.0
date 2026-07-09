import java.util.*;
public class PermutationOfString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        List<String> permutations=new ArrayList<>();
        generatePermutations(str.toCharArray(), 0, permutations);
        Collections.sort(permutations);
        for(String perm: permutations){
            System.out.println(perm);
        
        }
        
    }
}
