package HomeWork7;

public class Pryamougolnik extends Figura{
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    void Square() {
        int square = this.length * this.width;
        System.out.println("Площадь прямоугольника: " + square);
    }

    @Override
    double Perimeter() {
        int perimeter = (this.length + this.width) * 2;
        System.out.println("Периметр прямоугольника: " + perimeter);
        return perimeter;
    }
}
