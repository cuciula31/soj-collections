public class Main {

    public static void main(String[] args) {
        //Se vor itera elementele impare din lista
        ListExample.iterateAll();

        //Se va itera exemplul de la Set
        SetExample.addAndIterate();

        //Se vor itera cheile din Map, unde valorile sunt mai mai mari sau egale cu 10
        MapExample.addAndIterate();

        //Se vor itera doar numerele intregi distincte din lista
        ListMultipleExercises.distinctIntegers().forEach(System.out::println);

        //Se vor itera numerele intregi sortate si distincte din lista
        ListMultipleExercises.sortedList().forEach(System.out::println);

        //Se va itera lista de mai sus doar ca sub forma unui Set de String
        ListMultipleExercises.setOfStrings().forEach(System.out::println);

        //Pentru ultimul exercitiu, cel cu Map nu am reusit sa gandesc o solutie optima, o sa incerc sa actualizez clasa cu exercitii curand :(
    }

}
