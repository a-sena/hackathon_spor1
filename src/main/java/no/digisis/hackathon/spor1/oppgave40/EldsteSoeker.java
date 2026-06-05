package no.digisis.hackathon.spor1.oppgave40;

/**
 * Oppgave 40 — Finn eldste søker (15 poeng)
 *
 * Finn personen med høyest alder. Hvis flere har samme høyeste alder,
 * skal den FØRSTE i listen velges. Hvis listen er tom, finnes det ingen
 * eldste — returnér Optional.empty().
 *
 *     [Person("Hassan",80), Person("Lin",45)]            →  Hassan
 *     [Person("Astrid",70), Person("Hassan",70)]         →  Astrid (først)
 *     []                                                 →  Optional.empty()
 */
public final class EldsteSoeker {

    private EldsteSoeker() {}

    public static java.util.Optional<Person> finnEldste(java.util.List<Person> personer) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 40 — ikke implementert ennå");
    }
}
