package no.digisis.hackathon.spor1.oppgave07;

/**
 * Oppgave 7 — År til pensjonsalder (10 poeng)
 *
 * Pensjonsalderen er 67 år. Returner hvor mange år en person har igjen
 * til pensjonsalder. Har personen allerede fylt 67, skal svaret være 0
 * (aldri et negativt tall).
 *
 *     30  →  37
 *     66  →  1
 *     67  →  0
 *     70  →  0
 */
public final class Pensjonsalder {

    private Pensjonsalder() {}

    public static int aarIgjen(int alder) {
        // TODO

        int arigjen = 67 - alder;
        if (alder >= 67) {
            return 0;
        }  return arigjen;
    }}
