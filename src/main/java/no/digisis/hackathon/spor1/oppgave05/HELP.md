# Hjelp — Oppgave 5: Lag saksnummer

Et saksnummer er `SAK-` etterfulgt av nummeret polstret til **minst fire
sifre** med ledende nuller: `42` → `SAK-0042`.

- I Java gir `String.format("%04d", nr)` deg nullpolstringen ferdig.
- Tall med flere enn fire sifre skal *ikke* kuttes: `12345` →
  `SAK-12345`.
