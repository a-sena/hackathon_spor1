package no.digisis.hackathon.spor1.oppgave17;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FnrMaskeTest {

    @Test
    void testFnr1() {
        assertEquals("*******2345", FnrMaske.maskerFnr("01059012345"));
    }

    @Test
    void testFnr2() {
        assertEquals("*******4556", FnrMaske.maskerFnr("11223344556"));
    }

    @Test
    void testFnr3() {
        assertEquals("*******0000", FnrMaske.maskerFnr("00000000000"));
    }

    @Test
    void testFnr4() {
        assertEquals("*******8901", FnrMaske.maskerFnr("12345678901"));
    }

    @Test
    void testFnr5() {
        assertEquals("*******2109", FnrMaske.maskerFnr("98765432109"));
    }
}
