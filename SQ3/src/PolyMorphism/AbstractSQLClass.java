package PolyMorphism;

/**
 * Created by MDS1728 on 5/26/2017.
 */
public abstract class AbstractSQLClass {

    //empty method for instantiating the SQL driver
    public abstract void instaniateDriver(String connectingString);

    //select statemen
    public static String selectStatement(String sql) {
        return "We ran the select statement.....";
    }
        //update statement
    public static String updateStatement(String sql) {
        return "We updated 10 records.....";
    }
        //Insert statement
    public static String insertStatement(String sql) {
        return "We inserted 10 records.....";
    }
        //delete statement
    public static String deleteStatement(String sql){
        return "We deleted 10 records.....";

    }
}

