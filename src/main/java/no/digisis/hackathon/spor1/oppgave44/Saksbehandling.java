package no.digisis.hackathon.spor1.oppgave44;

/**
 * Oppgave 44 — Saksstatus-overgang (15 poeng)
 *
 * En sak går gjennom statusene MOTTATT → UNDER_BEHANDLING → VEDTAK.
 * VEDTAK er sluttstatus (terminal) og går ikke videre.
 *
 *     nesteStatus(MOTTATT)           →  UNDER_BEHANDLING
 *     nesteStatus(UNDER_BEHANDLING)  →  VEDTAK
 *     nesteStatus(VEDTAK)            →  VEDTAK
 *
 * Bruk en switch på status.
 */
public final class Saksbehandling {

    private Saksbehandling() {}

    public static SaksStatus nesteStatus(SaksStatus status) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 44 — ikke implementert ennå");
    }
}
