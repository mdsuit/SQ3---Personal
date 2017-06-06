package Interfaces;

/**
 * Created by MDS1728 on 6/2/2017.
 */
public interface InterA {
    //Interfaces are good for declaring constants
    String strMessage = "This is interface A.";

    //This is an example of an empty (Abstract) method
    //Public and abstract are understood in an interface,  any variable is a constant not a field
    void displayInfo(String value);

    //This is an example of a fully implimented  (default) method
    //must use keyword default to identify any fully implimented method
    default String identifyInterface(){
        return modifyMessage();
    }

    //This is an example of a static methid
    //Statis method can only serve the purpose of helping default methods
    static String modifyMessage(){
        return "This is "+strMessage;
    }
}
