package HomeWork7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Krug krug = new Krug();
        Pryamougolnik pryamougolnik = new Pryamougolnik();
        Treugolnik treugolnik = new Treugolnik();

        System.out.print("Введите радиус круга: ");
        krug.setRadius(scanner.nextDouble());
        krug.Square();
        krug.Perimeter();

        System.out.print("Введите длину прямоугольника: ");
        pryamougolnik.setLength(scanner.nextInt());
        System.out.print("Введите ширину прямоугольника: ");
        pryamougolnik.setWidth(scanner.nextInt());
        pryamougolnik.Square();
        pryamougolnik.Perimeter();

        System.out.print("Введите первую сторону треугольника (A): ");
        treugolnik.setSideA(scanner.nextInt());
        System.out.print("Введите вторую сторону треугольника (B): ");
        treugolnik.setSideB(scanner.nextInt());
        System.out.print("Введите третью сторону треугольника (С): ");
        treugolnik.setSideC(scanner.nextInt());
        treugolnik.Square();
        treugolnik.Perimeter();

        double[] array = new double[5];
        double perimeterArray = 0;

        for (int i = 0; i < array.length; i ++){
            System.out.print("Введите радиус круга: ");
            krug.setRadius(scanner.nextDouble());
            perimeterArray = perimeterArray + krug.Perimeter();
        }
        System.out.println("Периметр массива: " + perimeterArray);
    }
    }
