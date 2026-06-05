package no.digisis.hackathon.spor1.oppgave13;

import no.digisis.hackathon.spor1.oppgave11.Inntektskategori;

/**
 * Oppgave 13 — Saksbehandlingsfrist (15 poeng)
 *
 * Hvor mange dager har saksbehandleren på å behandle en sak avhenger av
 * inntektskategorien fra oppgave 11:
 *
 *     LAV      →  14
 *     MIDDELS  →  21
 *     HOY      →  30
 *
 * Bruk en switch på kategorien. Du skal IKKE definere enumen på nytt —
 * importer den fra oppgave 11.
 */
public final class Saksbehandlingsfrist {

    private Saksbehandlingsfrist() {}

    public static int dagerFor(Inntektskategori kategori) {
        // TODO
        if (kategori==Inntektskategori.HOY){
            return 30;

        }
        else if (kategori==Inntektskategori.LAV){
            return 14;

        }
        else if (kategori==Inntektskategori.MIDDELS){
            return 21;

        }
        throw new UnsupportedOperationException("Oppgave 13 — ikke implementert ennå");
    }
}
