package br.edu.univas;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisVelho = " ";
        int maisVelho = 0;
        for (int i = 0; i < 3; i++){
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite seu ano de nascimento: ");
            int anoNascimento = scanner.nextInt();
            scanner.nextLine();

            if (i == 0 || anoNascimento < maisVelho){
                nomeMaisVelho = nome;
                maisVelho = anoNascimento;
            }
        }
        System.out.println("O mais velho é: " + nomeMaisVelho);
        int idade = 2022 - maisVelho;
        System.out.println("A idade do mais velho é: " + idade);
    }
}
