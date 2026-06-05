package no.digisis.hackathon.spor1.oppgave27;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SnittInntektTest {

    @Test
    void testTreInntekter() {
        assertEquals(40000.0, SnittInntekt.snitt(List.of(30000, 40000, 50000)));
    }

    @Test
    void testToInntekter() {
        assertEquals(15000.0, SnittInntekt.snitt(List.of(10000, 20000)));
    }

    @Test
    void testDesimal() {
        assertEquals(1.5, SnittInntekt.snitt(List.of(1, 2)));
    }

    @Test
    void testTomListe() {
        assertEquals(0.0, SnittInntekt.snitt(List.of()));
    }
}
