package com.training;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Git Training Lab");

        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("10 - 4 = " + calculator.subtract(10, 4));
    }
}
