package src.br.com.caderno.model;

public class Caderno {

    private String cor;
    private String material;
    private double tamanho; // altura em cm

    public Caderno(String cor, String material) {
        this.setCor(cor);
        this.setMaterial(material);
        this.setTamanho(1);
    }

    public Caderno(String cor, String material, double tamanho) {
        this.setCor(cor);
        this.setMaterial(material);
        this.setTamanho(tamanho);
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.trim().isEmpty()) {
            System.out.println("Erro de Segurança: a cor não pode ser vazia!");
        } else {
            this.cor = cor;
        }
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            System.out.println("Erro de Segurança: o material não pode ser vazio!");
        } else {
            this.material = material;
        }
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        if (tamanho > 0) {
            this.tamanho = tamanho;
        } else {
            System.out.println("Erro de Segurança: tamanho inválido bloqueado!");
        }
    }

    public void alterarCor(String novaCor) {
        if (novaCor == null || novaCor.trim().isEmpty()) {
            System.out.println("Erro: a cor não pode ser vazia.");
            return;
        }
        this.cor = novaCor;
        System.out.println("Cor alterada com sucesso. Nova cor: " + this.cor);
    }

    public void alterarTamanho(double novoTamanho) {
        if (novoTamanho <= 0) {
            System.out.println("Erro: o tamanho deve ser maior que zero.");
            return;
        }
        this.tamanho = novoTamanho;
        System.out.println("Tamanho alterado com sucesso. Novo tamanho: " + this.tamanho + " cm");
    }
}