package no.digisis.hackathon.spor1.oppgave06;

/**
 * Oppgave 6 — Myndig? (10 poeng)
 *
 * En person er myndig fra og med fylte 18 år. Returner true dersom
 * alderen er 18 eller mer, ellers false.
 *
 *     17  →  false
 *     18  →  true
 *     19  →  true
 */
public final class Myndig {

    private Myndig() {}

    public static boolean erMyndig(int alder) {
        // TODO
        if (alder >=18){
        return true;
        }
        else{
        return false;
}}
}