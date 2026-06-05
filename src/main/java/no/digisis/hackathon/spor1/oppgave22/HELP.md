# Hjelp — Oppgave 22: Tell ned til frist

Du skal bygge én streng som teller ned fra `dager` til `1`, og som
alltid ender på `"frist!"`.

Tenk slik:

- Bruk en `StringBuilder` og en `for`-løkke som teller **nedover**
  (`for (int d = dager; d >= 1; d--)`).
- For hvert tall legger du på tallet etterfulgt av `", "` (komma og et
  vanlig mellomrom).
- Til slutt legger du på `"frist!"`.
- Når `dager` er 0, kjører ikke løkka, og du sitter igjen med bare
  `"frist!"` — det er riktig.

Legg merke til at hvert tall (også det siste, `1`) får komma og
mellomrom etter seg før `frist!`. Testen sammenligner eksakt.
