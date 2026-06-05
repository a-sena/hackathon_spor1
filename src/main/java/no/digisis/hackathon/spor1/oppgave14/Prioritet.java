package no.digisis.hackathon.spor1.oppgave14;

/**
 * Oppgave 14 — Prioritetskode (15 poeng)
 *
 * En sak får en prioritetskode (A, B eller C) ut fra søkerens alder og
 * månedslønn:
 *
 *     alder 67 eller mer        →  A
 *     ellers, månedslønn < 30000 →  B
 *     ellers                    →  C
 *
 * Sjekk reglene i denne rekkefølgen — den første som passer bestemmer.
 *
 *     prioritet(70, 50000)  →  A
 *     prioritet(40, 20000)  →  B
 *     prioritet(40, 30000)  →  C
 */
public final class Prioritet {

    private Prioritet() {}

    public static Prioritetskode prioritet(int alder, int manedslonn) {
        // TODO
        if (alder >= 67) {
            return Prioritetskode.A;
        }


        if (manedslonn < 30000) {
            return Prioritetskode.B;
        }

        return Prioritetskode.C;
    }
           }

