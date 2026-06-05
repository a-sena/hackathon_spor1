package no.digisis.hackathon.spor1.oppgave07;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PensjonsalderTest {

    @Test
    void test30Gir37() {
        assertEquals(37, Pensjonsalder.aarIgjen(30));
    }

    @Test
    void test66Gir1() {
        assertEquals(1, Pensjonsalder.aarIgjen(66));
    }

    @Test
    void test67Gir0() {
        assertEquals(0, Pensjonsalder.aarIgjen(67));
    }

    @Test
    void test70Gir0() {
        assertEquals(0, Pensjonsalder.aarIgjen(70));
    }

    @Test
    void test0Gir67() {
        assertEquals(67, Pensjonsalder.aarIgjen(0));
    }
}
