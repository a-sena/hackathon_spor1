package no.digisis.hackathon.spor1.oppgave39;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTellerTest {

    @Test
    void test2Pensjonister() {
        List<Person> personer = List.of(
            new Person("Aisha", 30),
            new Person("Hassan", 80),
            new Person("Astrid", 67));
        assertEquals(2, PersonTeller.antallPensjonister(personer));
    }

    @Test
    void test0Pensjonister() {
        List<Person> personer = List.of(
            new Person("Aisha", 30),
            new Person("Lin", 45));
        assertEquals(0, PersonTeller.antallPensjonister(personer));
    }

    @Test
    void testTom() {
        assertEquals(0, PersonTeller.antallPensjonister(List.of()));
    }
}
