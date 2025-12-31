import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicates
{
    public static void main(String[] args) {
        //create a list of integers
        List<Integer> numbers = Arrays.asList(1,2,3,2,5,7,1,4,5,6,7,8,4);

         List<Integer> duplicates = numbers.stream()
             .collect(Collectors.groupingBy(e->e, Collectors.counting()))
             .entrySet().stream().
             filter(e -> e.getValue() > 1)
             .map(Map.Entry::getKey)
             .collect(Collectors.toList());

        System.out.println("Duplicate elements :"+ duplicates);

    }
}