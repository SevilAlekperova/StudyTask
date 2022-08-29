package HomeWork9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        int num1 = enterFirstNumber();
        int num2 = enterSecondNumber();
        delenie(num1, num2);
    }

    public static int enterFirstNumber() {

        int num1 = 0;
        try {
            System.out.println("num1: ");
            num1 = sc.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("Error! - Please enter a number.");
        }
        return num1;
    }

    public static int enterSecondNumber() {
        int num2 = 0;
        try {
            System.out.println("num2 НЕ РАВНО НУЛЮ: ");
            num2 = sc.nextInt();
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Error! - Please enter a number.");
        }
        return num2;
    }

    public static void delenie(int num1, int num2){
        try {
            int dividedNum = num1 / num2;

            System.out.println("After division result: " + dividedNum);

        } catch (ArithmeticException e2) {
            System.out.println("Error! - You cannot divide any number with 0");
        } catch (Exception e3) {
            System.out.println("An error occurred please try again!");
        }

    }
}
