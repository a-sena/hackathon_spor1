package no.digisis.hackathon.spor1.oppgave13;

import no.digisis.hackathon.spor1.oppgave11.Inntektskategori;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SaksbehandlingsfristTest {

    @Test
    void testLav() {
        assertEquals(14, Saksbehandlingsfrist.dagerFor(Inntektskategori.LAV));
    }

    @Test
    void testMiddels() {
        assertEquals(21, Saksbehandlingsfrist.dagerFor(Inntektskategori.MIDDELS));
    }

    @Test
    void testHoy() {
        assertEquals(30, Saksbehandlingsfrist.dagerFor(Inntektskategori.HOY));
    }
}
