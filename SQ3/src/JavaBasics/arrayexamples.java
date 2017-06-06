package JavaBasics;

/**
 * Created by MDS1728 on 5/4/2017.
 */
public class arrayexamples {

    public static void main(String[] args) {
        double[] numbers = {5.6, 4.5, 3.3, 13.2, 4.0, 34.33, 34.0, 45.45, 99.993, 11123};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

            System.out.println("sum=" + sum);



//3.    Print out all numbers greater than 10 but less than 100
         //   double i = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >10&& numbers[i] <100) {
                    System.out.println(numbers[i]);
                }
        }
    }
}
//4.    Print out the index of occourance of 34.33


//5.    Print out the index of the smallest number and the value

