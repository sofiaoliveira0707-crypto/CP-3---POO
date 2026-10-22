package br.com.caderno.main;

import br.com.caderno.model.Caderno;
import br.com.caderno.model.Objeto;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Objeto objetoGenerico = new Objeto("Médio", "Plástico");
        Caderno meuCaderno = new Caderno("A4", "Papel reciclado", "Couro");

        System.out.println(objetoGenerico.descrever());
        System.out.println(meuCaderno.descrever());

        Objeto polimorfico = new Caderno("A5", "Papel pautado", "Papelão");
        System.out.println(polimorfico.descrever()); 
    }
}