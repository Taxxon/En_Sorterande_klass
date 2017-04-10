/**
 * Created by emka15 on 2017-04-03.
 */
public class Test {
    static int[] numbers = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
    static double[] numbers2 = {12.3, 11.2, 99.2, 1.23, 33.12, 1.22, 1.24};

    public static void main(String[]arg){
       Sortering.sortInt(numbers);
       Sortering.printIntArray(numbers);
       Sortering.sortDouble(numbers2);
       Sortering.printDoubleArray(numbers2);
    }
}
