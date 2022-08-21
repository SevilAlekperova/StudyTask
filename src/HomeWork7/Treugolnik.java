package HomeWork7;

public class Treugolnik extends Figura {
    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    void Square() {
        double poluPerimeterTreugolnika = (this.sideA + this.sideB + this.sideC) / 2;
        double square = Math.sqrt(poluPerimeterTreugolnika * (poluPerimeterTreugolnika - sideA) *
                (poluPerimeterTreugolnika - sideB) * (poluPerimeterTreugolnika - sideC));
        System.out.println("Площадь треугольника: " + square);
    }

    @Override
    double Perimeter() {
        double perimeter = this.sideA + this.sideB + this.sideC;
        System.out.println("Периметр треугольника: " + perimeter);
        return perimeter;
    }
}
