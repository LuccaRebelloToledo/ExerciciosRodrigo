package br.edu.univas;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Renda Mensal: ");
        double rendaMensal = scanner.nextDouble();
        while (rendaMensal < 200) {
            System.out.print("Digite uma Renda Válida: ");
            rendaMensal = scanner.nextDouble();
        }
        String aliquotaDeIR = "";
        if (rendaMensal <= 1903.98) {
            aliquotaDeIR = "ISENTO";
        } else if (rendaMensal <= 2826.66){
            aliquotaDeIR = "7,5%";
        } else if (rendaMensal <= 3751.05){
            aliquotaDeIR = "15,0%";
        } else if (rendaMensal <= 4664.68){
            aliquotaDeIR = "22,5%";
        } else {
            aliquotaDeIR = "27,5%";
        }
        System.out.println("Você se enquadrou na faixa de: " + aliquotaDeIR + " do IR.");
    }
}

