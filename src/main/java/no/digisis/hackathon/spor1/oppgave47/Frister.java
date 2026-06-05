package no.digisis.hackathon.spor1.oppgave47;

/**
 * Oppgave 47 — Dager til frist (15 poeng)
 *
 * Regn ut antall dager fra en dato til en frist. Svaret er positivt når
 * fristen er fram i tid, 0 når det er samme dag, og negativt når fristen
 * allerede er passert.
 *
 *     2026-06-03  →  2026-06-10  →  7
 *     2026-06-03  →  2026-06-03  →  0
 *     2026-06-10  →  2026-06-03  →  -7
 *
 * Datoene kommer som java.time.LocalDate.
 */
public final class Frister {

    private Frister() {}

    public static long dagerTil(java.time.LocalDate fra, java.time.LocalDate frist) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 47 — ikke implementert ennå");
    }
}
