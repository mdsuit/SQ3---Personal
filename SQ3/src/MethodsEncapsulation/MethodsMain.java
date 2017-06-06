package MethodsEncapsulation;

/**
 * Created by MDS1728 on 5/17/2017.
 */
public class MethodsMain {
    public static void main(String[] args) {

        //first thing is to instatiate
        MathUtils math = new MathUtils();

        //I save the value into the same variable type as the method
        double sum = math.add(2,3);

        //I do some manipulation to the value
        System.out.println(sum);

        //I can also call methods inside another method, as long as the method data
        // type is of the same signature as the argument being passed

        System.out.println(math.add(math.add(25,40),60));

        //verify acces modifiers from instatiation
        // first we need to instatiate the newly created class
        DataVisability data = new DataVisability();

        //second we need to use our newly created object
        data.message = "No Hello"; //Reassigning vale to public fields
        System.out.println(data.message);
        data.printMessage();

        //In order to avoid direct access to data we then use encapsulation
        //you hide data whilst providing back doors with rules

    Encapsulation enc = new Encapsulation();

    //Without rules
        System.out.println(enc.getMessage());
        enc.setMessage("No Encapsulation Hello");
        System.out.println(enc.getMessage());
    }
}
