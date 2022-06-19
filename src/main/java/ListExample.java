import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {


    private static List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    public static void iterateAll(){
        list.stream()
                .filter(e -> e%2!=0)
                .forEach(System.out::println);
    }

}
