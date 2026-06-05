package no.digisis.hackathon.spor1.oppgave08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PostnummerTest {

    @Test
    void test0150ErGyldig() {
        assertTrue(Postnummer.erGyldig("0150"));
    }

    @Test
    void test0001ErGyldig() {
        assertTrue(Postnummer.erGyldig("0001"));
    }

    @Test
    void test150ErForKort() {
        assertFalse(Postnummer.erGyldig("150"));
    }

    @Test
    void test01500ErForLangt() {
        assertFalse(Postnummer.erGyldig("01500"));
    }

    @Test
    void test01a0HarBokstav() {
        assertFalse(Postnummer.erGyldig("01a0"));
    }

    @Test
    void testTomStrengErUgyldig() {
        assertFalse(Postnummer.erGyldig(""));
    }
}
