# Hjelp — Oppgave 4: Formater beløp

Du skal gjøre et heltall om til en lesbar streng med mellomrom som
tusenskille, og «kr» til slutt: `1234567` → `1 234 567 kr`.

Én måte å tenke på:

- Gjør tallet om til en streng, og gå gjennom sifrene fra **høyre mot
  venstre**. Sett inn et mellomrom for hver tredje siffer — men ikke
  helt fremst.
- Bruk et **vanlig** mellomrom (ikke et spesialtegn) — testen
  sammenligner eksakt.
- Små tall (`0`, `999`) skal ikke ha noe mellomrom i det hele tatt.

Tips: det kan være enklere å bygge strengen baklengs og snu den til
slutt (`new StringBuilder(...).reverse()`).
