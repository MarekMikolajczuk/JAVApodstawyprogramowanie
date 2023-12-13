package pl.sdaacademy.basic.day2;

public class Zad13 {
    public class Task13 {
        public static void main(String[] args) {
            int[] inputs = new int[3];
            inputs[0] = 12;
            inputs[1] = 7;
            inputs[2] = 19;

            int[] inputs2 = {12, 7, 19, 3};
            int minValue = getMinValue(inputs2);
            System.out.println("minValue: " + minValue);
            int maxValue = getMaxValue(inputs2);
            System.out.println("maxValue: " + maxValue);
            int sum = sum(inputs2);
            System.out.println("sum: " + sum);
        }

        private static int getMinValue(int[] ints) {
            int currentMinValue = ints[0];
/*        for(int i = 1; i < ints.length; i++) {
            if(ints[i] < currentMinValue) {
                currentMinValue = ints[i];
            }
        }*/
            for (int element : ints) {
                if (element < currentMinValue) {
                    currentMinValue = element;
                }
            }
            return currentMinValue;
        }

        private static int getMaxValue(int[] ints) {
            int currentMaxValue = ints[0];
            for (int element : ints) {
                if (element > currentMaxValue) {
                    currentMaxValue = element;
                }
            }
            return currentMaxValue;
        }

        private static int sum(int[] ints) {
            //return Arrays.stream(ints).sum();
            //return Arrays.stream(ints).min().getAsInt();
            int sum = 0;
            for (int element : ints) {
                sum += element;
            }
            return sum;
        }

    }
}
