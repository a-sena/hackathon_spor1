package no.digisis.hackathon.spor1.oppgave02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SaksoverskriftTest {

    @Test
    void testForeldrepenger() {
        assertEquals("Foreldrepenger — søknad fra Aisha Khan",
                Saksoverskrift.formater("Foreldrepenger", "Aisha Khan"));
    }

    @Test
    void testDagpenger() {
        assertEquals("Dagpenger — søknad fra Lin",
                Saksoverskrift.formater("Dagpenger", "Lin"));
    }

    @Test
    void testTommeStrengerBeholderFormatet() {
        assertEquals(" — søknad fra ", Saksoverskrift.formater("", ""));
    }
}
