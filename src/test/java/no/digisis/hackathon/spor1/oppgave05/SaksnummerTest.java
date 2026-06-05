package no.digisis.hackathon.spor1.oppgave05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SaksnummerTest {

    @Test
    void testEttSiffer() {
        assertEquals("SAK-0007", Saksnummer.lagSaksnummer(7));
    }

    @Test
    void testToSifre() {
        assertEquals("SAK-0042", Saksnummer.lagSaksnummer(42));
    }

    @Test
    void testFireSifre() {
        assertEquals("SAK-1234", Saksnummer.lagSaksnummer(1234));
    }

    @Test
    void testFemSifreKuttesIkke() {
        assertEquals("SAK-12345", Saksnummer.lagSaksnummer(12345));
    }
}
