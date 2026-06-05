# Hjelp — Oppgave 9: Innenfor inntektsgrense

Du skal sjekke om `belop` ligger mellom `nedre` og `ovre`, der begge
grensene teller med (inklusivt).

Å tenke på:

- Du må sjekke **to** ting samtidig: at beløpet ikke er for lavt, og at
  det ikke er for høyt. Bind dem sammen med `&&`.
- Fordi grensene er inklusive, bruk `>=` og `<=` (ikke `>` og `<`).
  Da gir både `belop == nedre` og `belop == ovre` svaret `true`.
