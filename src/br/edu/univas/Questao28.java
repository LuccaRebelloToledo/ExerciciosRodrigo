package br.edu.univas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Questao28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numerosSorteados = new int[6];
        int[] numerosApostados = new int[6];
        int numerosIguais = 0;
        int aux;

        for(int i = 0; i < numerosSorteados.length; i++) {
            numerosSorteados[i] = random.nextInt(1, 60);
            System.out.println(Arrays.toString(numerosSorteados));

            System.out.print("Por favor digite um número: ");
            aux = scanner.nextInt();

            if(aux == 0){
                System.out.print("Por favor digite um número diferente de zero: ");
                scanner.nextInt();
            } else {
                numerosApostados[i] = aux;
            } if (numerosApostados[i] == numerosSorteados[i]){
                numerosIguais++;
            }
        }
        if(numerosIguais == 6){
            System.out.println("Parabéns!!! Você ja pode se aposentar!");
        } else if (numerosIguais == 5){
            System.out.println("Você acertou 5 números! Vá até uma agência para retirar seu prêmio!");
        } else if (numerosIguais == 4){
            System.out.println("Você acertou 4 números! Vá até uma loterica para retirar seu prêmio!");
        } else if (numerosIguais == 0){
            System.out.println("Não foi dessa vez :( Tente outra vez!");
        } else {
            System.out.println("Você acertou apenas " + numerosIguais + " número(s)! Tente outra vez!");
        }
    }
}

