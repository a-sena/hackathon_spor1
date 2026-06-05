# Hjelp — Oppgave 31: Tell per kommune

Du skal telle hvor mange ganger hvert kommunenavn dukker opp, og samle
det i et oppslag (`Map`) fra navn til antall.

Å tenke på:

- Lag et tomt `Map<String, Integer>` (en `HashMap`), og gå gjennom
  listen ett navn av gangen. For hvert navn øker du tellingen for det
  navnet med 1.
- Første gang du ser et navn finnes det ingen telling ennå — da skal den
  starte på 1. `map.merge(navn, 1, Integer::sum)` håndterer begge
  tilfellene i én linje.
- En tom liste gir et tomt `Map`.
