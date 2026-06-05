package no.digisis.hackathon.spor1.oppgave19;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class VokalerTest {

    @Test
    void testSaksbehandler() {
        assertEquals(4, Vokaler.tellVokaler("saksbehandler"));
    }

    @Test
    void testAlleStore() {
        assertEquals(5, Vokaler.tellVokaler("AEIOU"));
    }

    @Test
    void testXyz() {
        assertEquals(1, Vokaler.tellVokaler("xyz"));
    }

    @Test
    void testBjorn() {
        assertEquals(1, Vokaler.tellVokaler("Bjørn"));
    }

    @Test
    void testTom() {
        assertEquals(0, Vokaler.tellVokaler(""));
    }
}
