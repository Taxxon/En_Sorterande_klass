/**
 * Created by Emil Käck on 2017-04-03.
 */
public  class Sortering {


    public static int[] sortInt(int[] numbers) {
        //Sorterar en intArrey med minsta först
        int smallest;

        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[index]) {
                    index = j;
                }
                smallest = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = smallest;
            }
        }

        return numbers;
    }

    public static double[] sortDouble(double[] numbers) {
        // Sorterar en doubleArrey med minsta först
        double minsta;

        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[index]) {
                    index = j;
                }
                minsta = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = minsta;
            }
        }
        return numbers;
    }


    public static void printIntArray(int []  numbers) {
        //Skriver ut en IntArray med ett mellanrum
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }

    public static void printDoubleArray(double []  numbers) {
        //Skriver ut en DoubleArray med ett mellanrum
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}




