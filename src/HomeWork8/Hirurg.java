package HomeWork8;

public class Hirurg extends Doctor {
    @Override
    void treat() {
        System.out.println("Согласно выбранному плану лечения необходима первоначальная консультация врача-хирурга," +
                " далее в зависимости от результатов обследвания назначение операции!");
    }
}
