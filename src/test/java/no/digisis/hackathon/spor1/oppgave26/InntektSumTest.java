package no.digisis.hackathon.spor1.oppgave26;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InntektSumTest {

    @Test
    void testTreInntekter() {
        assertEquals(60000, InntektSum.sum(List.of(10000, 20000, 30000)));
    }

    @Test
    void testEnInntekt() {
        assertEquals(5000, InntektSum.sum(List.of(5000)));
    }

    @Test
    void testTomListe() {
        assertEquals(0, InntektSum.sum(List.of()));
    }

    @Test
    void testFireLike() {
        assertEquals(4000, InntektSum.sum(List.of(1000, 1000, 1000, 1000)));
    }
}
