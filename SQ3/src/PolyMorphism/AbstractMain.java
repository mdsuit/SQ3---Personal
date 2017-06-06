package PolyMorphism;

/**
 * Created by MDS1728 on 5/26/2017.
 */
public class AbstractMain extends AbstractSQLClass {

    public String Driver;

    public void instaniateDriver(String str){}

    public static void instantiateSQLDriver (String connString){
connString = "SQL Server";
    }

    public static void main(String[] args) {
        System.out.println(selectStatement("Select...."));
        System.out.println(updateStatement("Update..."));
        System.out.println(insertStatement("Insert...."));
        System.out.println(deleteStatement("Delete..."));
    }
}
