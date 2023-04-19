import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(numbers.stream()

                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

        System.out.println(numbers.stream()

                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

    }
}
