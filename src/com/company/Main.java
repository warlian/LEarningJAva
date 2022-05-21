package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //declare your variables
        var invoice = new Invoice("My invoice",new Date(), 123.45);
        System.out.println(invoice);
    }
}
