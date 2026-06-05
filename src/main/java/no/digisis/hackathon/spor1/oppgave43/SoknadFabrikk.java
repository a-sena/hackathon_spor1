package no.digisis.hackathon.spor1.oppgave43;

/**
 * Oppgave 43 — Definer og valider Soknad (15 poeng)
 *
 * Lag en Soknad, men valider feltene først. Kast
 * IllegalArgumentException hvis:
 *   - saksnummer er blankt (tomt eller bare mellomrom),
 *   - navn er blankt, eller
 *   - belop er negativt (belop < 0).
 * Ellers returnér en ny Soknad. Et belop på 0 er gyldig.
 *
 *     lagSoknad("SAK-1","Aisha",1000)  →  Soknad("SAK-1","Aisha",1000)
 *     lagSoknad("SAK-1","",1000)       →  kaster IllegalArgumentException
 *     lagSoknad("SAK-1","Aisha",-1)    →  kaster IllegalArgumentException
 */
public final class SoknadFabrikk {

    private SoknadFabrikk() {}

    public static Soknad lagSoknad(String saksnummer, String navn, int belop) {
        // TODO
        throw new UnsupportedOperationException("Oppgave 43 — ikke implementert ennå");
    }
}
