# Hjelp — Oppgave 15: Initialer

Du skal lage initialene til et navn: første bokstav i hvert ord, gjort
stor, slått sammen. `"Per Olav Hansen"` → `"POH"`.

Å tenke på:

- **Del** navnet på mellomrom. I Java kan du bruke `split("\\s+")` (deler
  på ett eller flere mellomrom); i TypeScript `split(/\s+/)`.
- For hvert ord: ta **første tegn** og gjør det til stor bokstav
  (`Character.toUpperCase(...)` i Java, `.toUpperCase()` i TS).
- **Ignorer tomme ledd** — et tomt navn eller ekstra mellomrom skal ikke
  gi noen bokstav. Sjekk lengden på ordet før du tar første tegn.
- Bygg opp resultatet underveis (`StringBuilder` i Java, `join('')` i TS).
