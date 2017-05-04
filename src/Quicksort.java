/**
 * Created by emka15 on 2017-04-24.
 */
public class Quicksort {

    private static int[] numbers;

    public static int[] sort(int[] data) {
        //gör så numbers är global
        numbers = data;
        quicksort(0, data.length-1);
        return numbers;
    }

    private static void quicksort(int min, int max) {
        //sorterar en array med quicksort
        int i = min;
        int j = max;

        try {
            int pivot = numbers[i+(j - i)/2];
            while (i <= j) {
                while (numbers[j] > pivot) {
                    j--;
                }
                while (numbers[i] < pivot) {
                    i++;
                }
                if (i <= j) {
                    swap(i, j);
                    i++;
                    j--;
                }
            }
            printArray(numbers);
        } catch (ArrayIndexOutOfBoundsException a){
            System.out.println("\n" + "Arrayen är tom");
        }
        // börjar om qiucksort på de värden som inte är på rätt plats
        if (min < j){
            quicksort(min, j);
        }
        if (i < max){
            quicksort(i, max);
        }
    }

    private static void printArray(int[] data){
        // Metod som skriver ut arrayen
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");
    }

    private static void swap(int min, int max) {
        //Byter plats på min och max så dem är på rätt sida
        int tmp = numbers[min];
        numbers[min] = numbers[max];
        numbers[max] = tmp;
    }
}
