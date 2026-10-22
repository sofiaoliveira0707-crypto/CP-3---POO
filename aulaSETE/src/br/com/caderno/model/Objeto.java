package br.com.caderno.model;

public class Objeto {

    private String tamanho;
    private String material;

    public Objeto(String tamanho, String material) {
        this.setTamanho(tamanho);
        this.setMaterial(material);
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public String getMaterial() {
        return this.material;
    }

    private void setTamanho(String tamanho) {
        if (tamanho != null && !tamanho.trim().isEmpty()) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Erro: O tamanho informado é inválido!");
        }
    }

    private void setMaterial(String material) {
        if (material != null && !material.trim().isEmpty()) {
            this.material = material;
        } else {
            System.out.println("Erro: O material informado é inválido!");
        }
    }

    public String descrever() {
        return "Objeto de " + this.material + " no tamanho " + this.tamanho + ".";
    }
}