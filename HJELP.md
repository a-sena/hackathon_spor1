# Vanlige feil og hvordan løse dem

## Testen kaster `UnsupportedOperationException`

Det betyr at du ikke har skrevet inn løsningen ennå — `TODO`-kroppen
er fortsatt der. Bytt ut linjen som kaster exception (throws ...) med din egen kode.

## "Cannot find symbol"

Du har skrevet et navn som ikke finnes (kanskje en skrivefeil, eller
glemt `import`). Sjekk stavemåten og at klassen du bruker er importert
øverst i filen.

## Testen er rød, men jeg ser ikke hvorfor

Trykk på testen i IntelliJ — du ser "expected" (forventet svar) og
"actual" (det din kode returnerte). Sammenlign dem nøye, ofte er det
et lite mellomrom eller en stor/liten bokstav som er feil.

## "Class file has wrong version"

Java-versjonen i prosjektet (26) stemmer ikke med Java-versjonen som
kjører. Sjekk `mvn -version` og at IntelliJ peker på riktig JDK
(File → Project Structure → SDK).

## Spør oss!

Ikke sitt fast i mer enn 5 minutter — vink på en hjelper. Det er det vi er der for.
