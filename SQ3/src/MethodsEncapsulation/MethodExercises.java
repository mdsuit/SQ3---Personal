package MethodsEncapsulation;

/**
 * Created by MDS1728 on 5/18/2017.
 */
public class MethodExercises {
    public static void main(String[] args) {

            //Instantiate my exercise class
        Exercises myExercises  = new Exercises();

        //Gererate random number
        int number = myExercises.randomNumber(100);
        System.out.println(number);

        //Output all numbers divisable by 5 and 3
        myExercises.divBy3and5(100);


        //Return the sum of an interger array
        int[] numbers = {1,4,23,12,56,27,78,2};
        number = myExercises.addallValuesfromarray(numbers);
        System.out.println("\nSum="+number);


        //number of vowels in a string
        String str = ("My name is Michael");
        number = myExercises.countVowelsstring(str);
        System.out.println("Vowels= "+number);


    }
}
