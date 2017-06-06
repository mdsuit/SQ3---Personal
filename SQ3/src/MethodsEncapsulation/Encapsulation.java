package MethodsEncapsulation;

/**
 * Created by MDS1728 on 5/17/2017.
 */
public class Encapsulation {

    private String message = "Encapsulation Hello";

    //Encapsulation Mehtods
    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {

        // now we are setting rules
        if (value.toUpperCase().contains("NO")) {
            message = message;
        } else {
            message = value;
        }
    }

    //End encapsulation method
    public void printMessage() {
        System.out.println(message);
    }
}


