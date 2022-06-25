package br.edu.univas;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu Sexo(0 para mulher - 1 Para Homem): ");
        int sexo = scanner.nextInt();
        System.out.print("Informe sua altura: ");
        float altura = scanner.nextFloat();
        float pesoIdeal;

        if(sexo == 0){
            pesoIdeal = (62.1f * altura) - 44.7f;
        } else {
            pesoIdeal = (72.7f * altura) - 58f;
        }
        System.out.printf("O peso ideal para sua altura é: %.1f", pesoIdeal);
    }
}
