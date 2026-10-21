package br.com.fiapride.model;

public class Passageiro {
    private String nome;
    private String cpf;
    private double saldo;

    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() { return saldo; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
}