public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Chevrolet";
        car.model = "Impala";
        car.horsePower = 390;

        System.out.println(String.format("The car is: %s %s - %d HP", car.brand, car.model, car.horsePower));
    }
}
