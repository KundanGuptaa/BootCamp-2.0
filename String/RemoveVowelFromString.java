package String;
public class RemoveVowelFromString {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = str.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
        System.out.println(result);
    
    }
}
