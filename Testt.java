/* with static import
import static java.lang.Math.*;
public class Testt{
    public static void main(String[] args){
        System.out.println(sqrt(4));
        System.out.println(max(10,20));
        System.out.println(random());
    }
}

*/

// without static import 
class Testt{
    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));
        System.out.println(Math.max(10,50));
        System.out.println(Math.random());
    }
}
