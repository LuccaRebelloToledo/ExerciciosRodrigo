package br.edu.univas;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = scanner.next();

        int notas = 0;
        for(int i = 0; i < 4; i++){
            System.out.print("Digite sua nota: ");
            int nota = scanner.nextInt();
            notas += nota;
        }
        int media = notas / 4;
        if (media > 59) {
            System.out.println(name + ", você foi aprovado, parabéns!");
        } else if (media >= 40) {
            System.out.println(name + ", você está de recuperação!");
        } else {
            System.out.println(name + ", você foi reprovado... Meus pesâmes!");
        }
    }
}
