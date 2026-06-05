# Hjelp — Oppgave 39: Tell pensjonister

Du skal telle hvor mange personer i listen som er pensjonister. En
person er pensjonist når `alder >= 67`.

Én måte å tenke på:

- Start med en teller på `0`.
- Gå gjennom listen med en løkke. For hver person, hent alderen med
  `p.alder()` og sjekk om den er `>= 67`. Hvis ja, øk telleren.
- Returnér telleren til slutt.

Tips: dette kan også løses med en strøm (`stream().filter(...).count()`),
men en vanlig løkke fungerer helt fint.
