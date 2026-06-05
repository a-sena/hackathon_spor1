package no.digisis.hackathon.spor1.oppgave28;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplikaterTest {

    @Test
    void testEttDuplikat() {
        assertEquals(List.of(1, 2, 3), Duplikater.unike(List.of(1, 2, 2, 3)));
    }

    @Test
    void testAlleLike() {
        assertEquals(List.of(5), Duplikater.unike(List.of(5, 5, 5)));
    }

    @Test
    void testIngenDuplikater() {
        assertEquals(List.of(1, 2, 3), Duplikater.unike(List.of(1, 2, 3)));
    }

    @Test
    void testTomListe() {
        assertEquals(List.of(), Duplikater.unike(List.of()));
    }

    @Test
    void testBevarerRekkefolge() {
        assertEquals(List.of(3, 1, 2), Duplikater.unike(List.of(3, 1, 3, 2, 1)));
    }
}
