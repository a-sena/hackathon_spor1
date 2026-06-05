# Hjelp — Oppgave 16: Stor forbokstav

Du skal gjøre første bokstav i hvert ord stor og resten små:
`"per olav hansen"` → `"Per Olav Hansen"`. Merk at `"AISHA"` skal bli
`"Aisha"` — altså må du også gjøre resten av ordet *lite*.

Å tenke på:

- **Del** navnet på ett enkelt mellomrom (`split(" ")`), så beholder du
  mellomrommene når du setter ordene sammen igjen.
- For hvert ord: stor forbokstav + resten av ordet i små bokstaver.
  Bruk `toLowerCase()` på resten (`ord.substring(1)` i Java,
  `ord.slice(1)` i TS).
- Pass på **tomme ord** — la dem være som de er, så slipper du feil på
  tom streng.
- Sett ordene sammen igjen med ett mellomrom (`String.join(" ", ...)` i
  Java, `join(' ')` i TS).
