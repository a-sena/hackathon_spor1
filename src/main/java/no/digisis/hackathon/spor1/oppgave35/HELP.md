# Hjelp — Oppgave 35: Mest vanlige kommune

Du skal finne kommunen som forekommer flest ganger. Hvis to kommuner er
like vanlige, vinner den som **først** nådde det høyeste antallet.

Å tenke på:

- Tell forekomster som i oppgave 31, men hold samtidig styr på hvem som
  er best så langt: en `best`-streng og et `bestN`-antall.
- For hvert navn øker du tellingen, og hvis den nye tellingen er
  **strengt større** enn `bestN` (`>`, ikke `>=`), oppdaterer du `best`.
  Slik vinner den som nådde antallet først ved likhet.
- `map.merge(navn, 1, Integer::sum)` returnerer den nye tellingen — den
  kan du sammenligne med `bestN` med en gang.
- Tom liste gir "" (tom streng). Start derfor `best` som "".
