package by.sevil.studytask;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int k = scanner.nextInt();
        for (int i = n; i <= k; i++){
            System.out.println(i);
        }
    }
}
