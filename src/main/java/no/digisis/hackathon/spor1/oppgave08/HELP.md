# Hjelp — Oppgave 8: Gyldig postnummer

Et gyldig postnummer er nøyaktig fire sifre — verken færre eller flere,
og ingen andre tegn enn `0`–`9`.

Å tenke på:

- Du kan sjekke begge kravene på én gang med et **regulært uttrykk**:
  `postnummer.matches("\\d{4}")` er sann bare når hele strengen er
  fire sifre.
- Pass på `null`: sjekk `postnummer != null` før du kaller `matches`,
  ellers får du en `NullPointerException`.
- Den tomme strengen `""` har null sifre og skal gi `false`.
