package HomeWork7;

public class Krug extends Figura{
    private double radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void Square() {
        double square = 3.14 * Math.pow(this.radius, 2);
        System.out.println("Площадь круга: " + square);
    }

    @Override
    double Perimeter() {
        double perimeter = 2 * 3.14 * this.radius;
        System.out.println("Периметр круга: " + perimeter);
        return perimeter;
    }
}
