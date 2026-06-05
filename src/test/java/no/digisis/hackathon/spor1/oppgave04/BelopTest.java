package no.digisis.hackathon.spor1.oppgave04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BelopTest {

    @Test
    void testNull() {
        assertEquals("0 kr", Belop.formaterBelop(0));
    }

    @Test
    void testUnder1000() {
        assertEquals("999 kr", Belop.formaterBelop(999));
    }

    @Test
    void testTusen() {
        assertEquals("1 000 kr", Belop.formaterBelop(1000));
    }

    @Test
    void testFemogtrettiTusen() {
        assertEquals("35 000 kr", Belop.formaterBelop(35000));
    }

    @Test
    void testMillion() {
        assertEquals("1 234 567 kr", Belop.formaterBelop(1234567));
    }
}
