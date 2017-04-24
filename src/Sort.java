/**
 * Created by Emil Käck on 2017-04-03.
 */
public  class Sort {


    public static int[] selSort(int[] numbers) {
        //Sorterar en intArrey med minsta först
        int smallest;

        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[index]) {
                    index = j;
                }
                //Byter ut det minsta med talet som man ska byta med (i)
                smallest = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = smallest;
            }
        }

        return numbers;
    }

    public static double[] selSort(double[] numbers) {
        // Sorterar en doubleArrey med minsta först
        double smallest;

        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] < numbers[index]) {
                    index = j;
                }
                smallest = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = smallest;
            }
        }
        return numbers;
    }

    public static String[] selSortStringLength(String[] words){
        // En metod som sorterar en stringArrey fårn kortaste till längsta
        String smallest;

        for (int i = 0; i < words.length; i++){
            int index = i;
            for (int j = 0; j < words.length; j++) {
                String word = words[j];
                if (word.length() >= words[i].length() ) {
                    index = j;
                }
                smallest = words[index];
                words[index] = words[i];
                words[i] = smallest;
            }
        }
        return words;
    }

    public static String[] selSortStringAlpha(String[] words){
        // Sorterar en StringArrey i bokstavsårdning
        String smallest;

        for (int i =0; i < words.length; i++){
            int index = i;
            for (int j = 0; j < words.length; j++) {
                String word = words[j];
                // Den sorterar så att först bokstäver sen uppercase sen sist längden.
                if (word.compareTo(words[i]) > 0){
                    index = j;
                    // Här har jag laggt till extra kåd som tittar vilket ord som är längst om dem båda är lika stora,för att det kårtare ska haman före.
                } else if (word.compareTo(words[i]) == 0 && word.length() <= words[i].length()) {
                        index = j;
                }
                smallest = words[index];
                words[index] = words[i];
                words[i] = smallest;
            }
        }

        return words;
    }


    public static void printArray(int []  numbers) {
        //Skriver ut en IntArray med ett mellanrum
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }

    public static void printArray(double []  numbers) {
        //Skriver ut en DoubleArray med ett mellanrum
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }

    public static void printArray(String []  words) {
        //Skriver ut en DoubleArray med ett mellanrum
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
}




