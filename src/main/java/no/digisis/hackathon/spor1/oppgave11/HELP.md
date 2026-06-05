# Hjelp — Oppgave 11: Inntektskategori

Du skal plassere en månedslønn i én av tre kategorier: `LAV`, `MIDDELS`
eller `HOY`. Kategoriene finnes ferdig i enum-en `Inntektskategori` —
du skal bare returnere riktig verdi.

Grensene:

- under 30 000 → `LAV`
- 30 000 til og med 60 000 → `MIDDELS`
- over 60 000 → `HOY`

Å tenke på:

- Test grensene fra **lavest til høyest** med `if`-er. Sjekker du
  `< 30000` først, vet du i neste sjekk at lønna er minst 30 000, så
  `<= 60000` er nok til å skille `MIDDELS` fra `HOY`.
- Vær nøye med `<` kontra `<=`: `30000` skal bli `MIDDELS`, ikke `LAV`,
  og `60000` skal bli `MIDDELS`, ikke `HOY`.
