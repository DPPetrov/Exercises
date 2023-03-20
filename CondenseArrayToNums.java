import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numsArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[] condensedArr = new int[numsArr.length - 1];

        while (numsArr.length > 1){

            for (int i = 0; i < condensedArr.length; i++) {

                condensedArr[i] += numsArr[i] + numsArr[i + 1];
            }

        }

        System.out.println(condensedArr[0]);
    }
}
