package no.digisis.hackathon.spor1.oppgave15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InitialerTest {

    @Test
    void testAishaKhan() {
        assertEquals("AK", Initialer.initialer("Aisha Khan"));
    }

    @Test
    void testLinWang() {
        assertEquals("LW", Initialer.initialer("lin wang"));
    }

    @Test
    void testEttNavn() {
        assertEquals("A", Initialer.initialer("Aisha"));
    }

    @Test
    void testTreNavn() {
        assertEquals("POH", Initialer.initialer("Per Olav Hansen"));
    }

    @Test
    void testTom() {
        assertEquals("", Initialer.initialer(""));
    }
}
