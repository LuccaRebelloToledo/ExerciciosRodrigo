package br.edu.univas;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the price of gasoline? ");
        float gasoline = scanner.nextFloat();
        System.out.print("What is the price of ethanol? ");
        float ethanol = scanner.nextFloat();
        double average = (ethanol / gasoline) * 100;
        if (average > 70) {
            System.out.println("Is it more worth fueling up with gasoline!");
        } else {
            System.out.println("Is it more worth fueling up with ethanol!");
        }
    }
}