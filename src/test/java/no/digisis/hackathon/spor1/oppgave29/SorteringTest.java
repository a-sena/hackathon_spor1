package no.digisis.hackathon.spor1.oppgave29;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SorteringTest {

    @Test
    void test321() {
        assertEquals(List.of(3, 2, 1), Sortering.sortertSynkende(List.of(3, 1, 2)));
    }

    @Test
    void test102030() {
        assertEquals(List.of(30, 20, 10), Sortering.sortertSynkende(List.of(10, 20, 30)));
    }

    @Test
    void testDuplikater() {
        assertEquals(List.of(5, 5, 1), Sortering.sortertSynkende(List.of(5, 5, 1)));
    }

    @Test
    void testTom() {
        assertEquals(List.of(), Sortering.sortertSynkende(List.of()));
    }

    @Test
    void testMutererIkkeInput() {
        var input = new ArrayList<>(List.of(3, 1, 2));
        Sortering.sortertSynkende(input);
        assertEquals(List.of(3, 1, 2), input);
    }
}
