# Hjelp — Oppgave 40: Finn eldste søker

Du skal finne personen med høyest alder. Hvis flere har samme alder,
velger du den **første** i listen. Hvis listen er tom, finnes det ingen
eldste — returnér `Optional.empty()`.

Én måte å tenke på:

- Hold styr på «beste til nå» i en variabel som starter som `null`.
- Gå gjennom listen. Bytt til en ny person bare når den er **strengt**
  eldre enn den du har (`>`, ikke `>=`). Da beholder du den første ved
  likhet.
- Til slutt: `Optional.ofNullable(beste)` gir `Optional.empty()` når du
  aldri fant noen (tom liste).
