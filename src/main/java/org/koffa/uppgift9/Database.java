package org.koffa.uppgift9;

public interface Database {
    public void connectToDb();
    public String getFromDb();
    public void closeConnectionToDb();
}
