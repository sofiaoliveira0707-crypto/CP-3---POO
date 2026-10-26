package br.com.caderno.model;

public class CadernoUniversitario extends Objeto implements Preenchivel {

    private int quantidadeMaterias;
    private int paginasPreenchidas;

    public CadernoUniversitario(String tamanho, String material) {
        super(tamanho, material);
        this.setQuantidadeMaterias(10);
    }

    @Override
    public void preencher(int quantidade) {
        if (quantidade < Preenchivel.QUANTIDADE_MINIMA || quantidade > Preenchivel.QUANTIDADE_MAXIMA) {
            System.out.println("Erro: Quantidade inválida!");
            return;
        }

        this.paginasPreenchidas = quantidade;
        System.out.println("Caderno de " + this.getMaterial() + " preenchido com " + quantidade + " páginas");
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou um Caderno Universitário");
    }

    @Override
    public String calcularPaginas() {
        int paginas = this.getQuantidadeMaterias() * 20;
        return "Páginas disponíveis: " + paginas + " (20 páginas por matéria).";
    }

    public int getQuantidadeMaterias() {
        return this.quantidadeMaterias;
    }

    private void setQuantidadeMaterias(int quantidadeMaterias) {
        this.quantidadeMaterias = quantidadeMaterias;
    }

    public int getPaginasPreenchidas() {
        return this.paginasPreenchidas;
    }
}