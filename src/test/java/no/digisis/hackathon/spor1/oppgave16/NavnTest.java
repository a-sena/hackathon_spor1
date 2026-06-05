package no.digisis.hackathon.spor1.oppgave16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NavnTest {

    @Test
    void testSmaaBokstaver() {
        assertEquals("Aisha Khan", Navn.kapitaliser("aisha khan"));
    }

    @Test
    void testStoreBokstaver() {
        assertEquals("Aisha Khan", Navn.kapitaliser("AISHA KHAN"));
    }

    @Test
    void testEttOrd() {
        assertEquals("Lin", Navn.kapitaliser("lin"));
    }

    @Test
    void testTreOrd() {
        assertEquals("Per Olav Hansen", Navn.kapitaliser("per olav hansen"));
    }

    @Test
    void testTom() {
        assertEquals("", Navn.kapitaliser(""));
    }
}
