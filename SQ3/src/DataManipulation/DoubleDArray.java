package DataManipulation;

/**
 * Created by MDS1728 on 5/24/2017.
 */
public class DoubleDArray {
    public static void main(String[] args) {
        String[][] numbers = new String[3][7];

        for (int row =0; row < numbers.length; row++){
            for (int col = 0; col < numbers[row].length; col++){
                numbers[row][col] = String.valueOf(row)+String.valueOf(col);
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println(" ");
        }
    }

    // Create a random double dimension array
    //minimum size = 5x5 maximum 10x10
    //fill the array with random numbers 0-100
    //print out the largest number
}
