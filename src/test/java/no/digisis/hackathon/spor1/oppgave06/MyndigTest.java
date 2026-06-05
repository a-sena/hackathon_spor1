package no.digisis.hackathon.spor1.oppgave06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyndigTest {

    @Test
    void test17ErIkkeMyndig() {
        assertFalse(Myndig.erMyndig(17));
    }

    @Test
    void test18ErMyndig() {
        assertTrue(Myndig.erMyndig(18));
    }

    @Test
    void test19ErMyndig() {
        assertTrue(Myndig.erMyndig(19));
    }

    @Test
    void test0ErIkkeMyndig() {
        assertFalse(Myndig.erMyndig(0));
    }
}
