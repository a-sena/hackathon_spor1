package no.digisis.hackathon.spor1.oppgave44;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SaksbehandlingTest {

    @Test
    void testMottattGirUnderBehandling() {
        assertEquals(SaksStatus.UNDER_BEHANDLING, Saksbehandling.nesteStatus(SaksStatus.MOTTATT));
    }

    @Test
    void testUnderBehandlingGirVedtak() {
        assertEquals(SaksStatus.VEDTAK, Saksbehandling.nesteStatus(SaksStatus.UNDER_BEHANDLING));
    }

    @Test
    void testVedtakErTerminal() {
        assertEquals(SaksStatus.VEDTAK, Saksbehandling.nesteStatus(SaksStatus.VEDTAK));
    }

    @Test
    void testToStegFraMottatt() {
        assertEquals(SaksStatus.VEDTAK,
            Saksbehandling.nesteStatus(Saksbehandling.nesteStatus(SaksStatus.MOTTATT)));
    }

    @Test
    void testToStegFraVedtak() {
        assertEquals(SaksStatus.VEDTAK,
            Saksbehandling.nesteStatus(Saksbehandling.nesteStatus(SaksStatus.VEDTAK)));
    }
}
