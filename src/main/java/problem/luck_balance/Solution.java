package problem.luck_balance;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numberOfPreliminaryContests = scanner.nextInt();
            int maximumNumberOfImportantContestsLenaCanLose = scanner.nextInt();
            int maximumAmountOfLuck = 0;
            PriorityQueue<Integer> lucks = new PriorityQueue<>();
            for(int i=0; i<numberOfPreliminaryContests; i++) {
                int luckBalance = scanner.nextInt();
                int importanceRating = scanner.nextInt();
                if(importanceRating==0) {
                    maximumAmountOfLuck+=luckBalance;
                } else {
                    lucks.add(luckBalance);
                }
            }
            int howManyLucksToRemove = lucks.size()-maximumNumberOfImportantContestsLenaCanLose;
            for(int i=0; i<howManyLucksToRemove; i++) {
                maximumAmountOfLuck-=lucks.poll();
            }
            while(!lucks.isEmpty()) {
                maximumAmountOfLuck+=lucks.poll();
            }
            System.out.println(maximumAmountOfLuck);
        }
    }
}
