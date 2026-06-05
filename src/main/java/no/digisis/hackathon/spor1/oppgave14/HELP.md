# Hjelp — Oppgave 14: Prioritetskode

Du skal returnere en `Prioritetskode` (`A`, `B` eller `C`) ut fra alder og
månedslønn.

Reglene sjekkes i rekkefølge — den første som passer vinner:

1. Er `alder` 67 eller mer? → `A`
2. Ellers: er `manedslonn` mindre enn 30000? → `B`
3. Ellers → `C`

Å tenke på:

- Bruk `if`-setninger og **returnér med en gang** en regel slår til, så
  faller du naturlig videre til neste sjekk.
- Enumen `Prioritetskode` er allerede laget for deg — du skal bare
  returnere riktig verdi (`Prioritetskode.A` osv.). I TypeScript er det
  bare strengene `'A'`, `'B'`, `'C'`.
- Pass på grensene: nøyaktig 67 gir `A`, og nøyaktig 30000 er ikke under
  grensen (gir altså `C`).
