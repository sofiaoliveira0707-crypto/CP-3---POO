package br.com.caderno.model;

public class Caderno extends Objeto {

    private String materialCapa;

    public Caderno(String tamanho, String material, String materialCapa) {
        super(tamanho, material);

        this.setMaterialCapa(materialCapa);
    }

    public String getMaterialCapa() {
        return this.materialCapa;
    }

    private void setMaterialCapa(String materialCapa) {
        if (materialCapa != null && !materialCapa.trim().isEmpty()) {
            this.materialCapa = materialCapa;
        } else {
            System.out.println("Erro: O material da capa é inválido!");
        }
    }

    @Override
    public String descrever() {
        return "Caderno " + this.getTamanho() + " de " + this.getMaterial()
                + " com capa de " + this.materialCapa + ".";
    }
}