package HomeWork6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CreditCard[] arrayOfCreditCard = new CreditCard[3];
        for (int i = 0; i < arrayOfCreditCard.length; i++){
            arrayOfCreditCard[i] = new CreditCard();
            System.out.print("Введите номер счета " + i + " карты: ");
            arrayOfCreditCard[i].accountNumber = scanner.nextInt();
            System.out.print("Введите текущий остаток на счету " + i + " карты: ");
            arrayOfCreditCard[i].currentAccountBalance = scanner.nextInt();
        }
        int accountRefill;
        System.out.print("Введите сумму для пополнения: ");
        accountRefill = scanner.nextInt();
        arrayOfCreditCard[0].sum(accountRefill);
        arrayOfCreditCard[1].sum(accountRefill);
        System.out.print("Введите сумму снятия со счета: ");
        int withdrawalFromAccount = scanner.nextInt();
        arrayOfCreditCard[2].minus(withdrawalFromAccount);
        for (int i = 0; i < arrayOfCreditCard.length; i++) {
            arrayOfCreditCard[i].info();
        }
    }
}
