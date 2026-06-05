# Hjelp — Oppgave 45: Trygg parsing

Du skal forsøke å tolke en tekst som et heltall. Lykkes det, returnerer
du tallet; feiler det, returnerer du standardverdien i stedet.

Å tenke på:

- Trim teksten først (`s.trim()`) så mellomrom i endene ikke ødelegger.
- `Integer.parseInt(...)` kaster et `NumberFormatException` når teksten
  ikke er et gyldig heltall (f.eks. `"abc"`, `""` eller `"12x"`).
- Pakk forsøket inn i `try { ... } catch (NumberFormatException e) { ... }`
  og returner standardverdien fra `catch`-blokken.
