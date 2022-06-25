package br.edu.univas;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é seu nome? ");
        String nome = scanner.next();
        System.out.print("Quantas horas você trabalhou? ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.print("Valor ganho por hora trabalhada: ");
        float ganhoPorHora = scanner.nextFloat();

        float salario = horasTrabalhadas * ganhoPorHora;
        System.out.println("Sr(a) " + nome + " irá receber R$" + salario);
    }
}
