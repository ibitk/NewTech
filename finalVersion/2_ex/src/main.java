//Следующий код выводит только одно часто встречающееся число, как сделать вывод неслькольких чисел я не понимаю
import java.util.*;

class main {

    static int mostFrequent(int arr[], int n)
    {
        Arrays.sort(arr);

        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        return res;
    }
    public static void main (String[] args) {

        int arr[] = {2, 5, 6, 3, 1, 5, 5, 6, 6, 7};
        int n = arr.length;
        for (int h = 0; h < n; h++) {
            System.out.print(arr[h]+" ");
        }
        System.out.printf("-> Исходный массив%nНаиболее часто встречающееся число: "+ mostFrequent(arr,n));

    }
}
//Следующий, закоментированный кусок кода выводит коллекцию, где идентификатор - это каждое уникальное число массива,
//а значение - это количество его повторений.
//import java.util.Arrays;
//        import java.util.function.Function;
//        import static java.util.stream.Collectors.*;
//
//public class main {
//
//    public static void main(String[] args){
//        System.out.println("result : " +
//                Arrays.stream(new Integer[]{5, 6, 3, 9, 1, 1, 1, 5, 7, 10, 16, 0, 1})
//                        .collect(groupingBy(Function.identity(),counting())));
//    }
//}