package br.com.caderno.main;

import br.com.caderno.model.CadernoUniversitario;

public class SistemaPrincipal {
    public static void main(String[] args) {

        CadernoUniversitario meuCaderno =
                new CadernoUniversitario("Azul", "Papel reciclado", 28.0, 10);

        // Métodos herdados da mãe (Caderno):
        meuCaderno.atualizarCor("Vermelho");
        System.out.println("Material: " + meuCaderno.getMaterial());

        // Método exclusivo da filha:
        System.out.println("Matérias: " + meuCaderno.getQuantidadeMaterias());
    }
}