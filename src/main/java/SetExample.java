import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {

    private static Set<String> set = new HashSet<>();
    private static String string = "Cuvant";

    //Se va itera doar o singura data

    public static void addAndIterate(){
        set.addAll(Arrays.asList(string,string,string));

        set.forEach(System.out::println);
    }

}
