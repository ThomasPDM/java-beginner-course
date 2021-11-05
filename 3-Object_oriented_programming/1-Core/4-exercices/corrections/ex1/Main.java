public class Main {
    public static void main(String[] args) {
        Car car = new Car("Clio", 'V', 2019, 19000);
        car.printCarInfo();
        car.setPrice(17000);
        car.printCarInfo();
    }
}