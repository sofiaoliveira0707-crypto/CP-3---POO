package br.com.caderno.main;

import br.com.caderno.model.Caderno;
import br.com.caderno.model.CadernoUniversitario;
import br.com.caderno.model.Garrafa;
import br.com.caderno.model.Objeto;
import br.com.caderno.model.Preenchivel;

public class SistemaPrincipal {
    public static void main(String[] args) {

        System.out.println("=== CADERNO: Classe Abstrata ===");


        Objeto[] estante = new Objeto[] {
            new Caderno("A5", "Papel kraft"),
            new CadernoUniversitario("A4", "Papel reciclado")
        };

        for (Objeto o : estante) {
            o.exibirTipo();
            System.out.println(o.calcularPaginas());
            System.out.println("---");
        }

        System.out.println();
        System.out.println("=== CADERNO: Teste de Interfaces ===");

        CadernoUniversitario universitario = new CadernoUniversitario("A4", "Papel pautado");
        Garrafa garrafa = new Garrafa("Azul");

        Preenchivel[] preenchiveis = new Preenchivel[] {
            universitario,
            garrafa
        };

        for (Preenchivel p : preenchiveis) {
            p.preencher(85);
            System.out.println("---");
        }

        System.out.println();
        System.out.println("=== Múltiplos Tipos ===");
        System.out.println("Universitário é um Objeto? " + (universitario instanceof Objeto));
        System.out.println("Universitário é Preenchivel? " + (universitario instanceof Preenchivel));
        System.out.println("Garrafa é um Objeto? " + (Objeto.class.isInstance(garrafa)));
        System.out.println("Garrafa é Preenchivel? " + (garrafa instanceof Preenchivel));

        System.out.println();
        System.out.println("Nível da garrafa: " + garrafa.getNivelAgua() + " ml");
    }
}