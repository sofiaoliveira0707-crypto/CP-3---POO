package br.com.caderno.model;

public class Caderno {

    private String cor;
    private String material;
    private double tamanho; // altura em cm

    public Caderno(String cor, String material, double tamanho) {
        this.setCor(cor);
        this.material = material;
        this.setTamanho(tamanho);
        System.out.println("Registro inicial: Um caderno de " + this.material
                + " nasceu com a cor " + this.cor + " e " + this.tamanho + " cm");
    }

    public String getCor() {
        return this.cor;
    }

    public String getMaterial() {
        return this.material;
    }

    public double getTamanho() {
        return this.tamanho;
    }


    public void atualizarCor(String novaCor) {
        System.out.println("Solicitada troca de cor da capa do caderno de " + this.material);
        this.setCor(novaCor); // Chama o método privado que contém a regra de segurança
    }

    public void atualizarTamanho(double novoTamanho) {
        System.out.println("Solicitada troca de tamanho do caderno de " + this.material);
        this.setTamanho(novoTamanho);
    }


    private void setCor(String novaCor) {
        // Regra de negócio: a cor não pode ser nula nem vazia
        if (novaCor != null && !novaCor.trim().isEmpty()) {
            this.cor = novaCor;
            System.out.println("Sucesso: A cor agora é " + this.cor);
        } else {
            System.out.println("Erro de Validação: A cor informada é inválida!");
        }
    }

    private void setTamanho(double novoTamanho) {
        // Regra de negócio: o tamanho deve ser maior que zero
        if (novoTamanho > 0) {
            this.tamanho = novoTamanho;
            System.out.println("Sucesso: O tamanho agora é " + this.tamanho + " cm");
        } else {
            System.out.println("Erro de Validação: O tamanho informado é inválido!");
        }
    }
}