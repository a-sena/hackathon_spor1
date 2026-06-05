package no.digisis.hackathon.spor1.oppgave48;

/**
 * Oppgave 48 — Er fristen utløpt? (10 poeng)
 *
 * En frist er utløpt når dagen i dag er ETTER fristen. På selve
 * fristdagen er den ikke utløpt ennå.
 *
 *     frist 2026-06-03,  i dag 2026-06-04  →  true
 *     frist 2026-06-03,  i dag 2026-06-03  →  false  (samme dag)
 *     frist 2026-06-03,  i dag 2026-06-02  →  false  (ikke kommet ennå)
 *
 * Datoene kommer som java.time.LocalDate.
 */
public final class Frist {

    private Frist() {}

    public static boolean erUtlopt(java.time.LocalDate frist, java.time.LocalDate iDag) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 48 — ikke implementert ennå");
    }
}
