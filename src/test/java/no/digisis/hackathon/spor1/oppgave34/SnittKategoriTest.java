package no.digisis.hackathon.spor1.oppgave34;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnittKategoriTest {

    @Test
    void testLavOgMiddels() {
        var sokere = List.of(
            new Soker("A", 10000, "Oslo"),
            new Soker("B", 20000, "Oslo"),
            new Soker("C", 40000, "Oslo"),
            new Soker("D", 60000, "Oslo"));
        assertEquals(Map.of("LAV", 15000.0, "MIDDELS", 50000.0),
            SnittKategori.snittPerKategori(sokere));
    }

    @Test
    void testEnLav() {
        var sokere = List.of(new Soker("A", 10000, "Oslo"));
        assertEquals(Map.of("LAV", 10000.0), SnittKategori.snittPerKategori(sokere));
    }

    @Test
    void testTom() {
        assertEquals(Map.of(), SnittKategori.snittPerKategori(List.of()));
    }

    @Test
    void testToHoye() {
        var sokere = List.of(
            new Soker("A", 70000, "Oslo"),
            new Soker("B", 80000, "Oslo"));
        assertEquals(Map.of("HOY", 75000.0), SnittKategori.snittPerKategori(sokere));
    }

    @Test
    void testEnLavEnMiddels() {
        var sokere = List.of(
            new Soker("A", 20000, "Oslo"),
            new Soker("B", 40000, "Oslo"));
        assertEquals(Map.of("LAV", 20000.0, "MIDDELS", 40000.0),
            SnittKategori.snittPerKategori(sokere));
    }
}
