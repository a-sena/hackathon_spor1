# Hjelp — Oppgave 46: Alder fra fødselsdato

Du skal regne ut hvor mange hele år en person har fylt på en gitt dato.

Å tenke på:

- Det holder ikke bare å trekke fødselsåret fra årstallet — du må vite om
  personen har hatt bursdag ennå i år. Hvis ikke, er alderen ett lavere.
- `java.time` har en innebygd måte å regne ut antall år mellom to datoer:
  `java.time.Period.between(fra, til)` gir et `Period`, og `getYears()`
  henter ut hele år. Den justerer for måned og dag for deg.
- Tenk gjennom kantene: født samme dato (alder 0), og dagen før kontra
  dagen etter bursdag.
