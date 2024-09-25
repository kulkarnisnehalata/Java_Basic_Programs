package Java8CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSummingLongExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        int sum = Math.toIntExact(numbers.stream().collect(Collectors.summingLong(Integer::intValue)));
        System.out.println(sum);
    }
}
