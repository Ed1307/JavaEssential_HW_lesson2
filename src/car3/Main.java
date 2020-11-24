package car3;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(1992);
        Car c3 = new Car(1993, 150.0);
        Car c4 = new Car(1994, 200.0, 1000);
        Car c5 = new Car(1992, 300.0, 1000, "red");
    }
}
