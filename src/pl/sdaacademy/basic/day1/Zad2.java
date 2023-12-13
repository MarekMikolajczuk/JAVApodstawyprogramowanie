package pl.sdaacademy.basic.day1;

/*Napisz program, który pobierze od użytkownika średnicę okręgu (typu float), a następnie obliczy
obwód oraz pole tego okręgu. Do obliczeń przyjmij:
a) π = 3,14;
b) wartość stałej π z klasy Math.
Przykład:
Please insert diameter: 2,5
Circumference Of A Circle: 7.8500004
Area Of A Circle: 4.90625
*/

import java.util.Scanner;

public class Zad2 {

    private static final double PI = Math.PI;

    public static void main(String[] args) {
        /*
        1. pobierz dane
        2. oblicz obwód
        3. oblicz pole
         */
        float radius = getDiameterFromUser() / 2;
        double calculatedCircumference = calculateCircumference(radius);
        double calculatedArea = calculateArea(radius);
        System.out.println("Circumference Of A Circle: " + calculatedCircumference);
        System.out.println("Area Of A Circle: " + calculatedArea);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static double calculateCircumference(float radius) {
        // 2 * pi * r
        return 2 * PI * radius;
    }

    private static double calculateArea(float radius) {
        // pi * r^2
        return PI * Math.pow(radius, 2);
    }
}
