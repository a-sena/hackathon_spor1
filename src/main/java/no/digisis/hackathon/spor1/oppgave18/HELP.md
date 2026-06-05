# Hjelp — Oppgave 18: Snu en streng

Du skal returnere strengen baklengs: `"abc"` → `"cba"`.

Å tenke på:

- I Java finnes det en innebygd snarvei: `new StringBuilder(s).reverse()`
  gir deg strengen baklengs — husk `.toString()` til slutt.
- I TypeScript kan du dele strengen i enkelttegn med `[...s]`, snu lista
  med `.reverse()`, og slå sammen igjen med `.join('')`.
- Tom streng og ett enkelt tegn skal bare komme uendret tilbake — begge
  metodene over håndterer dette av seg selv.
