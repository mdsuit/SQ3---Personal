package Inheritance;

/**
 * Created by MDS1728 on 5/25/2017.
 */
public class InheritanceClassA extends InheritanceClassB {


    String submessage = "Sub";
    int subCounter = 1;

    public static void main(String[] args) {
        identifyClass();
    }

    public static void identifyClass() {
        System.out.println("This is the subclass.");
        superDoSomething();
        //super.identifyClass();
    }

   // public void

}



