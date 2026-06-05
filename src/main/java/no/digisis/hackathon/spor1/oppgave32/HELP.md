# Hjelp — Oppgave 32: Poststed-oppslag

Du får et postnummer og en oppslagstabell (`Map`) fra postnummer til
poststed. Returnér poststedet — eller "Ukjent" hvis postnummeret ikke
finnes i tabellen.

Å tenke på:

- Et `Map` har en metode som slår opp en verdi, men gir en reserveverdi
  hvis nøkkelen mangler: `tabell.getOrDefault(postnummer, "Ukjent")`.
  Da slipper du å sjekke selv om nøkkelen finnes.
- Skriv "Ukjent" nøyaktig slik — testen sammenligner eksakt.
- Tom tabell og en nøkkel som ikke finnes skal begge gi "Ukjent".
