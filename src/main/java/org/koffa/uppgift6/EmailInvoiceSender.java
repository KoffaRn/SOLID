package org.koffa.uppgift6;

public class EmailInvoiceSender implements InvoiceSender {

    @Override
    public void sendInvoice(Invoice invoice) {
        if(invoice == null) throw new IllegalArgumentException("Invoice can't be null");
        if(invoice.getCustomer() == null) throw new IllegalArgumentException("Customer can't be null");
        if(invoice.getCustomer().getEmail().isBlank()) throw new IllegalArgumentException("Customer email is not set");
        if(invoice.getAmount() <= 0) throw new IllegalArgumentException("Can't send invoice for negative or zero amount");
        System.out.println("Sent invoice for " + invoice.getAmount() + " to " + invoice.getCustomer().getEmail());
    }
}