package br.edu.univas;

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int contadorPares = 0, contadorImpares = 0, numeroEscolhido;
    for(int i = 0; i < 20; i++){
        System.out.print("Por favor digite um número: ");
        numeroEscolhido = scanner.nextInt();
        if(numeroEscolhido % 2 == 0){
            contadorPares++;
        } else {
            contadorImpares++;
        }
        }
    System.out.println("Dentre os números digitados, " + contadorPares + " são pares e " + contadorImpares + " são ímpares!");
    }
}
