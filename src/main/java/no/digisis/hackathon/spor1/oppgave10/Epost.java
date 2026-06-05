package no.digisis.hackathon.spor1.oppgave10;

/**
 * Oppgave 10 — Gyldig e-post (forenklet) (10 poeng)
 *
 * Sjekk om en e-postadresse er gyldig etter en forenklet regel:
 *
 *  - den inneholder nøyaktig én "@",
 *  - det er minst ett tegn FØR "@",
 *  - delen etter "@" (domenet) inneholder et punktum "." som verken er
 *    først eller sist i domenet.
 *
 *     "aisha@nav.no"  →  true
 *     "aishanav.no"   →  false   (ingen @)
 *     "aisha@navno"   →  false   (ingen . i domenet)
 *     "aisha@.no"     →  false   (. er først i domenet)
 *     "@nav.no"       →  false   (ingenting før @)
 */
public final class Epost {

    private Epost() {}

    public static boolean erGyldig(String epost) {
        // TODO

        int posisjon= epost.indexOf('@');

if (posisjon <= 0){
    return false;

        }
else if(epost.indexOf('@', posisjon + 1) != -1){
    return false;
        }
        return true;    }
}
