package HomeWork8;

public class Buhgalter extends Person implements PrintPosition {
    public Buhgalter(String position) {
        super(position);
    }

    @Override
    public void printPosition() {
        System.out.println("Это бухгалтер!");
    }
}
