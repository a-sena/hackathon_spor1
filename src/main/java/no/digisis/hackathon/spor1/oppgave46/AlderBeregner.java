package no.digisis.hackathon.spor1.oppgave46;

/**
 * Oppgave 46 — Alder fra fødselsdato (20 poeng)
 *
 * Regn ut hvor mange hele år en person har fylt på en gitt dato. Du må
 * justere for måned og dag: har personen ikke hatt bursdag ennå i år, er
 * alderen ett år lavere.
 *
 *     1990-01-01  på  2026-06-03  →  36
 *     1990-12-31  på  2026-06-03  →  35   (ikke fylt år ennå)
 *     2026-06-03  på  2026-06-03  →  0    (født samme dag)
 *
 * Datoene kommer som java.time.LocalDate.
 */
public final class AlderBeregner {

    private AlderBeregner() {}

    public static int alderFraDato(java.time.LocalDate fodselsdato, java.time.LocalDate paaDato) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 46 — ikke implementert ennå");
    }
}
