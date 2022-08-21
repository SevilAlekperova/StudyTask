package HomeWork8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient();
        pacient.setName("Alex");
        pacient.setAge(24);
        pacient.setTreatmentPlan(2);

        switch (pacient.getTreatmentPlan()) {
            case 1:
                Hirurg hirurg = new Hirurg();
                hirurg.treat();
                pacient.setDoctor("Врач-хирург Алексеев Т.О.");
                System.out.println(pacient.getDoctor());
                break;
            case 2:
                Dantist dantist = new Dantist();
                dantist.treat();
                pacient.setDoctor("Врач-дантист Ковалев А.А.");
                System.out.println(pacient.getDoctor());
                break;
            case 3:
                Terapevt terapevt = new Terapevt();
                terapevt.treat();
                pacient.setDoctor("Врач-терапевт Петров В.К.");
                System.out.println(pacient.getDoctor());
                break;
        }
    }
}
