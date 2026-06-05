# Hjelp — Oppgave 24: Akkumuler til budsjett

Du skal betale ut beløpene ett etter ett så lenge budsjettet rekker, og
telle hvor mange som ble innvilget. Du **stopper helt** ved det første
beløpet som ikke får plass — du hopper ikke over det for å se om et
senere, mindre beløp passer.

Tenk slik:

- Hold styr på hvor mye som er igjen (`int rest = budsjett`) og hvor
  mange du har innvilget (`int n = 0`).
- Gå gjennom beløpene i rekkefølge. For hvert beløp: hvis det er mindre
  enn eller lik resten, trekk det fra resten og øk telleren.
- Passer beløpet ikke, bryt ut av løkka med `break`.
- Til slutt returnerer du telleren.

Et beløp som er nøyaktig lik resten skal få plass (bruk `<=`). En tom
liste gir 0.
