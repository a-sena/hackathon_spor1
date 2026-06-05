package no.digisis.hackathon.spor1.oppgave23;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForsteTest {

    @Test
    void testAndreElement() {
        assertEquals(1, Forste.forsteOver(List.of(10, 20, 30), 15));
    }

    @Test
    void testTredjeElement() {
        assertEquals(2, Forste.forsteOver(List.of(10, 20, 30), 25));
    }

    @Test
    void testIngenOver() {
        assertEquals(-1, Forste.forsteOver(List.of(10, 20, 30), 100));
    }

    @Test
    void testTomListe() {
        assertEquals(-1, Forste.forsteOver(List.of(), 5));
    }

    @Test
    void testForsteElement() {
        assertEquals(0, Forste.forsteOver(List.of(50, 5, 5), 40));
    }
}
