/**
 * Created by MDS1728 on 6/6/2017.
 */
public class PrimeNumbers {
    public static void main(String[] args) {
        //Method to show all prime numbers from 2-upper limit
        //Method should take input of upper limit

            int limit = 100;

            System.out.println( limit+" is not prime but ");
            for(int i=2; i < limit; i++){
                boolean isPrime = true;
                for(int p=2; p < i ; p++){
                    if(i % p == 0){
                        isPrime = false;
                        break;
                    }
                }
                //Output: 10 is not a prime number but {2,3,5,7} are
                if(isPrime)
                    System.out.print(i + " ");

            }
        }
    }