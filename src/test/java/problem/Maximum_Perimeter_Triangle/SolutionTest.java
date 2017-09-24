package problem.Maximum_Perimeter_Triangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class SolutionTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void tearDown() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void official_1() {
        String input = "5\n" +
                "1 1 1 3 3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Solution.main(null);
        assertEquals("1 3 3", outContent.toString().trim());
    }

    @Test
    public void official_2() {
        String input = "3\n" +
                "1 2 3\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Solution.main(null);
        assertEquals("-1", outContent.toString().trim());
    }


    @Test
    public void isValidTriangle() {
        assertTrue(Solution.isValidTriangle(new long[] { 1L, 1L, 1L}));
        assertTrue(Solution.isValidTriangle(new long[] { 1L, 3L, 3L}));
        assertFalse(Solution.isValidTriangle(new long[] { 1L, 2L, 3L}));
    }

}