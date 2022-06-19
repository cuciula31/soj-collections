import java.util.HashMap;
import java.util.Map;

public class MapExample {

    private static Map<String, Integer> map = Map.of("unu",1,
            "doi",2,
            "douazeci",20,
            "zece",10,
            "trei",3,
            "treizeci",30);


    public static void addAndIterate(){
      map.entrySet().stream().filter(entry -> entry.getValue() > 9).map(Map.Entry::getKey).forEach(System.out::println);
    }

}
