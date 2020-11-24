package car4;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(1994);
        Car c3 = new Car(1995, 250.0);
        Car c4 = new Car (1991, 280.0, 600);
        Car c5 = new Car (1993, 400.0, 600, "black");
    }
}
