package Exceptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by MDS1728 on 6/5/2017.
 */
public class BasicTryCatch {
    public static void main(String[] args) {
        System.out.println("Michael");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            System.out.println("Any message to the user running this program");
            e.printStackTrace();
        }
        System.out.println("Suit");
    }
}

