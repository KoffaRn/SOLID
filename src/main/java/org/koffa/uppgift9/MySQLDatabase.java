package org.koffa.uppgift9;

public class MySQLDatabase implements Database {
    @Override
    public void connectToDb() {
        //Connect to Database
    }

    @Override
    public String getFromDb() {
        return "MysQL data";
    }

    @Override
    public void closeConnectionToDb() {
        //Terminate connection to MySQL
    }
}
