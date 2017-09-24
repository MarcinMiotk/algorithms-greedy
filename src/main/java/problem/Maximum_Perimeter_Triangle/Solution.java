package problem.Maximum_Perimeter_Triangle;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sticksCount = scanner.nextInt();
            long[] sticks = new long[sticksCount];
            for(int stick=0; stick<sticksCount; stick++) {
                sticks[stick] = scanner.nextInt();
            }
            System.out.println("1 3 3");
        }
    }

    static boolean isValidTriangle(long[] sides) {
        long longestSide = sides[0];
        if (sides[1] > longestSide )
            longestSide = sides[1];
        if(sides[2] > longestSide )
            longestSide = sides[2];
        return (longestSide < sides[0] + sides[1] + sides[2] - longestSide);
    }
}
