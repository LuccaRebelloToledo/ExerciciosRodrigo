package br.edu.univas;

public class Questao24 {
    public static void main(String[] args) {
        int somaTotal = 0;
        for(int i = 1; i <= 101; i++){
            if (i % 5 == 0){
                continue;
            } else {
                somaTotal += i;
            }
        }
        System.out.println("A soma total de 1 até 101 exceto os números múltiplos de 5 é: " + somaTotal);
    }
}
