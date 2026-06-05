package no.digisis.hackathon.spor1.oppgave21;

/**
 * Oppgave 21 — Saksnummer-spill (15 poeng)
 *
 * Gå gjennom tallene fra 1 til og med n og bygg en liste med strenger
 * etter disse reglene (sjekk dem i denne rekkefølgen):
 *
 *   - delelig på både 3 og 5  →  "SakFrist"
 *   - delelig på 3            →  "Sak"
 *   - delelig på 5            →  "Frist"
 *   - ellers                  →  tallet som streng
 *
 *     spill(3)  →  ["1", "2", "Sak"]
 *     spill(5)  →  ["1", "2", "Sak", "4", "Frist"]
 *     spill(0)  →  []  (tom liste)
 */
public final class Spill {

    private Spill() {}

    public static java.util.List<String> spill(int n) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 21 — ikke implementert ennå");
    }
}
