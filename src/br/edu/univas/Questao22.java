package br.edu.univas;

import java.util.Scanner;

public class Questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDePartidasDisputadas = 3, golsFeitosPelaArgentina, golsFeitosPeloBrasil, contadorArgentina = 0, contadorBrasil = 0, contadorEmpate = 0;

        for (int i = 0; i < quantidadeDePartidasDisputadas; i++){
            System.out.println("Quantos gols o time Argentino marcou na partida?");
            golsFeitosPelaArgentina = scanner.nextInt();
            System.out.println("Quantos gols o time Brasileiro marcou na partida?");
            golsFeitosPeloBrasil = scanner.nextInt();

            if(golsFeitosPelaArgentina > golsFeitosPeloBrasil){
                contadorArgentina++;
            } else if (golsFeitosPeloBrasil > golsFeitosPelaArgentina) {
                contadorBrasil++;
            } else {
                contadorEmpate++;
            }
        }
        System.out.println("A seleção Argentina obteve a vítoria de " + contadorArgentina + " partida(s) contra o Brasil!");
        System.out.println("A seleção Brasileira obteve a vítoria de " + contadorBrasil + " partida(s) contra a Argentina");
        System.out.println("A quantidade de partidas empatadas entre as seleções é de " + contadorEmpate + " partida(s)!");
    }
}
