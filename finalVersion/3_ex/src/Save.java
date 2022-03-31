public class Save {
    public static void main(String[] args) {
        int[] intArr = {1, 7, 3, 1, 2, 6, 7, 8, 8, 5, 5, 1, 2, 9, 9, 8, 7, 7, 3, 7, 3, 7, 7, 3, 3, 3, 3, 5, 7, 8, 8, 4};
        int[] intFirstPlayer = {1, 2};
        int[] intSecondPlayer = {7, 3};
        int FirstCount = 0;
        int SecondCount = 0;
        for (int i = 0; i < intArr.length; ++i) {
            if (intArr[i] == intFirstPlayer[0]){
                for (int j = 0; j < intFirstPlayer.length; ++j) {
                    if (intArr[i+1] == intFirstPlayer[1]) {
                        FirstCount++;
                        i++;
                        break;
                    }

                }
            }
        }

        for (int i = 0; i < intArr.length; ++i) {
            if (intArr[i] == intSecondPlayer[0]){
                for (int j = 0; j < intSecondPlayer.length; ++j) {
                    if (intArr[i+1] == intSecondPlayer[1]) {
                        SecondCount++;
                        i++;
                        break;
                    }

                }
            }
        }
        if (FirstCount > SecondCount){
            System.out.println("Первый игрок победил");
        }
        else {
            System.out.println("Второй игрок победил");
        }

    }
}
