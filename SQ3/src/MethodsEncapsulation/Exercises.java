package MethodsEncapsulation;

/**
 * Created by MDS1728 on 5/18/2017.
 */
public class Exercises {

    public int randomNumber (int limit){
        int number;
        number = ((int)(Math.random() * limit)) +1;
        return number;
    }

    public void divBy3and5 (int limit){
       for (int i=0; i <= limit; i++){
           if(i % 3 == 0 && i % 5 == 0){
               System.out.print(i+" ");
           }
       }

    }

    public int addallValuesfromarray(int[] numbers) {
        int sum = 0;
        for (int temp:numbers){
            sum +=temp;
        }
        return sum;
    }

    public int countVowelsstring (String str){
        int counter = 0;
        String vowels = "aeiouAEIOU";
        for (int i=0; i <  str.length(); i++){
          if(vowels.contains((Character.toString(str.charAt(i))))){
            }
        }
        return counter;

    }
}

