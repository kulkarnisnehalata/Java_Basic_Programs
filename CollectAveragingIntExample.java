package Java8CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectAveragingIntExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        double avg = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);
    }
}
