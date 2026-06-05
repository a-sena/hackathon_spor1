# Hjelp — Oppgave 37: Felles søkere

Du skal finne snittet av to lister: de verdiene som finnes i **begge**.
Resultatet skal følge rekkefølgen i den **første** listen (`a`), og hver
verdi skal bare være med én gang.

Én måte å tenke på:

- Legg alle verdiene fra `b` i et `HashSet` så du raskt kan sjekke om en
  verdi finnes der (`contains`).
- Gå gjennom `a` i rekkefølge. For hver verdi som finnes i b-settet,
  legg den til i resultatet.
- For å unngå duplikater kan du samle resultatet i et
  `LinkedHashSet` (det husker rekkefølgen og dropper duplikater), og så
  lage en liste av det til slutt.
