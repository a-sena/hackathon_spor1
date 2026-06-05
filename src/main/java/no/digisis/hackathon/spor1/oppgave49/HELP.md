# Hjelp — Oppgave 49: Validering av fødselsnummer

Et fødselsnummer på 11 sifre har to kontrollsiffer beregnet med Mod-11.
Du skal **ikke** skrive den matematikken selv — bruk biblioteket som
allerede ligger i prosjektet.

Å tenke på:

- Avhengigheten `no.bekk.bekkopen:nocommons` er allerede lagt til i
  `pom.xml`. Du trenger bare å importere og kalle den.
- Slå opp validatoren i biblioteket: se etter en klasse som validerer
  fødselsnummer, med en metode som svarer ja/nei på om et nummer er
  gyldig. Importér den øverst i fila.
- **Sjekk null først** — før du kaller biblioteket. Et `null`-fnr skal gi
  `false`, ikke en kræsj.
- Biblioteket kan kaste en `RuntimeException` på rar inndata. Pakk kallet
  i `try/catch` og returner `false` ved unntak, så et ugyldig nummer
  aldri velter testen.
