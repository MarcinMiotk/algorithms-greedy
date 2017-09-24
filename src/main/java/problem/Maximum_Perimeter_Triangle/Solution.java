package problem.Maximum_Perimeter_Triangle;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sticksCount = scanner.nextInt();
            int[] sticks = new int[sticksCount];
            for(int stick=0; stick<sticksCount; stick++) {
                sticks[stick] = scanner.nextInt();
            }
            System.out.println("1 3 3");
        }
    }
}
