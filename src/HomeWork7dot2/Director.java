package HomeWork7dot2;

public class Director extends Person implements PrintPosition {
    public Director(String position) {
        super(position);
    }

    @Override
    public void printPosition() {
        System.out.println("Это директор!");
    }
}
