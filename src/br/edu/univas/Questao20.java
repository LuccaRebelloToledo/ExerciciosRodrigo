
package br.edu.univas;

public class Questao20 {
    public static void main(String[] args) {
        int somaPares = 0;
        for(int i = 1; i < 102; i++){
            if(i % 2 == 0){
                somaPares += i;
            }
        }
        System.out.println("A soma dos numeros pares é: " + somaPares);
    }
}
