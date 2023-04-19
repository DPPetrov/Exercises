package Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());


        Car car = new Car();



        while (input > 0) {

            String[] n = sc.nextLine().split("\\s++");
            car.setModel(n[0]);
            car.setBrand(n[1]);
            car.setHorsePower(Integer.parseInt(n[2]));

            input--;
        }

        System.out.printf("\nThe car is: %s %s - %s HP.%n", car.getModel(), car.getBrand(), car.getHorsePower());


    }
}
