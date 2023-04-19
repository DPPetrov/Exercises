public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setBrand("Chevrolet");
        car.setBrand("Impala");
        car.setHorsePower(390);

        System.out.println(String.format("The car is: %s %s - %d HP", car.getBrand(), car.getModel(), car.getHorsePower()));
    }
}
