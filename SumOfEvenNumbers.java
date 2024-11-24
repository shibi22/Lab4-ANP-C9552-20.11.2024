import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add elements to the ArrayList
        numbers.add(18);
        numbers.add(15);
        numbers.add(28);
        numbers.add(25);
        numbers.add(38);

        // Calculate the sum of even numbers
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {   // Check if the number is even
                sum += num;
            }
        }

        
        System.out.println("Sum of even numbers: " + sum);  // Print the result
    }
}
