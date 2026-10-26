package br.com.caderno.model;

public class Garrafa implements Preenchivel {

    private String cor;
    private int nivelAgua; // 0-1000 ml

    public Garrafa(String cor) {
        this.cor = cor;
        this.nivelAgua = 0;
    }

    @Override
    public void preencher(int quantidade) {
        if (quantidade < Preenchivel.QUANTIDADE_MINIMA || quantidade > Preenchivel.QUANTIDADE_MAXIMA) {
            System.out.println("Erro: Quantidade inválida!");
            return;
        }

        this.nivelAgua = quantidade;
        System.out.println("Garrafa " + this.cor + " preenchida com " + quantidade + " ml");
    }

    public int getNivelAgua() {
        return this.nivelAgua;
    }
}