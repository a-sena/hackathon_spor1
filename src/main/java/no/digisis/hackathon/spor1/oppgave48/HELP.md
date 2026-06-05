# Hjelp — Oppgave 48: Er fristen utløpt?

Du skal svare på om en frist er utløpt. Den er utløpt bare når dagen i
dag er **etter** fristen — på selve fristdagen er den fortsatt gyldig.

Å tenke på:

- `LocalDate` har en innebygd sammenligning: `iDag.isAfter(frist)` er
  `true` bare når `iDag` er strengt etter `frist`.
- Pass på kanten: samme dag skal gi `false`. `isAfter` gir nettopp
  `false` ved lik dato, så det stemmer av seg selv.
