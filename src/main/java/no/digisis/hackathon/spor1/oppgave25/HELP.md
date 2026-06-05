# Hjelp — Oppgave 25: Fremdriftslinje

Du skal lage en linje med 10 celler: noen fylte (`■`) og resten tomme
(`□`), etterfulgt av et mellomrom og prosenten med `%`.

Tenk slik:

- Antall fylte celler er prosenten delt på 10, rundet nedover —
  heltallsdivisjon (`prosent / 10`) gjør akkurat dette.
- **Klem** verdien til mellom 0 og 10: er den under 0, sett den til 0;
  er den over 10, sett den til 10. (Da tåler du både negative tall og
  tall over 100.)
- Bygg strengen: skriv `■` så mange ganger som antallet fylte, deretter
  `□` for resten opp til 10. Legg så på `" " + prosent + "%"`.

Pass på at du bruker akkurat tegnene `■` (U+25A0) og `□` (U+25A1) — kopier
dem gjerne fra oppgaveteksten. Testen sammenligner eksakt.
