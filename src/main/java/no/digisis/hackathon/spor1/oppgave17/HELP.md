# Hjelp — Oppgave 17: Maskér fødselsnummer

Du skal maskere et fødselsnummer ved å beholde de **4 siste** tegnene og
bytte ut alle de foran med `*`: `"01059012345"` → `"*******2345"` (7
stjerner + 4 sifre).

Å tenke på:

- Dette er **ikke** validering — ikke sjekk Mod-11 eller lengde, bare
  maskér det du får inn.
- Du trenger to deler: et antall `*` lik `lengde - 4`, og de 4 siste
  tegnene. I Java kan du hente de siste med
  `fnr.substring(fnr.length() - 4)`; i TS med `fnr.slice(fnr.length - 4)`.
- For stjernene: bygg dem opp i en løkke i Java, eller bruk
  `'*'.repeat(...)` i TypeScript.
- Sett delene sammen til slutt.
