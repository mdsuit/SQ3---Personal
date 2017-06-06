package ClassesObjects;

/**
 * Created by MDS1728 on 5/10/2017.
 */
public class StringClass {

    public static void main(String[] args) {
        String str = "My name is Michael";

        // look at all string methids
        System.out.println(str);

        //Change to upper case
        System.out.println(str.toUpperCase());

        //Change to lower case
        System.out.println(str.toLowerCase());

        //how long is it.
        System.out.println(str.length());

        // find the first occourance of the letter i
        System.out.println(str.indexOf('l'));

        //change to an array
        System.out.println(str.toCharArray());

        //CHange to an array
        char[] strAry = str.toCharArray();
        for(int i = 0; i<strAry.length; i++){
            if(strAry[i]  == 'c'){
                strAry[i] = '!';
                break;
            }
        }
        str=String.valueOf(strAry);
        System.out.println(str);

        /*
        //Comparing two strings
        String str2 = "My name is M!chael";{
        if (str.contains ( "My name is Michael");
        System.out.println("The two strings are the same ");
        {
        else{
        System.out.println("The two string are not the same");
        */


        //Remove a portion of the string
        System.out.println(str.substring(0,15));
        System.out.println(str.substring(2,str.length()));
    }
}
