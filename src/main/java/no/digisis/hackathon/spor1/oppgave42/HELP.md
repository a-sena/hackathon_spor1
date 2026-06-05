# Hjelp — Oppgave 42: Sortér søkere

Du skal sortere personene på alder **synkende** (eldst først), og når to
er like gamle, på navn **stigende** (alfabetisk). Returnér en **ny**
liste — den opprinnelige skal ikke endres.

Én måte å tenke på:

- Lag en kopi av listen først (`new ArrayList<>(personer)`) så du ikke
  endrer originalen, og sorter kopien.
- Bygg en `Comparator`: start med `Comparator.comparingInt(Person::alder)`,
  snu den med `.reversed()` for synkende alder, og legg på
  `.thenComparing(Person::navn)` for å bryte uavgjort på navn.
- Bruk `r.sort(komparator)` og returnér `r`.
