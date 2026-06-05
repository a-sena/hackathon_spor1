package no.digisis.hackathon.spor1.oppgave30;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ToppTest {

    @Test
    void testFemTall() {
        assertEquals(List.of(9, 7, 5), Topp.topp3(List.of(1, 5, 3, 9, 7)));
    }

    @Test
    void testToTall() {
        assertEquals(List.of(20, 10), Topp.topp3(List.of(10, 20)));
    }

    @Test
    void testEttTall() {
        assertEquals(List.of(5), Topp.topp3(List.of(5)));
    }

    @Test
    void testTom() {
        assertEquals(List.of(), Topp.topp3(List.of()));
    }

    @Test
    void testDuplikater() {
        assertEquals(List.of(9, 9, 9), Topp.topp3(List.of(9, 9, 9, 1)));
    }
}
