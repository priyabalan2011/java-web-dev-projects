package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD=new CD();
        DVD myDVD=new DVD("2023 Info");


        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.writeData("This is my first data");
        System.out.println(myCD.readData());

        myCD.writeData("This is my second data");
        System.out.println(myCD.readData());

    }
}