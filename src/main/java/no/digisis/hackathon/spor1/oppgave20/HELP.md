# Hjelp — Oppgave 20: Parse søkerlinje

Du skal tolke en linje på formatet `"navn;alder"` og lage et
`Person`-objekt. `" Hassan ; 67 "` → `Person("Hassan", 67)`.

Å tenke på:

- **Del** linja på semikolon (`;`). Da får du to deler: navn og alder.
- **Fjern mellomrom** rundt hvert felt med `trim()` — både navnet og
  tallet kan ha mellomrom rundt seg.
- Alderen kommer inn som tekst og må gjøres om til et tall:
  `Integer.parseInt(...)` i Java, `Number(...)` i TypeScript.
- `Person` er allerede laget for deg (en `record` i Java, en `type` +
  `lagPerson(...)` i TypeScript) — du skal bare opprette den med de to
  verdiene.
