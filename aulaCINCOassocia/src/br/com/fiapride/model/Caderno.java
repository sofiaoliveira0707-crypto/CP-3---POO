package br.com.fiapride.model;

public class Caderno {

    private String cor;
    private String tamanho;
    private Capa capa;

    public Caderno(String cor, String tamanho, Capa capa) {
        this.setCor(cor);
        this.tamanho = tamanho;
        this.capa = capa;
        System.out.println("Registro inicial: Um caderno de cor " + this.cor + " e tamanho " + this.tamanho);
    }

    public Caderno() {
    }

    public String getCor() {
        return this.cor;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public Capa getCapa() {
        return this.capa; //dentro dele tem material e cor, por isso nao eh string
    }

    public void atualizarCor(String novaCor) {
        this.setCor(novaCor);
    }

    private void setCor(String novaCor) {
        if (novaCor != null && !novaCor.trim().isEmpty()) {
            this.cor = novaCor;
            System.out.println("Sucesso: A cor das folhas agora é " + this.cor);
        } else {
            System.out.println("Erro de Validação: A cor informada é inválida!");
        }
    }
}