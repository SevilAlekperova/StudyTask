package by.sevil.studytask;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] arg) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел равно: " + sum);
    }
}
