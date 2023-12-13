package pl.sdaacademy.basic.day1;

public class Zad9 {
    public static void main(String[] args) {

    }

    private static String fizzBuzz(int number) {
        // podzielne przez 3 -> Fizz
        // podzielne przez 5 -> Buzz
        // podzielne przez 3 oraz 5 -> FizzBuzz
        // inne -> number
        //if(number % 3 == 0 && number % 5 == 0) {
        if(number % 15 == 0) {
            return "FizzBuzz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else if(number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}