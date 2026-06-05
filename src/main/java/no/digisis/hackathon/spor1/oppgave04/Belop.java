package no.digisis.hackathon.spor1.oppgave04;

/**
 * Oppgave 4 — Formater beløp (10 poeng)
 *
 * Gjør et heltall om til en lesbar kronesum med mellomrom som
 * tusenskille og "kr" til slutt:
 *
 *     1234567  →  "1 234 567 kr"
 *     1000     →  "1 000 kr"
 *     999      →  "999 kr"
 *     0        →  "0 kr"
 *
 * Bruk vanlig mellomrom mellom sifrene. Du kan anta at beløpet ikke er
 * negativt.
 */
public final class Belop {

    private Belop() {}

    public static String formaterBelop(int kroner) {
        // TODO
        //
        String talltoString = String.valueOf(kroner);

        StringBuilder sb = new StringBuilder();
        int teller = 0;


        for (int i = talltoString.length() - 1; i >= 0; i--) {


            if (teller > 0 && teller % 3 == 0) {
                sb.append(" ");
            }

            sb.append(talltoString.charAt(i));
            teller++;
        }


        return sb.reverse().toString() + " kr";
    }
    }
