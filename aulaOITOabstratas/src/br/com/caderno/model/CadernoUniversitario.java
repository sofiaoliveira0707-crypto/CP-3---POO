package br.com.caderno.model;

public class CadernoUniversitario extends Objeto {

    private int quantidadeMaterias;

    public CadernoUniversitario(String tamanho, String material) {
        super(tamanho, material);
        this.setQuantidadeMaterias(10);
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
}