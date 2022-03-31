import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    static void myMethod() {
        Random random = new Random();
        int p;

        int[] array = random.ints(1000, 10, 100000).toArray();
        ArrayList<Integer> OneSort = new ArrayList<>();
        ArrayList<Integer> TwoSort = new ArrayList<>();
        ArrayList<Integer> ThreeSort = new ArrayList<>();



        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
            p = array[i];

            if (array[i] % 2 == 1) {
                OneSort.add(p);
            } else if (array[i] == 0) {
                TwoSort.add(p);
            } else if (array[i] % 2 == 0 && array[i] != 0) {
                ThreeSort.add(p);
            }
        }

        Collections.sort(OneSort);
        ThreeSort.sort(Collections.reverseOrder());

        List<Integer> totalList = Stream.of(OneSort, TwoSort, ThreeSort)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(totalList);
    }

    public static void main(String[] args) {
        myMethod();
    }
}