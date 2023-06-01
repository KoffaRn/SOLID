package org.koffa.uppgift4;

public class InkPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing done");
    }

    @Override
    public void scan() {
        System.out.println("Scanning done");
    }
}
