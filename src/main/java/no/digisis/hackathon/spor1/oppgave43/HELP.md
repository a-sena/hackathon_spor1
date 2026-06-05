# Hjelp — Oppgave 43: Definer og valider Soknad

Du skal lage en `Soknad`, men sjekke feltene først. Kast en
`IllegalArgumentException` hvis `saksnummer` er blankt, `navn` er blankt,
eller `belop` er negativt. Ellers returnér en ny `Soknad`. Et beløp på
`0` er gyldig.

Én måte å tenke på:

- «Blankt» betyr tomt eller bare mellomrom — `String.isBlank()` fanger
  begge deler. Husk å sjekke `null` også (`s == null || s.isBlank()`).
- Sjekk hver regel for seg, og kast så snart en feiler:
  `throw new IllegalArgumentException("...")`.
- `belop < 0` er ugyldig, men `belop == 0` skal slippe gjennom.
- Når alt er gyldig: `return new Soknad(saksnummer, navn, belop);`
