package ClassesObjects;

/**
 * Created by MDS1728 on 5/9/2017.
 */
public class ShirtMain {

    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();

        myShirt.colorCode = 'G';
        yourShirt.colorCode = 'R';

        //Print out the values for each object
        System.out.println("myShirt colorCode = "+myShirt.colorCode);
        System.out.println("yourShirt colorCode = "+yourShirt.colorCode);
        System.out.println("----------------------------");

        //Do some realignmnet
        myShirt = yourShirt;

        // Do some new assignments
        myShirt.colorCode = 'G';
        System.out.println("myShirt colorCode (before) = "+myShirt.colorCode);
        yourShirt.colorCode = 'R';
        System.out.println("myShirt colorCode (after) = "+myShirt.colorCode);
        System.out.println("yourShirt colorCode (after) = "+yourShirt.colorCode);
    }
}
