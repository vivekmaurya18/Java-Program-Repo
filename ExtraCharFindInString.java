import java.util.Scanner;
public class ExtraCharFindInString {
    public static char FindExtraChar(String s1,String s2) {
        char result = 0;
        for (int i = 0; i<s1.length(); i++){
            result ^= s1.charAt(i);
        }
        for (int i = 0; i<s2.length(); i++){
            result ^= s2.charAt(i);

        }
        return result;
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter First String");
        String s1=sc.nextLine();

        System.out.println("Enter First String");
        String s2=sc.nextLine();

        System.out.println("Extra Character is: " + FindExtraChar(s1, s2));


    }
}
