package no.digisis.hackathon.spor1.oppgave22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NedtellingTest {

    @Test
    void test3() {
        assertEquals("3, 2, 1, frist!", Nedtelling.nedtelling(3));
    }

    @Test
    void test1() {
        assertEquals("1, frist!", Nedtelling.nedtelling(1));
    }

    @Test
    void test0() {
        assertEquals("frist!", Nedtelling.nedtelling(0));
    }

    @Test
    void test5() {
        assertEquals("5, 4, 3, 2, 1, frist!", Nedtelling.nedtelling(5));
    }
}
