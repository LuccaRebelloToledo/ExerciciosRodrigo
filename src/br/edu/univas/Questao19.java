package br.edu.univas;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMaria = 0, contadorJoao = 0, contadorJose = 0, escolhaVoto, quantidadeDeAlunos = 50;

        for (int i = 0; i < quantidadeDeAlunos; i++){
            System.out.println("Por favor vote em um dos candidatos: ");
            System.out.println("1 - Maria");
            System.out.println("2 - João");
            System.out.println("3 - José");
            escolhaVoto = scanner.nextInt();

            switch (escolhaVoto){
                case 1: contadorMaria++;
                break;
                case 2: contadorJoao++;
                break;
                case 3: contadorJose++;
                break;
            }
        }
        if(contadorMaria > contadorJoao && contadorMaria > contadorJose){
            System.out.println("O vencedor das eleições é: Maria");
        } else if(contadorJoao > contadorMaria && contadorJoao > contadorJose){
            System.out.println("O vencedor das eleições é: João");
        } else {
            System.out.println("O vencedor das eleições é: José");
        }
    }
}
