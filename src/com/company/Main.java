package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat myCat;
        myCat = new Cat( "Ethan", "Sassy", "5", 'f', "5612 Apache Rd", true, 10.0);
        System.out.println("The name of my cat is: " + myCat.getPetName());
        myCat.whiskers(true);
        System.out.println("Does this cat have whiskers? ");
        System.out.println(myCat.getAge());






    }
}