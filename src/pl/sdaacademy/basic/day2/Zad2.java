package pl.sdaacademy.basic.day2;

public class Zad2 {

    public static void main(String[] args) {
        String a = "pro";
        String b = "programowanie";

boolean result = isCorrecyprefix(b,a);
        System.out.println(result);


    }

    private static boolean isCorrecyprefix(String input, String prefix) {
        if (StringValidator.isValid(input) && StringValidator.isValid(prefix)) {
            return input.startsWith(prefix);

        }
        return false;
    }

}
