# Hjelp — Oppgave 30: Topp 3 inntekter

Du skal finne de 3 høyeste tallene og returnere dem sortert fra størst
til minst. Har listen færre enn 3 tall, returnerer du bare dem som
finnes.

Å tenke på:

- Sortér først hele listen synkende (samme idé som oppgave 29 — kopiér
  først så du ikke endrer input), og ta deretter de første elementene.
- Hvor mange skal du ta? Aldri mer enn 3, men heller ikke mer enn antall
  tall i listen. `Math.min(3, antall)` gir riktig grense.
- I Java: `subList(0, n)` gir de første `n` elementene. Pakk gjerne
  resultatet i en ny `ArrayList`.
