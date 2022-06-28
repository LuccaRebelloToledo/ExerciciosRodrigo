package br.edu.univas;

import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeVendas = 0;
        float valorTotalDasVendas = 0, valorDaVenda;
        do{
            System.out.println("Qual o valor de sua venda? ");
            valorDaVenda = scanner.nextInt();
            if(valorDaVenda != -1) {
                quantidadeDeVendas++;
                valorTotalDasVendas += valorDaVenda;
            }
        } while (valorDaVenda != -1);
        System.out.println("Você efetuou " + quantidadeDeVendas + " venda(s) no dia!");
        System.out.printf("O valor total dessas vendas resultaram em: R$%.2f", valorTotalDasVendas);
    }
}
