import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {

            int number = Integer.parseInt(sc.nextLine());
            array[i] = number;
        }

        for (int i = array.length - 1; i >= 0 ; i--) {

            System.out.println(array[i] + " ");
        }
    }
}
