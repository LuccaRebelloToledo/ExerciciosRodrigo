package br.edu.univas;

public class Questao17 {
    public static void main(String[] args) {
            // 4 anos = 8 semestres
        // alteração de 5% a cada 6 meses
        float valorMensalidade = 1000.0f;
        int quantidadeDeSemestres = 8;
        for(int i = 0; i < 8; i++){
            if(i == 0) {
                valorMensalidade = valorMensalidade;
            } else {
                valorMensalidade += (valorMensalidade * 0.05);
            }
        }
        System.out.printf("O valor da mensalidade no último semestre será de: %.2f", valorMensalidade);
    }
}
