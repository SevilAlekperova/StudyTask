package HomeWork6;

public class CreditCard {
    int accountNumber;
    int currentAccountBalance;

    void sum(int balancePlus) {
        currentAccountBalance = currentAccountBalance + balancePlus;
    }

    void minus(int balanceMinus) {
        currentAccountBalance = currentAccountBalance - balanceMinus;
    }

    void info() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий остаток на счету: " + currentAccountBalance);
    }
}
