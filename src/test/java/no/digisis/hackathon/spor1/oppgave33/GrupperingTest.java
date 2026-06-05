package no.digisis.hackathon.spor1.oppgave33;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GrupperingTest {

    @Test
    void testBlanding() {
        var sokere = List.of(
            new Soker("A", 10000, "Oslo"),
            new Soker("B", 45000, "Oslo"),
            new Soker("C", 70000, "Bergen"),
            new Soker("D", 20000, "Oslo"));
        assertEquals(Map.of("LAV", 2, "MIDDELS", 1, "HOY", 1), Gruppering.grupper(sokere));
    }

    @Test
    void testToLave() {
        var sokere = List.of(
            new Soker("A", 10000, "Oslo"),
            new Soker("B", 29999, "Oslo"));
        assertEquals(Map.of("LAV", 2), Gruppering.grupper(sokere));
    }

    @Test
    void testTom() {
        assertEquals(Map.of(), Gruppering.grupper(List.of()));
    }

    @Test
    void testGrenserMiddels() {
        var sokere = List.of(
            new Soker("A", 30000, "Oslo"),
            new Soker("B", 60000, "Oslo"));
        assertEquals(Map.of("MIDDELS", 2), Gruppering.grupper(sokere));
    }

    @Test
    void testGrenseHoy() {
        var sokere = List.of(new Soker("A", 60001, "Oslo"));
        assertEquals(Map.of("HOY", 1), Gruppering.grupper(sokere));
    }
}
