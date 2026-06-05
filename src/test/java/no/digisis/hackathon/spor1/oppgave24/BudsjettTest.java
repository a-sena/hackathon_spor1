package no.digisis.hackathon.spor1.oppgave24;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BudsjettTest {

    @Test
    void testToFarPlass() {
        assertEquals(2, Budsjett.antallInnvilget(List.of(100, 100, 100), 250));
    }

    @Test
    void testAlleFarPlass() {
        assertEquals(3, Budsjett.antallInnvilget(List.of(100, 100, 100), 300));
    }

    @Test
    void testIngenFarPlass() {
        assertEquals(0, Budsjett.antallInnvilget(List.of(100, 100, 100), 50));
    }

    @Test
    void testTomListe() {
        assertEquals(0, Budsjett.antallInnvilget(List.of(), 100));
    }

    @Test
    void testEnFarPlass() {
        assertEquals(1, Budsjett.antallInnvilget(List.of(100, 100, 100), 100));
    }

    @Test
    void testStopperVedForstSomIkkePasser() {
        assertEquals(2, Budsjett.antallInnvilget(List.of(40, 40, 40), 100));
    }
}
