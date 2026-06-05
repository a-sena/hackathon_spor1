package no.digisis.hackathon.spor1.oppgave08;

/**
 * Oppgave 8 — Gyldig postnummer (10 poeng)
 *
 * Et norsk postnummer består av nøyaktig fire sifre. Returner true bare
 * dersom strengen er nøyaktig fire tegn og alle er sifre (0–9).
 *
 *     "0150"   →  true
 *     "150"    →  false   (for få sifre)
 *     "01500"  →  false   (for mange sifre)
 *     "01a0"   →  false   (ikke bare sifre)
 */
public final class Postnummer {

    private Postnummer() {}

    public static boolean erGyldig(String postnummer) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 8 — ikke implementert ennå");
    }
}
