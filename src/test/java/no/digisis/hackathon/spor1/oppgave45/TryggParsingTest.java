package no.digisis.hackathon.spor1.oppgave45;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TryggParsingTest {

    @Test
    void testVanligTall() {
        assertEquals(1000, TryggParsing.parseBelopEller("1000", 0));
    }

    @Test
    void testMedMellomrom() {
        assertEquals(42, TryggParsing.parseBelopEller("  42 ", 0));
    }

    @Test
    void testBokstaver() {
        assertEquals(-1, TryggParsing.parseBelopEller("abc", -1));
    }

    @Test
    void testTomStreng() {
        assertEquals(99, TryggParsing.parseBelopEller("", 99));
    }

    @Test
    void testDelvisTall() {
        assertEquals(7, TryggParsing.parseBelopEller("12x", 7));
    }
}
