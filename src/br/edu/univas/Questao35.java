package br.edu.univas;

import java.util.Arrays;
import java.util.Scanner;

public class Questao35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[50];
        int aux, contador = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Por favor digite um número: ");
            aux = scanner.nextInt();
            if(aux < 0){
                numeros[i] = 0;
                contador++;
            } else {
                numeros[i] = aux;
            }
        }
        System.out.println("A quantidade de números substituídos foi: " + contador);
        System.out.println("A seguência do array ficou " + Arrays.toString(numeros));
    }
}
