package Exceptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by MDS1728 on 6/5/2017.
 */
public class ThrowsException {

    /* Throwing exception back to main
    public void syncApplication (int seconds) throws Exception {
        TimeUnit.SECONDS.sleep(seconds);
    }
    */

    //This is the correct way
    //Always resolve your Exceptions at the point of exceptions

    public void syncApplication(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

}
