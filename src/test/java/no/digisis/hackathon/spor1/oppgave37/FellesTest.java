package no.digisis.hackathon.spor1.oppgave37;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FellesTest {

    @Test
    void testSnitt() {
        assertEquals(List.of("2", "3"), Felles.felles(List.of("1", "2", "3"), List.of("2", "3", "4")));
    }

    @Test
    void testIngenFelles() {
        assertEquals(List.of(), Felles.felles(List.of("1", "2"), List.of("3", "4")));
    }

    @Test
    void testDuplikaterFjernes() {
        assertEquals(List.of("1", "2"), Felles.felles(List.of("1", "1", "2"), List.of("1", "2")));
    }

    @Test
    void testTomForste() {
        assertEquals(List.of(), Felles.felles(List.of(), List.of("1")));
    }

    @Test
    void testRekkefolgeFraForste() {
        assertEquals(List.of("y", "z"), Felles.felles(List.of("x", "y", "z"), List.of("z", "y")));
    }
}
