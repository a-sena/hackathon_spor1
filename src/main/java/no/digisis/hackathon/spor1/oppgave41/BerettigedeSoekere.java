package no.digisis.hackathon.spor1.oppgave41;

/**
 * Oppgave 41 — Filtrér berettigede søkere (15 poeng)
 *
 * En søker er berettiget når alderen er 18 eller mer OG under 67
 * (alder >= 18 og alder < 67). Returnér en NY liste med bare de
 * berettigede søkerne, i samme rekkefølge som i den opprinnelige listen.
 *
 *     [Person("A",18)]   →  [Person("A",18)]
 *     [Person("A",67)]   →  []
 *     [A 30, B 70, C 17, D 50]  →  [A 30, D 50]
 */
public final class BerettigedeSoekere {

    private BerettigedeSoekere() {}

    public static java.util.List<Person> filtrer(java.util.List<Person> personer) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 41 — ikke implementert ennå");
    }
}
