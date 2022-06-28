package br.edu.univas;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota;
        float notas = 0;
        int quantidade = 30;
        for(int i = 0; i < quantidade; i++){
            System.out.print("Por favor digite sua nota: ");
            nota = scanner.nextFloat();
            notas += nota;
        }
        notas = notas / quantidade;
        System.out.printf("A media geral da turma é: %.1f", notas);
    }
}
