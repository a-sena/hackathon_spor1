package no.digisis.hackathon.spor1.oppgave10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EpostTest {

    @Test
    void testVanligAdresseErGyldig() {
        assertTrue(Epost.erGyldig("aisha@nav.no"));
    }

    @Test
    void testKortAdresseErGyldig() {
        assertTrue(Epost.erGyldig("a@b.no"));
    }

    @Test
    void testUtenKrollalfaErUgyldig() {
        assertFalse(Epost.erGyldig("aishanav.no"));
    }

    @Test
    void testUtenPunktumErUgyldig() {
        assertFalse(Epost.erGyldig("aisha@navno"));
    }

    @Test
    void testPunktumForstIDomenetErUgyldig() {
        assertFalse(Epost.erGyldig("aisha@.no"));
    }

    @Test
    void testIngentingForKrollalfaErUgyldig() {
        assertFalse(Epost.erGyldig("@nav.no"));
    }
}
