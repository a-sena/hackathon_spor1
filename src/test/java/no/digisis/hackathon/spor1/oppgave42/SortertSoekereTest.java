package no.digisis.hackathon.spor1.oppgave42;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortertSoekereTest {

    @Test
    void testSorterPaAlderSynkende() {
        Person a = new Person("A", 30);
        Person b = new Person("B", 50);
        Person c = new Person("C", 40);
        assertEquals(List.of(b, c, a), SortertSoekere.sorterSoekere(List.of(a, b, c)));
    }

    @Test
    void testLikAlderSorterPaNavn() {
        Person bea = new Person("Bea", 40);
        Person ada = new Person("Ada", 40);
        assertEquals(List.of(ada, bea), SortertSoekere.sorterSoekere(List.of(bea, ada)));
    }

    @Test
    void testTom() {
        assertEquals(List.of(), SortertSoekere.sorterSoekere(List.of()));
    }

    @Test
    void testEnPerson() {
        Person x = new Person("X", 25);
        assertEquals(List.of(x), SortertSoekere.sorterSoekere(List.of(x)));
    }

    @Test
    void testBlandet() {
        Person lin = new Person("Lin", 30);
        Person aisha = new Person("Aisha", 30);
        Person hassan = new Person("Hassan", 80);
        assertEquals(List.of(hassan, aisha, lin),
            SortertSoekere.sorterSoekere(List.of(lin, aisha, hassan)));
    }
}
