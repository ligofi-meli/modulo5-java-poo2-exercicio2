package gomes.filipe;

import java.util.HashMap;
import java.util.Map;

public class Maratona {
    HashMap<Integer, Participante> pequenoCircuito = new HashMap<>();
    HashMap<Integer, Participante> circuitoMedio = new HashMap<>();
    HashMap<Integer, Participante> grandeCircuito = new HashMap<>();

    int inscricao = 1;

    public void inscreveMaratonista(String categoria, Participante participante) {
        switch (categoria) {
            case "pequeno":
                pequenoCircuito.put(inscricao++, participante);
                if (participante.getIdade() <= 18) {
                    participante.setValorInscricao(1300.0);
                } else {
                    participante.setValorInscricao(1500.0);
                }
                break;
            case "médio":
                circuitoMedio.put(inscricao++, participante);
                if (participante.getIdade() <= 18) {
                    participante.setValorInscricao(2000.0);
                } else {
                    participante.setValorInscricao(2300.0);
                }
                break;
            case "grande":
                grandeCircuito.put(inscricao++, participante);
                if (participante.getIdade() >= 18) {
                    participante.setValorInscricao(2800.0);
                } else {
                    System.out.println("Não é permitido menor de idade na categoria Grande Circuito!");
                }
                break;
        }
    }

    public void mostrarListaPorCategoria(String categoria) {
        switch (categoria) {
            case "pequeno":
                System.out.println("--- Categoria Pequeno Circuito ---");
                for (Map.Entry<Integer, Participante> participanteEntry: pequenoCircuito.entrySet()) {
                    System.out.println(participanteEntry.getKey() + " - " + participanteEntry.getValue().toString());
                }
                break;
            case "médio":
                System.out.println("--- Categoria Circuito Médio ---");
                for (Map.Entry<Integer, Participante> participanteEntry: circuitoMedio.entrySet()) {
                    System.out.println(participanteEntry.getKey() + " - " + participanteEntry.getValue().toString());
                }
                break;
            case "grande":
                System.out.println("--- Categoria Circuito Grande ---");
                for (Map.Entry<Integer, Participante> participanteEntry: grandeCircuito.entrySet()) {
                    System.out.println(participanteEntry.getKey() + " - " + participanteEntry.getValue().toString());
                }
                break;
        }
    }

    public void cancelaInscricao(String categoria, int numeroInscricao) {
        switch (categoria) {
            case "pequeno":
                System.out.println("Inscricao removida: " + pequenoCircuito.remove(numeroInscricao));
                break;
            case "médio":
                System.out.println("Inscricao removida: " + circuitoMedio.remove(numeroInscricao));
                break;
            case "grande":
                System.out.println("Inscricao removida: " + grandeCircuito.remove(numeroInscricao));
                break;
        }
    }
}
