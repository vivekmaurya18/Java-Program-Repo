import java.util.Scanner;

public class StringSlice {
    public static String SlicesStrings(String s){
        return s.substring(1,s.length()-1); //-------->Here You Change And take Any String<------------

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any String");
        String s=sc.nextLine();

        String result=SlicesStrings(s);
        System.out.println(result);

    }
}
