package br.edu.univas;

import java.util.Arrays;
import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] primeiraArray = new int[10];
        int[] segundaArray = new int[10];
        int[] terceiraArray = new int[10];

        for(int i = 0; i < primeiraArray.length; i++){
            System.out.println("Digite os numeros da primeira fileira: ");
            primeiraArray[i] = scanner.nextInt();
            System.out.println("Digite os numeros da segunda fileira: ");
            segundaArray[i] = scanner.nextInt();
        }

        for(int i = 0; i < terceiraArray.length; i++){
            int j = 9;
            terceiraArray[i] = primeiraArray[i] * segundaArray[j - i];
        }

        System.out.println(Arrays.toString(primeiraArray));
        System.out.println(Arrays.toString(segundaArray));
        System.out.println(Arrays.toString(terceiraArray));
    }
}
