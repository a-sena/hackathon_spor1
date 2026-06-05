package no.digisis.hackathon.spor1.oppgave03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlderTest {

    @Test
    void testFodt1990() {
        assertEquals(36, Alder.alderIAr(1990, 2026));
    }

    @Test
    void testFodt2000() {
        assertEquals(26, Alder.alderIAr(2000, 2026));
    }

    @Test
    void testSammeAarGirNull() {
        assertEquals(0, Alder.alderIAr(2026, 2026));
    }
}
