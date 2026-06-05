package no.digisis.hackathon.spor1.oppgave09;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InntektsgrenseTest {

    @Test
    void test30000ErInnenfor() {
        assertTrue(Inntektsgrense.innenfor(30000, 20000, 40000));
    }

    @Test
    void test20000ErInnenfor() {
        assertTrue(Inntektsgrense.innenfor(20000, 20000, 40000));
    }

    @Test
    void test40000ErInnenfor() {
        assertTrue(Inntektsgrense.innenfor(40000, 20000, 40000));
    }

    @Test
    void test19999ErUnder() {
        assertFalse(Inntektsgrense.innenfor(19999, 20000, 40000));
    }

    @Test
    void test40001ErOver() {
        assertFalse(Inntektsgrense.innenfor(40001, 20000, 40000));
    }
}
