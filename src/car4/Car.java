package car4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(1992, 300.0, 1000, "red");
    }

    public Car(int year) {
        this(year, 300.0, 1000, "red");
    }

    public Car(int year, double speed) {
        this(year, speed, 1000, "red");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "red");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
