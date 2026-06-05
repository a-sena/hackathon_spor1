# Hjelp — Oppgave 50: Saksbehandler-rapport

Du skal bygge en rapport på fire linjer. Dette er en oppsummerings­oppgave
som samler flere ting du har gjort før: telle, filtrere og finne størst.

Å tenke på:

- **Antall søkere** er bare `personer.size()`.
- **Antall pensjonister** er hvor mange som har `alder() >= 67`. Tell med
  en løkke, eller en strøm.
- **Eldste** finner du ved å gå gjennom lista og holde styr på den med
  høyest alder. Start med den første og bytt bare når du ser en som er
  **strengt høyere** — da vinner den første ved lik alder.
- **Tom liste** er et eget tilfelle: da skal siste linje være nøyaktig
  `Eldste: ingen` (ingen navn, ingen alder).
- Sett sammen linjene med `"\n"` mellom, og **ingen** linjeskift på
  slutten. Reproduser teksten eksakt — også ordene «Daglig rapport»,
  «Antall søkere:», «Antall pensjonister:», «Eldste:» og « år».
