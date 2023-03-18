import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


    }
}
