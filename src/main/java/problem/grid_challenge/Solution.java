package problem.grid_challenge;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for(int testCase=0; testCase<testCases; testCase++) {
            int size = in.nextInt();
            in.nextLine();
            Counting counting = new Counting(size);
            for(int i=0; i<size; i++) {
                String line = in.nextLine();
                for(int j=0; j<line.length(); j++) {
                    counting.character(line.charAt(j));
                }
                counting.start_next_block();
            }
            System.out.println(counting.isLexicographicallySorted() ? "YES" : "NO");
        }
    }


    static class Counting {

        final int[][] grid;
        int block = 0;

        final int blocks;
        final int letters;

        Counting(int blocks) {
            this.blocks = blocks;
            this.letters = 'z'-'a'+1;
            grid = new int[blocks][letters];
        }

        void start_next_block() {
            block++;
        }

        void character(char character) {
            short rank = (short)(character-(short)'a');
            grid[block][rank]++;
        }

        boolean isLexicographicallySorted() {
            int sums[][] = new int[blocks][letters];
            for(int b=0; b<blocks; b++) {
                for(int c=0; c<letters; c++) {
                    if(c==0) {
                        sums[b][c] = grid[b][c];
                    } else {
                        sums[b][c] = sums[b][c-1]+grid[b][c];
                    }
                }
            }

            // Ide po kolei od block[1] do block[n]
            // Jesli dla jakiegos letter w [1] jest na tym indeksie liczba mniejsze w [0]
            // to NO.

            for(int b=1; b<blocks; b++) {
                for (int c = 0; c < letters; c++) {
                    int previous = sums[b-1][c];
                    int current = sums[b][c];
                    if(previous<current) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
