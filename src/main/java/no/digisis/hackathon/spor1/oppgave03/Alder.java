package no.digisis.hackathon.spor1.oppgave03;

/**
 * Oppgave 3 — Beregn alder (5 poeng)
 *
 * Gitt et fødselsår og et referanseår, returner alderen i år.
 */
public final class Alder {

    private Alder() {}

    public static int alderIAr(int fodselsAar, int referanseAar) {
        // TODO
        int alder = referanseAar - fodselsAar;
        return alder;
           }
}
