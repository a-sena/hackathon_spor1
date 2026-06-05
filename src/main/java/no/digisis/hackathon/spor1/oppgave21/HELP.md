# Hjelp — Oppgave 21: Saksnummer-spill

Du skal gå gjennom tallene fra `1` til og med `n` og legge én streng inn
i lista for hvert tall.

Tenk slik:

- Lag en tom liste (`new java.util.ArrayList<>()`) og en `for`-løkke fra
  `1` til og med `n`.
- For hvert tall: sjekk **delelig på 15 først** (`i % 15 == 0`), så på 3,
  så på 5. Hvis du sjekker 15 sist, treffer du aldri "SakFrist".
- Faller tallet utenfor alle reglene, legg inn selve tallet som streng
  (`String.valueOf(i)` eller `Integer.toString(i)`).
- Når `n` er 0, kjører ikke løkka i det hele tatt, og du sitter igjen med
  en tom liste — det er riktig.

Pass på at strengene staves nøyaktig `"Sak"`, `"Frist"` og `"SakFrist"`
— testen sammenligner eksakt.
