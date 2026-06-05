# Hjelp — Oppgave 10: Gyldig e-post (forenklet)

Dette er en **forenklet** sjekk — ikke en full e-postvalidering. Du skal
bare kontrollere fire ting:

- Det er én `@` i strengen, og det finnes minst ett tegn **før** den.
- Etter `@` (domenet) er det et punktum `.` som verken står **først**
  eller **sist**.

Å tenke på:

- `epost.indexOf('@')` gir posisjonen til den første `@`. Er den `<= 0`,
  finnes ingen `@`, eller så står den helt fremst — begge ugyldige.
- Sjekk at det ikke finnes en `@` til: `epost.indexOf('@', at + 1)` skal
  være `-1`.
- Plukk ut domenet med `epost.substring(at + 1)`, finn punktumet med
  `indexOf('.')`, og sjekk at posisjonen er større enn 0 og mindre enn
  `domene.length() - 1`.
