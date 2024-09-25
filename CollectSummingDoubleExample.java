package Java8CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectSummingDoubleExample {
    public static void main(String[] args) {
        List<Double> numbers= Arrays.asList(1.0,2.0,3.0,4.0,5.0);
        double sum = numbers.stream().collect(Collectors.summingDouble(Double::doubleValue));
        System.out.println(sum);
    }
}
