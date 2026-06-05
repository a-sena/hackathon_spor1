package no.digisis.hackathon.spor1.oppgave20;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SoekerlinjeTest {

    @Test
    void testEnkel() {
        assertEquals(new Person("Aisha", 34), Soekerlinje.parse("Aisha;34"));
    }

    @Test
    void testNavnMedMellomrom() {
        assertEquals(new Person("Lin Wang", 28), Soekerlinje.parse("Lin Wang;28"));
    }

    @Test
    void testTrimmesRundtFelt() {
        assertEquals(new Person("Hassan", 67), Soekerlinje.parse(" Hassan ; 67 "));
    }

    @Test
    void testAlderNull() {
        assertEquals(new Person("Per", 0), Soekerlinje.parse("Per;0"));
    }

    @Test
    void testNavnFelt() {
        assertEquals("Aisha", Soekerlinje.parse("Aisha;34").navn());
    }

    @Test
    void testAlderFelt() {
        assertEquals(34, Soekerlinje.parse("Aisha;34").alder());
    }
}
