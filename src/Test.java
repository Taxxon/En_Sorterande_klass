/**
 * Created by emka15 on 2017-04-03.
 */
public class Test {
    static int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
    static double[] numbers2 = {12.3, 11.2, 99.2, 1.23, 33.12, 1.22, 1.24};
    static String[] words = {"Emil", "Tilton", "Albin", "Dicklas", "Jonas", "jonnte", "My"};
    static String[] words2 = {"Aa", "aAaa", "aaaaaaaaa", "aaaaaaaA", "aaaaaaa"};

    public static void main(String[]arg){
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
    }
}
