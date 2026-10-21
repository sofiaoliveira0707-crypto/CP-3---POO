package br.com.caderno.main;

// Importamos a classe Caderno para que o sistema a reconheça
import br.com.caderno.model.Caderno;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro caderno (Objeto 1)
        Caderno caderno1 = new Caderno("Azul", "Papel reciclado", 28.0);
        System.out.println("Alterando cor do caderno 1");
        caderno1.alterarCor("Vermelho");

        // Criando o segundo caderno (Objeto 2)
        Caderno caderno2 = new Caderno("Preto", "Couro", 21.0);
        System.out.println("Alterando cor do caderno 2");
        caderno2.alterarCor("Verde");

        System.out.println("--- Sistema Caderno ---");
        System.out.println("Caderno 1: " + caderno1.cor + " | Material: " + caderno1.material + " | Tamanho: " + caderno1.tamanho + " cm");
        System.out.println("Caderno 2: " + caderno2.cor + " | Material: " + caderno2.material + " | Tamanho: " + caderno2.tamanho + " cm");

        System.out.println("Alterando tamanho do caderno 1");
        caderno1.alterarTamanho(21.0);
        System.out.println("Alterando tamanho do caderno 2 (valor inválido)");
        caderno2.alterarTamanho(-5);

    }
}