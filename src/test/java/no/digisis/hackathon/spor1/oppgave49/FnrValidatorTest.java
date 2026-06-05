package no.digisis.hackathon.spor1.oppgave49;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FnrValidatorTest {

    @Test
    void testGyldig() {
        assertTrue(FnrValidator.erGyldig("01059010006"));
    }

    @Test
    void testFeilKontrollsiffer() {
        assertFalse(FnrValidator.erGyldig("01059010005"));
    }

    @Test
    void testForKort() {
        assertFalse(FnrValidator.erGyldig("0105901000"));
    }

    @Test
    void testBokstaver() {
        assertFalse(FnrValidator.erGyldig("01059abc006"));
    }

    @Test
    void testNull() {
        assertFalse(FnrValidator.erGyldig(null));
    }

    @Test
    void testMedMellomrom() {
        assertFalse(FnrValidator.erGyldig("01 590 10006"));
    }
}
