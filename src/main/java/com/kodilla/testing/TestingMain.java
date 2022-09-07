package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (calculator.add(5, 7) == 10){
            System.out.println("Add works");
        } else {
            System.out.println("Add doesn't works");
        }
        if (calculator.substract(10, 5) == 5){
            System.out.println("Substract works");
        } else {
            System.out.println("Substract doesn't works");
        }
    }
}


