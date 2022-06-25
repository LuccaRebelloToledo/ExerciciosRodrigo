package br.edu.univas;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        while(idade < 0) {
            System.out.print("Digite uma idade válida: ");
            idade = scanner.nextInt();

        }
        String categoria;
        if(idade <= 7) {
            categoria = "Infantil A";
        } else if (idade <= 10) {
            categoria = "Infantil B";
        } else if (idade <= 13){
            categoria = "Juvenil A";
        } else if (idade <= 17) {
            categoria = "Juvenil B";
        } else if (idade <= 60) {
            categoria = "Adulto";
        } else {
            categoria = "Sênior";
        }
        System.out.println("Você pertence a categoria " + categoria + "!");
    }
}
