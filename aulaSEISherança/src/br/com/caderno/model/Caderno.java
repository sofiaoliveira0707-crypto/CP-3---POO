package br.com.caderno.model;

public class Caderno {

    // 1. Atributos sempre privados (Encapsulamento)
    private String cor;
    private String material;
    private double tamanho; // altura em cm

    // 2. O CONSTRUTOR (O Cartório)
    public Caderno(String cor, String material, double tamanho) {
        this.setCor(cor);
        this.material = material;
        this.setTamanho(tamanho);
        System.out.println("Registro inicial: Um caderno de " + this.material
                + " nasceu com a cor " + this.cor + " e " + this.tamanho + " cm");
    }

    // 3. Getters (Apenas leitura)
    public String getCor() {
        return this.cor;
    }

    public String getMaterial() {
        return this.material;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    // 4. COMPORTAMENTOS PÚBLICOS
    public void atualizarCor(String novaCor) {
        System.out.println("Solicitada troca de cor da capa do caderno de " + this.material);
        this.setCor(novaCor);
    }

    public void atualizarTamanho(double novoTamanho) {
        System.out.println("Solicitada troca de tamanho do caderno de " + this.material);
        this.setTamanho(novoTamanho);
    }

    // 5. SETTERS PRIVADOS (validação interna)
    private void setCor(String novaCor) {
        if (novaCor != null && !novaCor.trim().isEmpty()) {
            this.cor = novaCor;
            System.out.println("Sucesso: A cor agora é " + this.cor);
        } else {
            System.out.println("Erro: A cor informada é inválida!");
        }
    }

    private void setTamanho(double novoTamanho) {
        if (novoTamanho > 0) {
            this.tamanho = novoTamanho;
            System.out.println("Sucesso: O tamanho agora é " + this.tamanho + " cm");
        } else {
            System.out.println("Erro: O tamanho informado é inválido!");
        }
    }

    // O material é IMUTÁVEL: não existe setMaterial()!
}