package Interfaces;

/**
 * Created by MDS1728 on 6/2/2017.
 */
public class ClassA implements InterA{

    public ClassA(){
        System.out.println(strMessage);
        displayInfo (identifyInterface());
    }

    @Override
    public void displayInfo(String strMessage) {
        System.out.println(strMessage);
    }

}
