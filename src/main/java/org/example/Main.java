package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(25,5));
        System.out.println(calc.mult(25,5));
        System.out.println(calc.pow(25,5));
    }
}