package no.digisis.hackathon.spor1.oppgave50;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SaksbehandlerRapportTest {

    @Test
    void testTrePersoner() {
        String forventet = "Daglig rapport\n"
            + "Antall søkere: 3\n"
            + "Antall pensjonister: 1\n"
            + "Eldste: Hassan (80) år";
        assertEquals(forventet, SaksbehandlerRapport.dagligRapport(List.of(
            new Person("Aisha", 30),
            new Person("Hassan", 80),
            new Person("Lin", 45))));
    }

    @Test
    void testTomListe() {
        String forventet = "Daglig rapport\n"
            + "Antall søkere: 0\n"
            + "Antall pensjonister: 0\n"
            + "Eldste: ingen";
        assertEquals(forventet, SaksbehandlerRapport.dagligRapport(List.of()));
    }

    @Test
    void testEnPerson() {
        String forventet = "Daglig rapport\n"
            + "Antall søkere: 1\n"
            + "Antall pensjonister: 0\n"
            + "Eldste: Aisha (30) år";
        assertEquals(forventet, SaksbehandlerRapport.dagligRapport(List.of(
            new Person("Aisha", 30))));
    }

    @Test
    void testToPensjonister() {
        String forventet = "Daglig rapport\n"
            + "Antall søkere: 3\n"
            + "Antall pensjonister: 2\n"
            + "Eldste: Hassan (80) år";
        assertEquals(forventet, SaksbehandlerRapport.dagligRapport(List.of(
            new Person("Hassan", 80),
            new Person("Astrid", 70),
            new Person("Lin", 45))));
    }
}
