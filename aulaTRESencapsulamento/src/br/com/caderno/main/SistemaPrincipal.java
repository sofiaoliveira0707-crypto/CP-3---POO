package br.com.caderno.main;

import br.com.caderno.model.Caderno;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema Caderno --- \n");

        // INSTANCIAÇÃO (Usando o Construtor!)
        Caderno caderno1 = new Caderno("Azul", "Papel reciclado", 28.0);
        System.out.println(">>> Alterando cor do Caderno 1:");
        caderno1.alterarCor("Vermelho");

        Caderno caderno2 = new Caderno("Preto", "Couro", 21.0);
        System.out.println(">>> Alterando cor do Caderno 2:");
        caderno2.alterarCor("Verde");

        System.out.println("\n--- Status dos Cadernos ---");
        System.out.println("Caderno 1: " + caderno1.getCor() + " | Material: " + caderno1.getMaterial() + " | Tamanho: " + caderno1.getTamanho() + " cm");
        System.out.println("Caderno 2: " + caderno2.getCor() + " | Material: " + caderno2.getMaterial() + " | Tamanho: " + caderno2.getTamanho() + " cm");

        System.out.println("\n--- Alterando Tamanhos ---");
        System.out.println("Alterando tamanho do caderno 1 (valor válido)...");
        caderno1.alterarTamanho(21.0);

        System.out.println("\nAlterando tamanho do caderno 2 (valor inválido)...");
        caderno2.alterarTamanho(-5); // O sistema DEVE bloquear!
    }
}