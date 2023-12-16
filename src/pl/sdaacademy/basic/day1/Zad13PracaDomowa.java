package pl.sdaacademy.basic.day1;

import java.util.Scanner;

public class Zad13PracaDomowa {
    /*Napisz program, który wczytuje od użytkownika liczby całkowite, do momentu aż zostanie
podana liczba 0 (wartość ta jest pomijana w dalszych operacjach), następnie wyliczy i wyświetli:
a) średnią arytmetyczną podanych liczb;
b) ilość wszystkich podanych liczb;
c) ilość liczb parzystych.*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert digit: ");
        int number = scanner.nextInt();
        numberCounter(number);


       /* int counter = 0;
        int even = 0;
        int sum = 0;
        int number;
        do {

            System.out.println("Please insert digit: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            counter++;
            sum += number;
            if (number == 0) {
                counter--;
                even--;
            }
            if (number % 2 == 0) {
                even++;
            }
        } while (number != 0);

        System.out.println("Total Number Of Digits: " + counter);
        System.out.println("Total Number Of Even Digits:" + even);
        System.out.println("Arithmetic Average: " + (double) sum / counter);*/

    }

    public static void numberCounter(int number) {
        int counter = 0;
        int even = 0;
        int sum = number;
        do {

            System.out.println("Please insert digit: ");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            counter++;
            sum += number;

            if (number % 2 == 0) {
                even++;
            }
        } while (number != 0);

        System.out.println("Total Number Of Digits: " + counter);
        System.out.println("Total Number Of Even Digits:" + even);
        System.out.println("Arithmetic Average: " + (double) sum / counter);

    }


}
