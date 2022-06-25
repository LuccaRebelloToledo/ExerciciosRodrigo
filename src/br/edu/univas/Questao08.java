package br.edu.univas;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int temp;
        temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;
        System.out.println("X= " + numberOne + " e " + "Y= " + numberTwo);
    }
}
