# Hjelp — Oppgave 7: År til pensjonsalder

Du skal regne ut hvor mange år det er igjen til pensjonsalder (67 år).

Å tenke på:

- Differansen er `67 - alder`. Det dekker de fleste tilfellene.
- Men svaret skal **aldri** være negativt: har personen allerede passert
  67, skal du returnere `0`. Bruk `Math.max(0, ...)` for å gulve svaret.
