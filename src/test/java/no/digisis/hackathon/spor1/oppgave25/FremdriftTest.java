package no.digisis.hackathon.spor1.oppgave25;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FremdriftTest {

    @Test
    void test0() {
        assertEquals("□□□□□□□□□□ 0%", Fremdrift.bar(0));
    }

    @Test
    void test30() {
        assertEquals("■■■□□□□□□□ 30%", Fremdrift.bar(30));
    }

    @Test
    void test100() {
        assertEquals("■■■■■■■■■■ 100%", Fremdrift.bar(100));
    }

    @Test
    void test45() {
        assertEquals("■■■■□□□□□□ 45%", Fremdrift.bar(45));
    }
}
