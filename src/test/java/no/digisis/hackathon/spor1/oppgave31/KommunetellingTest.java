package no.digisis.hackathon.spor1.oppgave31;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KommunetellingTest {

    @Test
    void testToOgEn() {
        assertEquals(Map.of("Oslo", 2, "Bergen", 1),
            Kommunetelling.tellPerKommune(List.of("Oslo", "Oslo", "Bergen")));
    }

    @Test
    void testEnKommune() {
        assertEquals(Map.of("Oslo", 1),
            Kommunetelling.tellPerKommune(List.of("Oslo")));
    }

    @Test
    void testTom() {
        assertEquals(Map.of(),
            Kommunetelling.tellPerKommune(List.of()));
    }

    @Test
    void testTreOgTo() {
        assertEquals(Map.of("A", 3, "B", 2),
            Kommunetelling.tellPerKommune(List.of("A", "B", "A", "B", "A")));
    }

    @Test
    void testTromsoBodo() {
        assertEquals(Map.of("Tromso", 2, "Bodo", 1),
            Kommunetelling.tellPerKommune(List.of("Tromso", "Bodo", "Tromso")));
    }
}
