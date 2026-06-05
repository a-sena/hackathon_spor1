package no.digisis.hackathon.spor1.oppgave40;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EldsteSoekerTest {

    @Test
    void testEnPerson() {
        Person aisha = new Person("Aisha", 30);
        assertEquals(aisha, EldsteSoeker.finnEldste(List.of(aisha)).orElseThrow());
    }

    @Test
    void testEldsteForst() {
        Person hassan = new Person("Hassan", 80);
        assertEquals(hassan, EldsteSoeker.finnEldste(
            List.of(hassan, new Person("Lin", 45), new Person("Aisha", 30))).orElseThrow());
    }

    @Test
    void testEldsteSist() {
        Person hassan = new Person("Hassan", 80);
        assertEquals(hassan, EldsteSoeker.finnEldste(
            List.of(new Person("Aisha", 30), new Person("Lin", 45), hassan)).orElseThrow());
    }

    @Test
    void testFlereLikeGirForst() {
        Person astrid = new Person("Astrid", 70);
        assertEquals(astrid, EldsteSoeker.finnEldste(
            List.of(astrid, new Person("Aisha", 30), new Person("Hassan", 70))).orElseThrow());
    }

    @Test
    void testTom() {
        assertTrue(EldsteSoeker.finnEldste(List.of()).isEmpty());
    }
}
