package br.edu.univas;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int c = scanner.nextInt();
        System.out.print("Digite o quarto valor: ");
        int d = scanner.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("A diferença entre o produto das duas primeiras váriaveis pelo produto das duas últimas variáveis é: " + diferenca);
    }
}
