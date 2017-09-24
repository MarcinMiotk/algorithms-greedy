package problem.Maximum_Perimeter_Triangle;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sticksCount = scanner.nextInt();
            long[] sticks = new long[sticksCount];
            for(int stick=0; stick<sticksCount; stick++) {
                sticks[stick] = scanner.nextLong();
            }
            long[] result = MaximumPerimeterTriangle(sticks);
            if(result!=null) {
                System.out.println(result[0]+" "+result[1]+" "+result[2]);
            } else {
                System.out.println("-1");
            }
        }
    }

    static boolean isFirstBetterThanSecond(long[] first, long[] second) {
        {
            // Choose the one with the longest maximum side
            // (i.e., the largest value for the longest side of any valid triangle having the maximum perimeter).
            long maxFirst = max(first);
            long maxSecond = max(second);
            if(maxFirst>maxSecond) {
                return true;
            } else if( maxFirst<maxSecond) {
                return false;
            }
        }
        {
            // If more than one such triangle meets the first criterion,
            // choose the one with the longest minimum side (i.e., the largest value for the shortest side of any valid
            // triangle having the maximum perimeter).
            long minFirst = min(first);
            long minSecond = min(second);
            if(minFirst>minSecond) {
                return true;
            } else if( minFirst<minSecond) {
                return false;
            }
        }
        return false;
    }

    static long max(long[] from) {
        long max = from[0];
        for(int i=1; i<from.length; i++) {
            if(from[i]>max) {
                max = from[i];
            }
        }
        return max;
    }

    static long min(long[] from) {
        long min = from[0];
        for(int i=1; i<from.length; i++) {
            if(from[i]<min) {
                min = from[i];
            }
        }
        return min;
    }

    static long[] MaximumPerimeterTriangle(long[] sticks) {
        AtomicReference<long[]> max = new AtomicReference<>();
        Combinations combinations = Combinations.combinationsWithoutRepetitions(sticks.length, 3);
        combinations.forEach(combination -> {
            long[] triangle = new long[] {
                    sticks[combination[0]],
                    sticks[combination[1]],
                    sticks[combination[2]]
            };
            if(isValidTriangle(triangle)) {
                if(max.get()==null) {
                    max.set(triangle);
                } else {
                    // compare
                    if(isFirstBetterThanSecond(triangle, max.get())) {
                        max.set(triangle);
                    }
                }
            }
        });
        return max.get();
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
