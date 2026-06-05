# Hjelp — Oppgave 27: Snitt månedsinntekt

Du skal regne ut gjennomsnittet: summen av inntektene delt på hvor mange
det er. Svaret er et desimaltall (`double`).

Tenk slik:

- Sjekk **tom liste først** og returner 0 — ellers deler du på 0.
- Summer alle tallene (som i forrige oppgave).
- Del summen på antallet. Pass på at delingen skjer som **desimaltall**:
  gjør summen om til `double` før du deler (`(double) s / inntekter.size()`),
  ellers kapper Java bort desimalene.

`[1, 2]` skal gi `1.5` — får du `1.0`, har du en heltallsdivisjon som må
gjøres om til desimaldivisjon.
