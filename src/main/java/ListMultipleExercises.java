import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMultipleExercises {


    private static List<Integer> list = Arrays.asList(7,4,5,2,1,2,4,1);

    public static List<Integer> distinctIntegers(){
        return list.stream().distinct().toList();
    }

    public static List<Integer> sortedList(){
        return list.stream().sorted().toList();
    }

    public static Set<String> setOfStrings(){
        return sortedList().stream().map(n -> Integer.toString(n)).collect(Collectors.toSet());
    }




}
