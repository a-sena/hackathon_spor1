# Hjelp — Oppgave 36: Unike kommuner

Du skal fjerne duplikater og returnere de unike kommunene sortert
alfabetisk stigende.

Å tenke på:

- Et `Set` inneholder hvert element bare én gang — legger du listen inn
  i et `Set`, forsvinner duplikatene gratis.
- Du trenger dem også sortert. Et `TreeSet` holder elementene sortert
  automatisk, så `new ArrayList<>(new TreeSet<>(kommuner))` gir både
  unike og sorterte verdier på én linje.
- En tom liste gir en tom liste.
