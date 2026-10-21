package br.com.caderno.model;

import br.com.caderno.model.Caderno;

public class CadernoUniversitario extends Caderno {

    private int quantidadeMaterias;

    public CadernoUniversitario(String cor, String material, double tamanho, int quantidadeMaterias) {
        
        super(cor, material, tamanho);

        this.setQuantidadeMaterias(quantidadeMaterias);
    }

    public int getQuantidadeMaterias() {
        return this.quantidadeMaterias;
    }

    private void setQuantidadeMaterias(int quantidadeMaterias) {
        if (quantidadeMaterias > 0) {
            this.quantidadeMaterias = quantidadeMaterias;
        } else {
            System.out.println("Erro: A quantidade de matérias é inválida!");
        }
    }
}