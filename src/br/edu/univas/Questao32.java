package br.edu.univas;

import java.util.Arrays;
import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[30];
        int notas = 0;
        int mediaGeral;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Por favor, digite as notas: ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        for(int j = 1; j < numbers.length; j++){
            numbers[numbers.length - 1] = 0;
            if(numbers[0] == numbers[j]){
                numbers[j] = 0;
            }
        }
        numbers[0] = 0;
        for (int number : numbers) {
            notas += number;
        }
        mediaGeral = (notas / numbers.length);

        System.out.println(Arrays.toString(numbers));
        System.out.println("Media geral da turma é: " + mediaGeral);
    }
}
