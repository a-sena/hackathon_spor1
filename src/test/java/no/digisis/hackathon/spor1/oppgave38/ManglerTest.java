package no.digisis.hackathon.spor1.oppgave38;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ManglerTest {

    @Test
    void testManglerNoen() {
        assertEquals(List.of("1", "3"), Mangler.mangler(List.of("1", "2", "3"), List.of("2")));
    }

    @Test
    void testIngenMangler() {
        assertEquals(List.of(), Mangler.mangler(List.of("1", "2"), List.of("1", "2")));
    }

    @Test
    void testAlleMangler() {
        assertEquals(List.of("1", "2", "3"), Mangler.mangler(List.of("1", "2", "3"), List.of()));
    }

    @Test
    void testTomForventet() {
        assertEquals(List.of(), Mangler.mangler(List.of(), List.of("1")));
    }

    @Test
    void testDuplikaterFjernes() {
        assertEquals(List.of("a"), Mangler.mangler(List.of("a", "a", "b"), List.of("b")));
    }
}
