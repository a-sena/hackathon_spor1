# Spor 1 — Nybegynner - Java

**Tema:** Min første saksbehandler-applikasjon.

I dette sporet skriver du femti små Java-programmer som er biter av en
saksbehandlerløsning for Direktoratet for Digital Saksbehandling (DDS). Hver
oppgave er delvis laget: metoden er klar for deg, du fyller bare inn koden i metoden 
og sjekker at testen blir grønn.

## Slik kommer du i gang

1. Sørg for at **JDK 26** og **Maven** er installert.
2. Åpne prosjektet i IntelliJ IDEA.
3. Kjør `mvn test` i terminalen og sjekk at alle testene er rødt (siden ingen oppgaver er løst enda).
4. Åpne `src/main/java/.../oppgave01/Hilsen.java`, bytt ut `TODO`-kroppen med din egen løsning, og kjør testen `oppgave01.HilsenTest` igjen til den blir grønn. Husk at du må fjerne `throws` koden.
5. Gjenta for oppgave 2, 3, 4, osv.

Hver oppgavemappe har en egen `HELP.md` med korte hint hvis du står fast.

## Oppgaver

Stigende vanskelighet, gruppert i tolv nivåer.

### Nivå 1 — Strenger og tall

| # | Oppgave | Poeng |
|---|---|---|
| 1 | Hilsen til søker | 5 |
| 2 | Saksoverskrift | 5 |
| 3 | Beregn alder | 5 |
| 4 | Formater beløp | 10 |
| 5 | Lag saksnummer | 10 |

### Nivå 2 — Boolske beslutninger

| # | Oppgave | Poeng |
|---|---|---|
| 6 | Myndig? (≥ 18) | 10 |
| 7 | År til pensjonsalder | 10 |
| 8 | Gyldig postnummer (4 siffer) | 10 |
| 9 | Innenfor inntektsgrense | 10 |
| 10 | Gyldig e-post (forenklet) | 10 |

### Nivå 3 — Kategorisering (switch)

| # | Oppgave | Poeng |
|---|---|---|
| 11 | Inntektskategori (Lav/Middels/Høy) | 15 |
| 12 | Pensjonsstatus (≥ 67) | 15 |
| 13 | Saksbehandlingsfrist (14/21/30 dager) | 15 |
| 14 | Prioritetskode (A/B/C) | 15 |

### Nivå 4 — Strengbehandling

| # | Oppgave | Poeng |
|---|---|---|
| 15 | Initialer | 10 |
| 16 | Stor forbokstav i navn | 15 |
| 17 | Maskér fødselsnummer | 15 |
| 18 | Snu en streng | 10 |
| 19 | Tell vokaler | 15 |
| 20 | Parse søkerlinje | 15 |

### Nivå 5 — Løkker

| # | Oppgave | Poeng |
|---|---|---|
| 21 | Saksnummer-spill | 15 |
| 22 | Tell ned til frist | 10 |
| 23 | Første over grense | 15 |
| 24 | Akkumuler til budsjett | 15 |
| 25 | Fremdriftslinje | 10 |

### Nivå 6 — Lister av tall

| # | Oppgave | Poeng |
|---|---|---|
| 26 | Sum årsinntekt | 15 |
| 27 | Snitt månedsinntekt | 15 |
| 28 | Fjern duplikater | 15 |
| 29 | Sortér synkende | 15 |
| 30 | Topp 3 inntekter | 15 |

### Nivå 7 — Maps og oppslag

| # | Oppgave | Poeng |
|---|---|---|
| 31 | Tell søknader per kommune | 15 |
| 32 | Poststed-oppslag | 15 |
| 33 | Grupper etter kategori | 15 |
| 34 | Snitt per kategori | 20 |
| 35 | Mest vanlige kommune | 20 |

### Nivå 8 — Sett og medlemskap

| # | Oppgave | Poeng |
|---|---|---|
| 36 | Unike kommuner | 10 |
| 37 | Felles søkere | 15 |
| 38 | Mangler i listen | 15 |

### Nivå 9 — Objekter og sortering

| # | Oppgave | Poeng |
|---|---|---|
| 39 | Tell pensjonister | 10 |
| 40 | Finn eldste søker | 15 |
| 41 | Filtrér berettigede søkere | 15 |
| 42 | Sortér søkere | 20 |

### Nivå 10 — Egne typer og tilstand

| # | Oppgave | Poeng |
|---|---|---|
| 43 | Definer og valider søknad | 15 |
| 44 | Saksstatus-overgang | 15 |
| 45 | Trygg parsing | 15 |

### Nivå 11 — Datoer og frister

| # | Oppgave | Poeng |
|---|---|---|
| 46 | Alder fra fødselsdato | 20 |
| 47 | Dager til frist | 15 |
| 48 | Er fristen utløpt? | 10 |

### Nivå 12 — Integrasjon

| # | Oppgave | Poeng |
|---|---|---|
| 49 | Validering av fødselsnummer (3.parts-bibliotek) | 15 |
| 50 | Saksbehandler-rapport | 25 |

**Sum:** 680 poeng over 50 oppgaver.

## Leaderboard

Hver gang du **pusher kode**, kjører GitHub Actions testene dine og
oppdaterer poengene dine på [leaderboard.digisis.org](https://leaderboard.digisis.org)
(1–3 minutter forsinkelse). En oppgave teller når **alle testene** for
den er grønne — delvise resultater gir 0 poeng.

## Spilleregler

- Det er lov å spørre. Det er forventet å spørre.
- Det er lov å samarbeide og hjelpe sidemannen.
- Hopp over en oppgave hvis den henger seg fast — kom tilbake til den senere.

Lykke til!
