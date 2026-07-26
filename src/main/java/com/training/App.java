package com.training;

public class App {
    public static void main(String[] args) {
        // DO NOT  A NEW LINE - REPLACE THE LINE BELOW WITH YOUR OWN MESSAGE
        System.out.println("Welcome from Intern B - <ibrahim hamdi mahmoud > ");

        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));

        // DO NOT ADD A NEEPLACE THE LINE BELOW WITH YOUR OWN OPERATION
        System.out.println("20 / 4 " + calculator.divide(20 , 4 ));
    }
}
