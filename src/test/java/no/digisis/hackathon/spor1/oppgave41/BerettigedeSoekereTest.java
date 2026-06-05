package no.digisis.hackathon.spor1.oppgave41;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BerettigedeSoekereTest {

    @Test
    void test18ErBerettiget() {
        Person a = new Person("A", 18);
        assertEquals(List.of(a), BerettigedeSoekere.filtrer(List.of(a)));
    }

    @Test
    void test66ErBerettiget() {
        Person a = new Person("A", 66);
        assertEquals(List.of(a), BerettigedeSoekere.filtrer(List.of(a)));
    }

    @Test
    void test17ErIkkeBerettiget() {
        assertEquals(List.of(), BerettigedeSoekere.filtrer(List.of(new Person("A", 17))));
    }

    @Test
    void test67ErIkkeBerettiget() {
        assertEquals(List.of(), BerettigedeSoekere.filtrer(List.of(new Person("A", 67))));
    }

    @Test
    void testBlandetListe() {
        Person a = new Person("A", 30);
        Person d = new Person("D", 50);
        assertEquals(List.of(a, d), BerettigedeSoekere.filtrer(
            List.of(a, new Person("B", 70), new Person("C", 17), d)));
    }

    @Test
    void testTom() {
        assertEquals(List.of(), BerettigedeSoekere.filtrer(List.of()));
    }
}
