package org.koffa.uppgift6;

public class Invoice {
    private Customer customer;
    private int amount;
    public Invoice(Customer customer, int amount) {
        this.customer = customer;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getAmount() {
        return amount;
    }
}
