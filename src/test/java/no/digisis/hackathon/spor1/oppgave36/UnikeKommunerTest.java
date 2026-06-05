package no.digisis.hackathon.spor1.oppgave36;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UnikeKommunerTest {

    @Test
    void testDuplikatSorteres() {
        assertEquals(List.of("Bergen", "Oslo"),
            UnikeKommuner.unikeKommuner(List.of("Oslo", "Bergen", "Oslo")));
    }

    @Test
    void testBokstaver() {
        assertEquals(List.of("A", "B", "C"),
            UnikeKommuner.unikeKommuner(List.of("C", "A", "B", "A")));
    }

    @Test
    void testTom() {
        assertEquals(List.of(), UnikeKommuner.unikeKommuner(List.of()));
    }

    @Test
    void testEnKommune() {
        assertEquals(List.of("Oslo"), UnikeKommuner.unikeKommuner(List.of("Oslo")));
    }
}
