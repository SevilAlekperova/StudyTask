package HomeWork8;

public class Dantist extends Doctor {

    @Override
    void treat() {
        System.out.println("Согласно выбранному плану лечения необходима первоначальная консультация врача-дантиста," +
                " с последющим назначением лечения!");
    }
}
