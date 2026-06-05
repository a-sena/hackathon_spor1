package no.digisis.hackathon.spor1.oppgave32;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PoststedTest {

    private static final Map<String, String> TABELL = Map.of("0150", "Oslo", "5003", "Bergen");

    @Test
    void test0150ErOslo() {
        assertEquals("Oslo", Poststed.poststed("0150", TABELL));
    }

    @Test
    void test5003ErBergen() {
        assertEquals("Bergen", Poststed.poststed("5003", TABELL));
    }

    @Test
    void test9999ErUkjent() {
        assertEquals("Ukjent", Poststed.poststed("9999", TABELL));
    }

    @Test
    void testTomTabellErUkjent() {
        assertEquals("Ukjent", Poststed.poststed("0150", Map.of()));
    }

    @Test
    void testTomNokkelErUkjent() {
        assertEquals("Ukjent", Poststed.poststed("", TABELL));
    }
}
