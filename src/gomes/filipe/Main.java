package gomes.filipe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Participante> participantes = new ArrayList<>();

        participantes.add(new Participante("000000001", "Filipe", "Gomes", "01990000001", "1990000001", "A+", 30));
        participantes.add(new Participante("000000002", "Patricia", "Abrel", "01990000002", "1990000002", "O-", 28));
        participantes.add(new Participante("000000003", "Marcelo", "Mattos", "01990000003", "1990000003", "AB+", 17));
        participantes.add(new Participante("000000004", "Anna", "Ibrahim", "01990000004", "1990000004", "A-", 21));
        participantes.add(new Participante("000000005", "Petter", "Silva", "01990000005", "1990000005", "B+", 55));
        participantes.add(new Participante("000000006", "Joanna", "Albaréz", "01990000006", "1990000006", "B-", 18));

        Maratona maratona = new Maratona();

        maratona.inscreveMaratonista("grande", participantes.get(0));
        maratona.inscreveMaratonista("médio", participantes.get(1));
        maratona.inscreveMaratonista("pequeno", participantes.get(2));
        maratona.inscreveMaratonista("médio", participantes.get(3));
        maratona.inscreveMaratonista("grande", participantes.get(4));
        maratona.inscreveMaratonista("pequeno", participantes.get(5));

        maratona.mostrarListaPorCategoria("pequeno");
        maratona.mostrarListaPorCategoria("médio");
        maratona.mostrarListaPorCategoria("grande");

        System.out.println("");

        maratona.cancelaInscricao("grande", 5);

        System.out.println("\nNova lista de inscrição: ");

        maratona.mostrarListaPorCategoria("pequeno");
        maratona.mostrarListaPorCategoria("médio");
        maratona.mostrarListaPorCategoria("grande");
    }
}
