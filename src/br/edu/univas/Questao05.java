package br.edu.univas;

import java.util.Random;

public class Questao05 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(8);
        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Teusday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> {
            }
        }
    }
}
