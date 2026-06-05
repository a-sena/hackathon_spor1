package no.digisis.hackathon.spor1.oppgave43;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SoknadFabrikkTest {

    @Test
    void testGyldigSoknad() {
        assertEquals(new Soknad("SAK-1", "Aisha", 1000),
            SoknadFabrikk.lagSoknad("SAK-1", "Aisha", 1000));
    }

    @Test
    void testBlanktNavnKaster() {
        assertThrows(IllegalArgumentException.class,
            () -> SoknadFabrikk.lagSoknad("SAK-1", "", 1000));
    }

    @Test
    void testNavnKunMellomromKaster() {
        assertThrows(IllegalArgumentException.class,
            () -> SoknadFabrikk.lagSoknad("SAK-1", "  ", 1000));
    }

    @Test
    void testNegativtBelopKaster() {
        assertThrows(IllegalArgumentException.class,
            () -> SoknadFabrikk.lagSoknad("SAK-1", "Aisha", -1));
    }

    @Test
    void testBlanktSaksnummerKaster() {
        assertThrows(IllegalArgumentException.class,
            () -> SoknadFabrikk.lagSoknad("", "Aisha", 1000));
    }

    @Test
    void testBelopNullErGyldig() {
        assertEquals(new Soknad("SAK-1", "Aisha", 0),
            SoknadFabrikk.lagSoknad("SAK-1", "Aisha", 0));
    }
}
