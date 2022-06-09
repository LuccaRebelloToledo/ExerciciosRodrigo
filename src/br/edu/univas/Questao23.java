package br.edu.univas;

public class Questao23 {
    public static void main(String[] args) {
        String asterisco = "";
        for(int i = 0; i <= 10; i++){
                asterisco += "*";
            for (int j = 0; j == i; j++){
            asterisco = "";
            }
            System.out.println(asterisco);
        }
    }
}
