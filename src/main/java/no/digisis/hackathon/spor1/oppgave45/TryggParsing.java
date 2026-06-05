package no.digisis.hackathon.spor1.oppgave45;

/**
 * Oppgave 45 — Trygg parsing (15 poeng)
 *
 * Skjemafelt kommer inn som tekst, og brukeren kan ha skrevet noe rart.
 * Forsøk å tolke teksten som et heltall — etter at du har trimmet vekk
 * mellomrom i hver ende. Klarer du ikke å tolke den, returnerer du i
 * stedet standardverdien.
 *
 *     ("1000", 0)   →  1000
 *     ("  42 ", 0)  →  42
 *     ("abc", -1)   →  -1
 *     ("", 99)      →  99
 *     ("12x", 7)    →  7
 */
public final class TryggParsing {

    private TryggParsing() {}

    public static int parseBelopEller(String s, int standard) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 45 — ikke implementert ennå");
    }
}
