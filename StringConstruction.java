public class StringConstruction {
    public static void main (String[] args){
        String str1=new String("Hello World");
        System.out.println(str1);

        char[] CharArray={'J','A','V','A'};
        String str2=new String(CharArray);
        System.out.println("String for array = " + str2);

        byte[] byteArray = { 72, 101, 108, 108, 111 };
        String str3 = new String(byteArray);
        System.out.println("String from byte array: " + str3);

    }
}
