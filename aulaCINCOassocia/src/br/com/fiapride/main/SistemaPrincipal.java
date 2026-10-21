package br.com.fiapride.main;

import br.com.fiapride.model.Caderno;
import br.com.fiapride.model.Capa;

public class SistemaPrincipal {
    public static void main(String[] args) {

        Capa minhaCapa = new Capa("metal", "verde");
        Caderno meuCaderno = new Caderno("cinza", "Grande", minhaCapa);

        //  PASSO 4: teste imprimindo um dado do objeto associado
        System.out.println("Material da capa do caderno: " + meuCaderno.getCapa().getMaterial());
    }
}