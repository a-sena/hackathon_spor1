package no.digisis.hackathon.spor1.oppgave49;

/**
 * Oppgave 49 — Validering av fødselsnummer (3.parts-bibliotek) (15 poeng)
 *
 * Sjekk om en tekst er et gyldig norsk fødselsnummer. Du skal IKKE skrive
 * Mod-11-logikken selv — bruk biblioteket som allerede ligger i pom.xml:
 * no.bekk.bekkopen:nocommons.
 *
 * Husk at `fnr` kan være null, og at biblioteket kan kaste en feil på
 * ugyldig inndata — begge tilfeller skal gi false (ikke en kræsj).
 *
 *     "01059010006"  →  true
 *     "01059010005"  →  false   (feil kontrollsiffer)
 *     "0105901000"   →  false   (for kort)
 *     null            →  false
 */
public final class FnrValidator {

    private FnrValidator() {}

    public static boolean erGyldig(String fnr) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 49 — ikke implementert ennå");
    }
}
