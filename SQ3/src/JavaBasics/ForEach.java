package JavaBasics;

/**
 * Created by MDS1728 on 5/8/2017.
 */
public class ForEach {
    public static void main(String[] args) {
        double[] numbers = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45, 99.993, 11123};

        //use for each to traverse all the elements of the array

        for (double temp:numbers) {
            System.out.println(temp);


        }
    }
}