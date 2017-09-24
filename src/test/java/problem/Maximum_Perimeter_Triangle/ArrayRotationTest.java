package problem.Maximum_Perimeter_Triangle;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static problem.Maximum_Perimeter_Triangle.ArrayRotation.rotate;

public class ArrayRotationTest {

    @Test
    public void rotate_1() {
        int[] indexes = new int[] { 0, 1, 4 };
        boolean rotated = rotate(indexes, 4);
        int[] expected = new int[] { 0, 2, 3 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_2() {
        int[] indexes = new int[] { 0, 1, 4 };
        boolean rotated = rotate(indexes, 5);
        int[] expected = new int[] { 0, 1, 5 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_3() {
        int[] indexes = new int[] { 0, 2, 3 };
        boolean rotated = rotate(indexes, 4);
        int[] expected = new int[] { 0, 2, 4 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_4() {
        int[] indexes = new int[] { 0, 2, 4 };
        boolean rotated = rotate(indexes, 4);
        int[] expected = new int[] { 0, 3, 4 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_5() {
        int[] indexes = new int[] { 0, 3, 4 };
        boolean rotated = rotate(indexes, 4);
        int[] expected = new int[] { 1, 2, 3 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_6() {
        int[] indexes = new int[] { 1, 2, 3 };
        boolean rotated = rotate(indexes, 4);
        int[] expected = new int[] { 1, 2, 4 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_7() {
        int[] indexes = new int[] { 1, 2, 4 };
        boolean rotated = rotate(indexes, 4);
        int[] expected = new int[] { 1, 3, 4 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_8() {
        int[] indexes = new int[] { 1, 3, 4 };
        boolean rotated = rotate(indexes, 4);
        int[] expected = new int[] { 2, 3, 4 };
        Assert.assertArrayEquals(expected, indexes);
        Assert.assertTrue(rotated);
    }

    @Test
    public void rotate_9() {
        int[] indexes = new int[] { 2, 3, 4 };
        boolean rotated = rotate(indexes, 4);
        Assert.assertFalse(rotated);
    }
}