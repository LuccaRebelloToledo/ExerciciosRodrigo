package br.edu.univas;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Por favor digite seu peso: ");
        float peso = scanner.nextFloat();

        float imc = (peso / (altura * altura));

        System.out.println("Seu IMC é: " + imc);
        if(imc < 18.5) System.out.print("Abaixo do peso");
        else if (imc < 24.9) System.out.print("Peso normal");
        else if(imc < 29.9) System.out.print("Sobrepeso");
        else if(imc < 34.9) System.out.print("Obesidade grau 1");
        else if(imc < 39.9) System.out.print("Obesidade grau 2");
        else System.out.print("Obesidade grau 3");
    }
}
