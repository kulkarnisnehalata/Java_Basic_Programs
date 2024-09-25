package Java8CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetExample {
    public static void main(String[] args) {
        Arrays Array;
        List<String> cities = Arrays.asList("Mumbai","Delhi","Mumbai","Banglore");
        Set<String> citySet = cities.stream().collect(Collectors.toSet());

        System.out.println(citySet);
    }
}
