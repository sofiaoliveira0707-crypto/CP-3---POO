package br.com.caderno.main;

import br.com.caderno.model.Caderno;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // TESTE 1: A forma correta (Nascimento legalizado)
        Caderno meuCaderno = new Caderno("Azul", "Papel reciclado", 28.0);

        // TESTE 2: Usando os comportamentos públicos (passam pela validação)
        meuCaderno.atualizarCor("Vermelho");
        meuCaderno.atualizarCor("");          // ❌ bloqueado pela regra
        meuCaderno.atualizarTamanho(-5);      // ❌ bloqueado pela regra

        // TESTE 3: Tentando burlar o sistema (descomente UMA linha por vez para ver o erro)
        //Caderno cadernoFantasma = new Caderno();
        // 🛑 ERRO DE COMPILAÇÃO: "The constructor Caderno() is undefined"

        // meuCaderno.setCor("Verde");
        // 🛑 ERRO DE COMPILAÇÃO: o método setCor é private
    }
}