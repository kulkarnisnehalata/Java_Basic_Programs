package Java8CollectorsClass;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CollectToListExample {
    public static void main(String[] args) {

        Arrays Array = null;
        List<String> cities = Array.asList("Mumbai", "Delhi","Banglore", "Chennai");
        List<String> citylist = cities.stream().collect(Collectors.toList());

        System.out.println(citylist);
    }
}
