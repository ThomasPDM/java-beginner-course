public class Car {
    private String name;
    private char model;
    private int year;
    private double price;


    public void printCarInfo() {
        System.out.println(this.name + " " + this.model + " " + this.year + " " + this.price);
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public Car(String name, char model, int year, double price) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }
}
