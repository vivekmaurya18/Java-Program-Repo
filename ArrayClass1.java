import java.util.Arrays;
public class ArrayClass1 {
    public static void main(String[] args) {
        int[] arr={1,10,20,30,50,80,90,100};
        int key=50;

        System.out.println(key + " found in index = " + Arrays.binarySearch(arr,key));

    }
    
}
