package no.digisis.hackathon.spor1.oppgave01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HilsenTest {

    @Test
    void testHilsenTilAisha() {
        assertEquals("Hei, Aisha! Søknaden din er mottatt.", Hilsen.hils("Aisha"));
    }

    @Test
    void testHilsenTilHassan() {
        assertEquals("Hei, Hassan! Søknaden din er mottatt.", Hilsen.hils("Hassan"));
    }
}
