package Java8CollectorsClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CollectJoiningExample {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai","Delhi","pune","Chennai");
        String cityjoin = cities.stream().collect(Collectors.joining(";"));

        System.out.println(cityjoin);
    }
}
