package no.digisis.hackathon.spor1.oppgave18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StrengTest {

    @Test
    void testAbc() {
        assertEquals("cba", Streng.snu("abc"));
    }

    @Test
    void testDigiSis() {
        assertEquals("siSigiD", Streng.snu("DigiSis"));
    }

    @Test
    void testTom() {
        assertEquals("", Streng.snu(""));
    }

    @Test
    void testEttTegn() {
        assertEquals("a", Streng.snu("a"));
    }
}
