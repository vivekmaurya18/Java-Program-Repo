import java.util.Scanner;

public class ChangeCaseString {
    public static void ChangeCase(String s){
        String first=s.substring(0,1).toUpperCase() +s.substring(1);
        String second=s.toUpperCase();
        System.out.println(first);
        System.out.println(second);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String");
        String s=sc.nextLine();

        ChangeCase(s);

    }
}
