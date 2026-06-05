# Hjelp — Oppgave 12: Pensjonsstatus

Du skal returnere `PENSJONIST` for personer som er 67 år eller eldre, og
`YRKESAKTIV` for alle andre. Verdiene finnes ferdig i enum-en
`Pensjonsstatus`.

Å tenke på:

- Det er kun ett skille: `alder >= 67`. En `if`/`else` med to returer er
  nok.
- Pass på grensen: 67 selv skal gi `PENSJONIST` (fra og med 67), så bruk
  `>=`, ikke `>`.
