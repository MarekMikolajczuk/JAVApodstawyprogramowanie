package pl.sdaacademy.basic.day1;


import java.util.Scanner;

public class Zad9PracaDomowa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwszą liczbe: ");
        float num1 = scanner.nextFloat();
        System.out.println("podaj znak działania: ");
        String acton = scanner.next();
        System.out.println("Podaj drugą liczbę: ");
        float num2 = scanner.nextFloat();

    }



    private static void calc(float num1, String action, float num2) {

        switch (action) {
                case "+":
                    System.out.println(num1 + num2);
                    break;

                case "-":
                    System.out.println(num1 - num2);
                    break;

                case "/":

                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Wrong operation");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;

                case "*":
                    System.out.println(num1 * num2);
                    break;

                default:
                    System.out.println("operator not exist");
            }


        }

    }
