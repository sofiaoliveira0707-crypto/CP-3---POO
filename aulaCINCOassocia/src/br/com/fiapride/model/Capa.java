package br.com.fiapride.model;

public class Capa {

    private String material;
    private String cor;

    public Capa(String material, String cor) {
        this.material = material;
        this.cor = cor;
        System.out.println("Capa criada: " + this.material + " na cor " + this.cor);
    }

    public String getMaterial() {
        return this.material;
    }

    public String getCor() {
        return this.cor;
    }
}