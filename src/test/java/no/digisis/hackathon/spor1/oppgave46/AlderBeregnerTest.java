package no.digisis.hackathon.spor1.oppgave46;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlderBeregnerTest {

    @Test
    void testForstePaAaret() {
        assertEquals(36, AlderBeregner.alderFraDato(
            LocalDate.of(1990, 1, 1), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testSistePaAaret() {
        assertEquals(35, AlderBeregner.alderFraDato(
            LocalDate.of(1990, 12, 31), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testBursdagSammeDag() {
        assertEquals(36, AlderBeregner.alderFraDato(
            LocalDate.of(1990, 6, 3), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testDagenForBursdag() {
        assertEquals(35, AlderBeregner.alderFraDato(
            LocalDate.of(1990, 6, 4), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testFodtSammeDato() {
        assertEquals(0, AlderBeregner.alderFraDato(
            LocalDate.of(2026, 6, 3), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testAkkurat18() {
        assertEquals(18, AlderBeregner.alderFraDato(
            LocalDate.of(2008, 6, 2), LocalDate.of(2026, 6, 3)));
    }
}
