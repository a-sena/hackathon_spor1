# Hjelp — Oppgave 44: Saksstatus-overgang

En sak går gjennom statusene `MOTTATT` → `UNDER_BEHANDLING` → `VEDTAK`.
`VEDTAK` er sluttstatus — den blir værende `VEDTAK`.

Én måte å tenke på:

- Bruk en `switch` på `status` og returnér neste status for hvert
  tilfelle.
- En switch-uttrykk passer fint her:
  `return switch (status) { case MOTTATT -> ...; ... };`.
- Husk at `VEDTAK` skal returnere seg selv (`VEDTAK`).
