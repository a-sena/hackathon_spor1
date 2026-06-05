package no.digisis.hackathon.spor1.oppgave20;

/**
 * Oppgave 20 — Parse søkerlinje (15 poeng)
 *
 * En søkerlinje har formatet "navn;alder". Del på semikolon, fjern
 * mellomrom rundt hvert felt, og lag et Person-objekt med navnet og
 * alderen som heltall.
 *
 *     "Aisha;34"        →  Person("Aisha", 34)
 *     "Lin Wang;28"     →  Person("Lin Wang", 28)
 *     " Hassan ; 67 "   →  Person("Hassan", 67)
 *
 * Du kan anta at linja alltid har begge felt.
 */
public final class Soekerlinje {

    private Soekerlinje() {}

    public static Person parse(String linje) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 20 — ikke implementert ennå");
    }
}
