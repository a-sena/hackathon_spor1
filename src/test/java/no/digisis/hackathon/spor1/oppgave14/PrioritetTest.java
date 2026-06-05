package no.digisis.hackathon.spor1.oppgave14;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PrioritetTest {

    @Test
    void test70Og50000ErA() {
        assertEquals(Prioritetskode.A, Prioritet.prioritet(70, 50000));
    }

    @Test
    void test67Og0ErA() {
        assertEquals(Prioritetskode.A, Prioritet.prioritet(67, 0));
    }

    @Test
    void test40Og20000ErB() {
        assertEquals(Prioritetskode.B, Prioritet.prioritet(40, 20000));
    }

    @Test
    void test40Og30000ErC() {
        assertEquals(Prioritetskode.C, Prioritet.prioritet(40, 30000));
    }

    @Test
    void test25Og80000ErC() {
        assertEquals(Prioritetskode.C, Prioritet.prioritet(25, 80000));
    }
}
