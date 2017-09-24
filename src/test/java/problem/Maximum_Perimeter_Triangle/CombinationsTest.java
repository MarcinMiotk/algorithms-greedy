package problem.Maximum_Perimeter_Triangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

public class CombinationsTest {

    @Test
    public void constructs_combinations_without_repetition() {
        int elementsToChooseFrom = 3;
        int elementsChoosen = 2;
        Combinations combinations = Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
        Assert.assertNotNull(combinations);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructs_combinations_without_repetition_invariants() {
        int elementsToChooseFrom = 3;
        int elementsChoosen = 5;
        Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
    }

    @Test
    public void combinations_1_from_n2_k2() {
        int elementsToChooseFrom = 2;
        int elementsChoosen = 2;
        Combinations combinations = Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
        AtomicInteger counter = new AtomicInteger();
        combinations.forEach(combination -> {
            counter.incrementAndGet();
        });
        assertEquals(1, counter.get());
    }

    @Test
    public void combinations_3_from_n3_k2() {
        int elementsToChooseFrom = 3;
        int elementsChoosen = 2;
        Combinations combinations = Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
        AtomicInteger counter = new AtomicInteger();
        combinations.forEach(combination -> {
            counter.incrementAndGet();
        });
        assertEquals(3, counter.get());
    }

    @Test
    public void combinations_6_from_n4_k2() {
        int elementsToChooseFrom = 4;
        int elementsChoosen = 2;
        Combinations combinations = Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
        AtomicInteger counter = new AtomicInteger();
        combinations.forEach(combination -> {
            counter.incrementAndGet();
        });
        assertEquals(6, counter.get());
    }

    @Test
    public void combinations_4_from_n4_k3() {
        int elementsToChooseFrom = 4;
        int elementsChoosen = 3;
        Combinations combinations = Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
        AtomicInteger counter = new AtomicInteger();
        combinations.forEach(combination -> {
            counter.incrementAndGet();
        });
        assertEquals(4, counter.get());
    }

    @Test
    public void combinations_10_from_n5_k3() {
        int elementsToChooseFrom = 5;
        int elementsChoosen = 3;
        Combinations combinations = Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
        AtomicInteger counter = new AtomicInteger();
        combinations.forEach(combination -> {
            counter.incrementAndGet();
        });
        assertEquals(10, counter.get());
    }

    @Test
    public void combinations_from_n5_k3_have_valid_sequence() {
        int elementsToChooseFrom = 5;
        int elementsChoosen = 3;
        Combinations combinations = Combinations.combinationsWithoutRepetitions(elementsToChooseFrom, elementsChoosen);
        AtomicInteger index = new AtomicInteger();
        int[][] expectedResults = new int[][] {
                new int[] { 0, 1, 2 },
                new int[] { 0, 1, 3 },
                new int[] { 0, 1, 4 },
                new int[] { 0, 2, 3 },
                new int[] { 0, 2, 4 },
                new int[] { 0, 3, 4 },
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 4 },
                new int[] { 1, 3, 4 },
                new int[] { 2, 3, 4 }
        };
        combinations.forEach(combination -> {
            int[] expected = expectedResults[index.get()];
            Assert.assertArrayEquals(expected, combination);
            index.incrementAndGet();
        });
    }
}