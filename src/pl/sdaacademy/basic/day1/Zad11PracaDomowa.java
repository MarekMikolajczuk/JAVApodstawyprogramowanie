package pl.sdaacademy.basic.day1;


import java.util.Random;
import java.util.Scanner;

public class Zad11PracaDomowa {
    public static void main(String[] args) {


        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int guess =scanner.nextInt() ;

        bingo(guess,number);




    }

    public static void bingo(int guess, int number) {
        do {

            if (guess < number) {
                System.out.println("not enough, type a number");
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
            } else if (guess > number) {
                System.out.println("too much, type a number");
                Scanner scanner = new Scanner(System.in);
                guess = scanner.nextInt();
            }

        } while (guess != number);
        System.out.println("bingo");


    }
}
