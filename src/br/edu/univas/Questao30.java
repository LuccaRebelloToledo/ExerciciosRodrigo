package br.edu.univas;

import java.util.Arrays;
import java.util.Scanner;

public class Questao30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primeiraArray = new int[10];
        int[] segundaArray = new int[10];
        int[] terceiraArray = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite os numeros da primeira fileira: ");
            primeiraArray[i] = scanner.nextInt();
            System.out.println("Digite os numeros da segunda fileira: ");
            segundaArray[i] = scanner.nextInt();

            terceiraArray[i] = primeiraArray[i] * segundaArray[i];
        }
        System.out.println("Os valores multiplicados da primeira e segunda fileira ficou: " + Arrays.toString(terceiraArray));
    }
}
