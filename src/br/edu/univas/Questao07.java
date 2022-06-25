package br.edu.univas;

import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if(number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("The sum of the even numbers is "+ sum + "!");
    }
}
