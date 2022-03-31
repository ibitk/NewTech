import java.util.Scanner;
import java.util.*;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество бросков:");
        String numberToThrow = scanner.nextLine();
        int totalNumber = Integer.parseInt(numberToThrow);
        int firstTriplet, secondTriplet;
        Random random = new Random();
        int[] intArr = random.ints(totalNumber, 1, 7).toArray();


        int[] intFirstPlayer = new int[3];
        System.out.println("Первый игрок, введите последовательность из трех чисел:");
        for (int i = 0; i < intFirstPlayer.length; i++) {
            String firstPlayer = scanner.nextLine();
            int j = Integer.parseInt(firstPlayer);
            intFirstPlayer[i] = j;
        }

        int[] intSecondPlayer = new int[3];
        System.out.println("Второй игрок, введите последовательность из трех чисел:");
        for (int i = 0; i < intSecondPlayer.length; i++) {
            String secondPlayer = scanner.nextLine();
            int j = Integer.parseInt(secondPlayer);
            intSecondPlayer[i] = j;
        }

        if (intFirstPlayer[0] == intFirstPlayer[1] && intFirstPlayer[1] == intFirstPlayer[2]) {
            firstTriplet = 3;
        } else {
            firstTriplet = 1;
        }

        if (intSecondPlayer[0] == intSecondPlayer[1] && intSecondPlayer[1] == intSecondPlayer[2]) {
            secondTriplet = 3;
        } else {
            secondTriplet = 1;
        }

        int firstCount = 0;
        int secondCount = 0;
        for (int i = 0; i < intArr.length - 2; i += firstTriplet) {
            if (intArr[i] == intFirstPlayer[0] && intArr[i + 1] == intFirstPlayer[1] && intArr[i + 2] == intFirstPlayer[2]) {
                firstCount++;
            }
        }

        for (int i = 0; i < intArr.length - 2; i += secondTriplet) {
            if (intArr[i] == intSecondPlayer[0] && intArr[i + 1] == intSecondPlayer[1] && intArr[i + 2] == intSecondPlayer[2]) {
                secondCount++;
            }
        }
        if (firstCount > secondCount) {
            System.out.println("Первый игрок победил");
        } else if (firstCount < secondCount) {
            System.out.println("Второй игрок победил");
        } else {
            System.out.println("Ничья");
        }
        System.out.println("Счет:");
        System.out.print(firstCount + ":" + secondCount);
    }

}
