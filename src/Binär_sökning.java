/**
 * Created by Emil Käck on 2017-04-10.
 */
public class Binär_sökning {

    Sort sortera = new Sort();

    public static int BinarySearch(int[] data,int item){

        //metod som söker ett tal med binärsökning
        int length = data.length - 1;
        int first = 0;
        int middle =0;

        //tittar om arrayen är tom och skriver det om den är tom (try catch)
        try {
            // söker up tallet du söker
            while (data[middle] != item) {
                if (first > length) {
                    middle = -1;
                    break;
                }
                middle = (length + first) / 2;
                if (item == data[middle]) {
                    break;
                } else if (data[middle] < item) {
                    first = middle + 1;
                } else if (data[middle] > item) {
                    length = length - 1;
                }
            }
            //skriver ut indexet och skickar tillbaka det
            System.out.println(middle);
            return middle;
        } catch (ArrayIndexOutOfBoundsException i){
            //Skriver ut att arrayen är tom
            System.out.println("Arrayen är tom");
            return -1;
        }
    }
}
