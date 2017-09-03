package problem.grid_challenge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import problem.grid_challenge.Solution;

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
        String input = "1\n" +
                "5\n" +
                "ebacd\n" +
                "fghij\n" +
                "olmkn\n" +
                "trpqs\n" +
                "xywuv\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Solution.main(null);
        assertEquals("YES", outContent.toString().trim());
    }

    @Test
    public void official_2() {
        String input = "1\n" +
                "5\n" +
                "ebacd\n" +
                "fghij\n" +
                "oamkn\n" +
                "trpqs\n" +
                "xywuv\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Solution.main(null);
        assertEquals("NO", outContent.toString().trim());
    }



    @Test
    public void official_3() {
        String input = "4\n" +
                "3\n" +
                "hcd\n" +
                "awc\n" +
                "shm\n" +
                "3\n" +
                "sur\n" +
                "eyy\n" +
                "gxy\n" +
                "3\n" +
                "nyx\n" +
                "ynx\n" +
                "xyt\n" +
                "4\n" +
                "vpvv\n" +
                "pvvv\n" +
                "vzzp\n" +
                "zzyy\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Solution.main(null);
        assertEquals("NO\r\n" +
                "NO\r\n" +
                "YES\r\n" +
                "YES", outContent.toString().trim());
    }
}