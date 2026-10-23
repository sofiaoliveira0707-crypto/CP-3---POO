package br.com.caderno.main;

import br.com.caderno.model.Caderno;
import br.com.caderno.model.CadernoUniversitario;
import br.com.caderno.model.Objeto;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("=== CADERNO: Teste de Classes Abstratas ===");
        System.out.println();

        // TESTE 1: Tentar criar Objeto direto (VAI DAR ERRO)
        // Descomente a linha abaixo para ver o erro de compilação!

        // Objeto o = new Objeto("A4", "Generico");
        // ❌ ERRO: "Cannot instantiate the type Objeto"
        // O Java bloqueia porque Objeto é um molde, não um objeto real!

        // TESTE 2: Criar objetos concretos (FUNCIONA)
        Objeto caderno = new Caderno("A4", "Papel reciclado");
        Objeto universitario = new CadernoUniversitario("A4", "Papel pautado");

        // TESTE 3: Chamar método abstrato implementado
        System.out.println("Identificação dos Objetos:");
        caderno.exibirTipo();         // Saída: Sou um Caderno
        universitario.exibirTipo();   // Saída: Sou um Caderno Universitário

        System.out.println();
        System.out.println("=== Polimorfismo com Classe Abstrata ===");

        // Array do tipo abstrato, mas os OBJETOS são instâncias das filhas concretas
        Objeto[] estante = new Objeto[] {
            new Caderno("A5", "Papel kraft"),
            new CadernoUniversitario("A4", "Papel reciclado"),
            new Caderno("A4", "Papel branco")
        };

        for (Objeto o : estante) {
            o.exibirTipo();
            System.out.println(o.calcularPaginas());
            System.out.println("---");
        }
    }
}