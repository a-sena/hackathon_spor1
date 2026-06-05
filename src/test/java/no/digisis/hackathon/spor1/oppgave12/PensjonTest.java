package no.digisis.hackathon.spor1.oppgave12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PensjonTest {

    @Test
    void test66ErYrkesaktiv() {
        assertEquals(Pensjonsstatus.YRKESAKTIV, Pensjon.statusFor(66));
    }

    @Test
    void test67ErPensjonist() {
        assertEquals(Pensjonsstatus.PENSJONIST, Pensjon.statusFor(67));
    }

    @Test
    void test80ErPensjonist() {
        assertEquals(Pensjonsstatus.PENSJONIST, Pensjon.statusFor(80));
    }
}
