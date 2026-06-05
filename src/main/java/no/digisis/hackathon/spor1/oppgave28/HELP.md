# Hjelp — Oppgave 28: Fjern duplikater

Du skal lage en ny liste med hvert tall bare én gang. Det er den
**første** forekomsten som teller, og rekkefølgen skal bevares.

Tenk slik:

- Lag en tom resultatliste og et `java.util.Set<Integer>` for å huske hva
  du allerede har sett.
- Gå gjennom tallene i rekkefølge. Et `HashSet` sin `add` returnerer
  `true` bare hvis tallet var nytt — da legger du det også i
  resultatlista. Var det allerede der, hopper du over.
- Returner resultatlista.

På `[3, 1, 3, 2, 1]` skal du få `[3, 1, 2]` — altså rekkefølgen fra
første gang hvert tall dukket opp.
