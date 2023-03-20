import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numsArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int[] condensedArr = new int[numsArr.length - 1];

    }
}
