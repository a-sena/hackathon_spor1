# Hjelp — Oppgave 29: Sortér synkende

Du skal lage en **ny** liste med tallene sortert fra størst til minst,
uten å endre listen du fikk inn.

Å tenke på:

- Lag først en kopi av listen, og sortér kopien. Da forblir originalen
  urørt. I Java: `new ArrayList<>(tall)`.
- For synkende rekkefølge kan du sortere med
  `Comparator.reverseOrder()`.
- Den siste testen sjekker nettopp at input-listen er uendret etter at
  du har kalt funksjonen — så ikke sortér `tall` direkte.
