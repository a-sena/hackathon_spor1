# Hjelp — Oppgave 41: Filtrér berettigede søkere

En søker er berettiget når `alder >= 18` **og** `alder < 67`. Du skal
lage en **ny** liste med bare de berettigede, i samme rekkefølge.

Én måte å tenke på:

- Lag en tom resultatliste (`new ArrayList<>()`).
- Gå gjennom personene. Legg en person til i resultatet bare når begge
  betingelsene holder (`p.alder() >= 18 && p.alder() < 67`).
- Pass på grensene: `18` er med, `17` er ikke; `66` er med, `67` er ikke.

Tips: dette kan også gjøres med `stream().filter(...).toList()`.
