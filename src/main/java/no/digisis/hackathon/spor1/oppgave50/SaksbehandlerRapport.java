package no.digisis.hackathon.spor1.oppgave50;

import java.util.List;

/**
 * Oppgave 50 — Saksbehandler-rapport (25 poeng)
 *
 * Lag en kort dagsrapport over en liste søkere. Rapporten har fire linjer
 * skilt med "\n" (ingen avsluttende linjeskift):
 *
 *     Daglig rapport
 *     Antall søkere: <antall>
 *     Antall pensjonister: <antall som er 67 eller eldre>
 *     Eldste: <navn> (<alder>) år
 *
 * En pensjonist er en person med alder >= 67. Eldste er personen med
 * høyest alder; ved lik alder velges den første i lista. Er lista tom,
 * skal siste linje være nøyaktig "Eldste: ingen".
 *
 * Eksempel:
 *     [Person("Aisha", 30), Person("Hassan", 80), Person("Lin", 45)]
 *       →  "Daglig rapport\nAntall søkere: 3\nAntall pensjonister: 1\nEldste: Hassan (80) år"
 */
public final class SaksbehandlerRapport {

    private SaksbehandlerRapport() {}

    public static String dagligRapport(List<Person> personer) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 50 — ikke implementert ennå");
    }
}
