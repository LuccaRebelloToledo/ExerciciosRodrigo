package br.edu.univas;

import java.util.Scanner;

public class Questao27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado, somaNumeroDivisiveisPor3 = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("Por favor digite um número: ");
            numeroDigitado = scanner.nextInt();
            if(numeroDigitado % 3 == 0){
                somaNumeroDivisiveisPor3 += numeroDigitado;
            }
        }
        System.out.println("A soma dos números digitados divisíveis por 3 é igual a: " + somaNumeroDivisiveisPor3);
    }
}
