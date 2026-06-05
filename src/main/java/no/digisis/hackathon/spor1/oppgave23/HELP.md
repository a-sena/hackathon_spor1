# Hjelp — Oppgave 23: Første over grense

Du skal returnere **indeksen** (posisjonen) til det første beløpet som
er strengt større enn grensen — ikke selve beløpet.

Tenk slik:

- Bruk en `for`-løkke med en teller `i` fra 0 og oppover, slik at du har
  tilgang til indeksen: `for (int i = 0; i < inntekter.size(); i++)`.
- Sjekk `inntekter.get(i) > grense` (strengt større — ikke `>=`). Er det
  sant, returner `i` med en gang.
- Kommer du gjennom hele lista uten å finne noe, returner `-1`.
- En tom liste går rett til `-1`, siden løkka ikke kjører.

«Strengt større» betyr at et beløp som er *likt* grensen ikke teller.
