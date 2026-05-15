import java.util.Scanner;
class Checking {
    public static boolean isPangram(String str){

        str=str.toLowerCase();  //<-----------------Focus Here
        for(char ch='a';ch<='z';ch++){  //<------------------ Focus Here
            if(str.indexOf(ch) == -1) {  //<------------------ Focus Here
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Sentence");
        String text=sc.nextLine();

        if(isPangram(text)) {
            System.out.println("This is Pangram");
        }else{
            System.out.println("This is not a pangram");
        }
    }
}
