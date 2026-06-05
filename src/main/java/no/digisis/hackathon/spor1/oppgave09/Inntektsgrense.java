package no.digisis.hackathon.spor1.oppgave09;

/**
 * Oppgave 9 — Innenfor inntektsgrense (10 poeng)
 *
 * Avgjør om et beløp ligger innenfor en nedre og en øvre grense. Begge
 * grensene er inklusive — et beløp som er nøyaktig lik nedre eller øvre
 * grense regnes som innenfor.
 *
 *     belop=30000, nedre=20000, ovre=40000  →  true
 *     belop=20000, nedre=20000, ovre=40000  →  true
 *     belop=19999, nedre=20000, ovre=40000  →  false
 */
public final class Inntektsgrense {

    private Inntektsgrense() {}

    public static boolean innenfor(int belop, int nedre, int ovre) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 9 — ikke implementert ennå");
    }
}
