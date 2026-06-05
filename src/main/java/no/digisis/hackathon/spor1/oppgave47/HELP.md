# Hjelp — Oppgave 47: Dager til frist

Du skal regne ut antall dager mellom to datoer. Tallet skal være negativt
hvis fristen allerede er passert.

Å tenke på:

- `java.time` kan regne dette ut for deg:
  `java.time.temporal.ChronoUnit.DAYS.between(fra, frist)` gir antall hele
  dager fra den ene datoen til den andre.
- Rekkefølgen betyr noe: er `frist` før `fra`, blir resultatet negativt —
  akkurat det vi vil ha.
- Returtypen er `long` (et stort heltall), så du trenger ingen
  konvertering.
