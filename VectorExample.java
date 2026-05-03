import java.util.Stack;

public class VectorExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        Stack<String>fruits = new Stack<>();

        // Adding elements to the ArrayList
        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Mango");
        fruits.push("Orange");
        System.out.println("all fruits in stack" +fruits);


        System.out.println(fruits.contains( "Apple"));
        System.out.println(fruits.contains( "Dry Fruits"));



        // Size of the ArrayList
        System.out.println("Total fruits: " + fruits.size());
    }
}

    

