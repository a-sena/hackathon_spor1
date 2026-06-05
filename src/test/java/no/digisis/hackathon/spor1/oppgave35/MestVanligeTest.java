package no.digisis.hackathon.spor1.oppgave35;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MestVanligeTest {

    @Test
    void testOsloVinner() {
        assertEquals("Oslo", MestVanlige.mestVanlige(List.of("Oslo", "Bergen", "Oslo")));
    }

    @Test
    void testEnKommune() {
        assertEquals("Oslo", MestVanlige.mestVanlige(List.of("Oslo")));
    }

    @Test
    void testTom() {
        assertEquals("", MestVanlige.mestVanlige(List.of()));
    }

    @Test
    void testLikhetForsteVinner() {
        assertEquals("Oslo", MestVanlige.mestVanlige(List.of("Oslo", "Bergen")));
    }

    @Test
    void testTreA() {
        assertEquals("A", MestVanlige.mestVanlige(List.of("A", "B", "B", "A", "A")));
    }
}
