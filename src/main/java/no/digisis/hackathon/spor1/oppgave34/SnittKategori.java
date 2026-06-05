package no.digisis.hackathon.spor1.oppgave34;

/**
 * Oppgave 34 — Snitt per kategori (20 poeng)
 *
 * Regn ut gjennomsnittlig månedslønn i hver inntektskategori. Kategori
 * bestemmes av månedslønnen (samme terskler som oppgave 33):
 *
 *     manedslonn  < 30000   →  "LAV"
 *     manedslonn <= 60000   →  "MIDDELS"
 *     manedslonn  > 60000   →  "HOY"
 *
 * Returnér et oppslag fra kategori til snitt-lønn. Kategorier uten
 * søkere skal ikke være med i resultatet.
 */
public final class SnittKategori {

    private SnittKategori() {}

    public static java.util.Map<String, Double> snittPerKategori(java.util.List<Soker> sokere) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 34 — ikke implementert ennå");
    }
}
