# Hjelp — Oppgave 19: Tell vokaler

Du skal telle vokalene i en streng. Vokalene er `a e i o u y æ ø å` —
uavhengig av om de er store eller små bokstaver.

Å tenke på:

- Lag en streng med alle vokalene (f.eks. `"aeiouyæøå"`) som en
  «fasit» du kan slå opp i.
- Gjør hele teksten **liten** med `toLowerCase()` først, så slipper du å
  ta med store bokstaver i fasiten.
- Gå gjennom tegnene ett for ett. For hvert tegn: sjekk om det finnes i
  vokal-strengen (`vokaler.indexOf(c) >= 0` i Java, `vokaler.includes(c)`
  i TS) og tell opp hvis det gjør det.
- `y` regnes som vokal her, og de norske `æ ø å` skal også telles.
