import java.util.Arrays;
import java.util.Scanner;

public class SumEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddSum = 0;
        int evenSum = 0;

        int[] numArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < numArr.length; i++) {

            if(numArr[i] % 2 == 0){

                evenSum += numArr[i];
            }else{

                oddSum += numArr[i];
            }
        }

        System.out.println(evenSum - oddSum);
    }
}
