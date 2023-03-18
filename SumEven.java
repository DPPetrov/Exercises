import java.util.Arrays;
import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 0){

                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
