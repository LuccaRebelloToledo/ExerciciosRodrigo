package br.edu.univas;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLeitura = 30;
        int somaImpares = 0;
        int numeros;

        for(int i = 0; i < quantidadeLeitura; i++){
            System.out.print("Por favor digite um número: ");
            numeros = scanner.nextInt();
            if(numeros % 2 != 0){
                if (numeros > 22 && numeros < 100){
                    somaImpares += numeros;
                }
            }
        }
        System.out.println("A soma dos numeros impares é: " + somaImpares);
    }
}
