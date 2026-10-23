package br.com.caderno.model;

public class Caderno extends Objeto {

    private int numeroFolhas;

    public Caderno(String tamanho, String material) {
        super(tamanho, material);
        this.setNumeroFolhas(100);
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou um Caderno");
    }

    @Override
    public String calcularPaginas() {
        int paginas = this.getNumeroFolhas() * 2;
        return "Páginas disponíveis: " + paginas + " (2 páginas por folha).";
    }

    public int getNumeroFolhas() {
        return this.numeroFolhas;
    }

    private void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }
}