/**
 * Created by emka15 on 2017-04-03.
 */
public class Test {
    //arays för Sort
    static int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
    static double[] numbers2 = {12.3, 11.2, 99.2, 1.23, 33.12, 1.22, 1.24};
    static String[] words = {"Emil", "Tilton", "Albin", "Dicklas", "Jonas", "jonnte", "My"};
    static String[] words2 = {"Aa", "aAaa", "aaaaaaaaa", "aaaaaaaA", "aaaaaaa"};

    //arays flr Binär_sökning
    static int[] numbers3 = {0,0,0,0};
    static int[] numbers4 = {};

    //artays för Quicksort
    static int[] numbers5 = {2,157,3,4,8,22,6,1,44,124,12,5};
    static int[] numbers6 ={};
    static int[] numbers7 = {};

    public static void main(String[]arg){
        // test Sort
       Sort.selSort(numbers);
       Sort.printArray(numbers);
       Sort.selSort(numbers2);
       Sort.printArray(numbers2);
       Sort.selSortStringLength(words);
       Sort.printArray(words);
       Sort.selSortStringAlpha(words);
       Sort.printArray(words);
       Sort.selSortStringAlpha(words2);
       Sort.printArray(words2);
       System.out.println("Test Sort klar" + "\n");

       //test Binär_sökning
       Binär_sökning.BinarySearch(numbers, 42);
       System.out.println(numbers[3]);
       Binär_sökning.BinarySearch(numbers3, 1);
       Binär_sökning.BinarySearch(numbers4, 12);
       System.out.println("Test Binär sökning klar" + "\n");

       //test Quicksort
        Quicksort.sort(numbers5);
        Quicksort.sort(numbers6);


    }
}
