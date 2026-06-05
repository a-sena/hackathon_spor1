package no.digisis.hackathon.spor1.oppgave11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class InntektTest {

    @Test
    void test29999ErLav() {
        assertEquals(Inntektskategori.LAV, Inntekt.kategoriFor(29999));
    }

    @Test
    void test30000ErMiddels() {
        assertEquals(Inntektskategori.MIDDELS, Inntekt.kategoriFor(30000));
    }

    @Test
    void test60000ErMiddels() {
        assertEquals(Inntektskategori.MIDDELS, Inntekt.kategoriFor(60000));
    }

    @Test
    void test60001ErHoy() {
        assertEquals(Inntektskategori.HOY, Inntekt.kategoriFor(60001));
    }
}
