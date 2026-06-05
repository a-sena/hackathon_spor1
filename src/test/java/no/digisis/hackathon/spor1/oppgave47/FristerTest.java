package no.digisis.hackathon.spor1.oppgave47;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FristerTest {

    @Test
    void testEnUke() {
        assertEquals(7L, Frister.dagerTil(
            LocalDate.of(2026, 6, 3), LocalDate.of(2026, 6, 10)));
    }

    @Test
    void testSammeDag() {
        assertEquals(0L, Frister.dagerTil(
            LocalDate.of(2026, 6, 3), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testPassert() {
        assertEquals(-7L, Frister.dagerTil(
            LocalDate.of(2026, 6, 10), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testEnManed() {
        assertEquals(30L, Frister.dagerTil(
            LocalDate.of(2026, 6, 3), LocalDate.of(2026, 7, 3)));
    }

    @Test
    void testOverAarsskiftet() {
        assertEquals(1L, Frister.dagerTil(
            LocalDate.of(2026, 12, 31), LocalDate.of(2027, 1, 1)));
    }
}
