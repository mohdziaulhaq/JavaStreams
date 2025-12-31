
import java.util.*;
        import java.util.stream.*;
        public class SumOfEvenOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, Integer> sums = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2 == 0,
                        Collectors.summingInt(Integer::intValue)));

        int evenSum = sums.get(true);
        int oddSum = sums.get(false);

        System.out.println("Sum of even numbers:"+evenSum);
        System.out.println("Sum of odd numbers:"+oddSum);
    }
}