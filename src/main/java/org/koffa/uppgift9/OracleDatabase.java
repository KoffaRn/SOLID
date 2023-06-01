package org.koffa.uppgift9;

public class OracleDatabase implements Database {
    @Override
    public void connectToDb() {
        //Connect to Oracle
    }

    @Override
    public String getFromDb() {
        return "Oracle data";
    }

    @Override
    public void closeConnectionToDb() {
        //Close Oracle connection
    }
}
