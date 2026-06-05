package no.digisis.hackathon.spor1.oppgave11;

/**
 * Oppgave 11 — Inntektskategori (15 poeng)
 *
 * Plasser en månedslønn i riktig kategori:
 *
 *  - under 30 000 kr             →  LAV
 *  - fra og med 30 000 til og med 60 000 kr  →  MIDDELS
 *  - over 60 000 kr              →  HOY
 *
 *     29999  →  LAV
 *     30000  →  MIDDELS
 *     60000  →  MIDDELS
 *     60001  →  HOY
 */
public final class Inntekt {

    private Inntekt() {}

    public static Inntektskategori kategoriFor(int manedslonn) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 11 — ikke implementert ennå");
    }
}
