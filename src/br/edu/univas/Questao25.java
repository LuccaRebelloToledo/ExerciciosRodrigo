package br.edu.univas;

import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorNumerosPares = 0, somaNumerosPares = 0, leituraNumero;

        do {
            System.out.println("Por favor digite um número: ");
            leituraNumero = scanner.nextInt();
            if(leituraNumero % 2 == 0){
                contadorNumerosPares++;
                somaNumerosPares += leituraNumero;
            }
        } while(contadorNumerosPares != 10);
        System.out.println("A soma dos 10 números pares é: " + somaNumerosPares);
    }
}
