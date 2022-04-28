package by.sevil.studytask;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println("Введенные числа в обратном порядке: ");
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
