import java.util.Scanner;

public class CountWord {
    public static int countWord(String str){
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' '){    //--------->“Check whether the character at position i is a space or not.”<-----------//
                count++;

            }
        }
        return count;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any words");
        String str=sc.nextLine();

        int result=countWord(str);
        System.out.println(result);
    }
}
