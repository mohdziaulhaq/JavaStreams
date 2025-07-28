import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.*;

public class Convert_Array_To_Streams {
    public static void main(String[] args) {
        int[] intArray = {1,5,2,3,2};
        IntStream intStreamObj = Arrays.stream(intArray);
        intStreamObj.forEach(System.out::print);

        System.out.println();

        Integer[] integerArray = {5,2,1,4,5,5};
        Stream<Integer> streamObj = Stream.of(integerArray);
        streamObj.forEach(System.out::print);

    }
}
