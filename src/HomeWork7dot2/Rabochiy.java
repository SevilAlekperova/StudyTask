package HomeWork7dot2;

public class Rabochiy extends Person implements PrintPosition {
    public Rabochiy(String position) {
        super(position);
    }

    @Override
    public void printPosition() {
        System.out.println("Это рабочий!");
    }
}
