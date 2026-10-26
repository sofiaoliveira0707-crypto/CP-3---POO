package br.com.caderno.model;

public interface Preenchivel {
    int QUANTIDADE_MINIMA = 0;
    int QUANTIDADE_MAXIMA = 200;

    void preencher(int quantidade);
}