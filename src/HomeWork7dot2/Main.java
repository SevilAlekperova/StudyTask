package HomeWork7dot2;

public class Main {
    public static void main(String[] args) {
        PrintPosition director = new Director("");
        PrintPosition rabochiy = new Rabochiy("");
        PrintPosition buhgalter = new Buhgalter("");

        director.printPosition();
        rabochiy.printPosition();
        buhgalter.printPosition();

    }
}
