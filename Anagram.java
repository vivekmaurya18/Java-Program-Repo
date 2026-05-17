import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] a1=s1.toCharArray();
        char[] a2=s2.toCharArray();


        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s1=sc.nextLine();

        System.out.println("Enter any String");
        String s2=sc.nextLine();

        System.out.println(checkAnagram(s1,s2));

    }
}
