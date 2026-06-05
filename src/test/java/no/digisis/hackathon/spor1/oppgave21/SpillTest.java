package no.digisis.hackathon.spor1.oppgave21;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpillTest {

    @Test
    void test1() {
        assertEquals(List.of("1"), Spill.spill(1));
    }

    @Test
    void test3() {
        assertEquals(List.of("1", "2", "Sak"), Spill.spill(3));
    }

    @Test
    void test5() {
        assertEquals(List.of("1", "2", "Sak", "4", "Frist"), Spill.spill(5));
    }

    @Test
    void test15() {
        assertEquals(
            List.of("1", "2", "Sak", "4", "Frist", "Sak", "7", "8", "Sak",
                "Frist", "11", "Sak", "13", "14", "SakFrist"),
            Spill.spill(15));
    }

    @Test
    void test0ErTom() {
        assertEquals(List.of(), Spill.spill(0));
    }
}
