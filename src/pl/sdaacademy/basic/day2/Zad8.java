package pl.sdaacademy.basic.day2;

public class Zad8 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    public static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        String input = "Ala MA kota!";
        String result = replaceCharacters(input);
        System.out.println(result);
//        System.out.println(input);
//        input = input.toLowerCase();
//        System.out.println(input);

//        StringBuilder sb = new StringBuilder("ala ma kota");
//        sb.append(" i psa");
//        System.out.println(sb);

    }

    private static String replaceCharacters(String input) {
        // Ala MA kota!
        //String result = "";
        StringBuilder result = new StringBuilder();
        if(StringValidator.isValid(input)) {
            for(int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) {
                    //result += String.valueOf((char) (currentChar + DIFF_UPPER_AND_LOWER));
                    result.append((char)(currentChar + DIFF_UPPER_AND_LOWER));
                } else if(currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) {
                    //result += String.valueOf((char) (currentChar - DIFF_UPPER_AND_LOWER));
                    result.append((char)(currentChar - DIFF_UPPER_AND_LOWER));
                } else { //inne niz litery -> nie zmieniamy
                    //result += currentChar;
                    result.append(currentChar);
                }
            }
            //return result;
            return result.toString();
        }
        return input;
    }
}
