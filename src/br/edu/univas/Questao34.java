package br.edu.univas;

import java.util.Scanner;

public class Questao34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] turmaA = new float[30];
        float[] turmaB = new float[30];

        float notasTurmaA = 0, mediaTurmaA, mediaTurmaB, notasTurmaB = 0;

        for (int i = 0; i < turmaA.length; i++){
            System.out.print("Digite as notas da turma A: ");
            turmaA[i] = scanner.nextFloat();
            notasTurmaA += turmaA[i];
        }
        for (int i = 0; i < turmaB.length; i++){
            System.out.print("Digite as notas da turma B: ");
            turmaB[i] = scanner.nextFloat();
            notasTurmaB += turmaB[i];
        }
        mediaTurmaA = notasTurmaA / 30;
        mediaTurmaB = notasTurmaB / 30;
        System.out.printf("Média turma A: %.1f", mediaTurmaA);
        System.out.println();
        System.out.printf("Média turma B: %.1f", mediaTurmaB);
    }
}
