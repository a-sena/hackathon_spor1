package no.digisis.hackathon.spor1.oppgave48;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FristTest {

    @Test
    void testDagenEtter() {
        assertTrue(Frist.erUtlopt(
            LocalDate.of(2026, 6, 3), LocalDate.of(2026, 6, 4)));
    }

    @Test
    void testSammeDag() {
        assertFalse(Frist.erUtlopt(
            LocalDate.of(2026, 6, 3), LocalDate.of(2026, 6, 3)));
    }

    @Test
    void testDagenFor() {
        assertFalse(Frist.erUtlopt(
            LocalDate.of(2026, 6, 3), LocalDate.of(2026, 6, 2)));
    }

    @Test
    void testLangtEtter() {
        assertTrue(Frist.erUtlopt(
            LocalDate.of(2026, 1, 1), LocalDate.of(2026, 12, 31)));
    }
}
