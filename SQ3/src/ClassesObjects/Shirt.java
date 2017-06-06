package ClassesObjects;

/**
 * Created by MDS1728 on 5/9/2017.
 */
public class Shirt {
    char colorCode;
    double price;
    String itemId;

    public Shirt() {}

    public Shirt(char colorCode, double price, String itemId) {
        this.colorCode = colorCode;
        this.price = price;
        this.itemId = itemId;

        printFields();
        System.out.println("-----------------");
    }

    public void printFields(){
        System.out.println("colorCode = "+colorCode);
        System.out.println("itemId ="+itemId);
        System.out.println("price ="+price);
    }
}
