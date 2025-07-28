import java.util.ArrayList;
import java.util.List;

public class TraditionalVsStreams {
    public static void main(String[] args) {
        // Find sum of squares of even numbers
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(23);
        listOfNumbers.add(22);
        listOfNumbers.add(21);
        listOfNumbers.add(20);
        listOfNumbers.add(25);
        listOfNumbers.add(27);

        // traditional approach
        int sumOfEvenNumbers = 0;
        for (Integer integer : listOfNumbers) {
            if( integer %2 == 0){
                int square = integer*integer;
                sumOfEvenNumbers = sumOfEvenNumbers + square;
            }
        }
        System.out.println("Sum of Squares of Even numbers using Traditional approach :"+sumOfEvenNumbers);

        // Using streams
        int sumOfEvenNumbersUsingStrems = listOfNumbers.stream()
            .filter( number -> number%2 == 0)
            .mapToInt(number -> number * number).sum();

        System.out.println("Sum of Squares of Even numbers using Streams approach :"+sumOfEvenNumbersUsingStrems);

    }
}
