package com.company;

public class Main {

    public static void main(String[] args) {
        calculateInterestOnPrincipal(1000);

    }

    public static void calculateInterestOnPrincipal(int principal){
        for (int i = 1; i < 4; i++){
            int interest = principal * i / 100;
            System.out.println("your interest at a rate of " + i + " percent is " + interest);
        }

        System.out.println("===============");

        for (int j = 3; j > 0; j--){
            int interest = principal * j / 100;
            System.out.println("your interest at a rate of " + j + " percent is " + interest);
        }
    }


}
