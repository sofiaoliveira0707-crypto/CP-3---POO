package br.com.caderno.model;

import br.com.caderno.model.Caderno;

// A palavra 'extends' faz a mágica da herança acontecer!
public class CadernoUniversitario extends Caderno {

    // Atributo exclusivo do CadernoUniversitario (a mãe Caderno não tem isso)
    private int quantidadeMaterias;

    // CONSTRUTOR DA FILHA
    public CadernoUniversitario(String cor, String material, double tamanho, int quantidadeMaterias) {
        // 'super' repassa cor, material e tamanho para o construtor da mãe resolver!
        super(cor, material, tamanho);

        // E aqui a filha resolve o que é dela:
        this.setQuantidadeMaterias(quantidadeMaterias);
    }

    // Getter e Setter específicos da filha
    public int getQuantidadeMaterias() {
        return this.quantidadeMaterias;
    }

    private void setQuantidadeMaterias(int quantidadeMaterias) {
        if (quantidadeMaterias > 0) {
            this.quantidadeMaterias = quantidadeMaterias;
        } else {
            System.out.println("❌ Erro de Validação: A quantidade de matérias é inválida!");
        }
    }
}