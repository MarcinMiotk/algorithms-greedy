package problem.greedy_florist;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flowers = in.nextInt();
        int persons = in.nextInt();
        PriorityQueue<Integer> prices = new PriorityQueue<>(Collections.reverseOrder());
        for(int c_i=0; c_i < flowers; c_i++){
            prices.offer(in.nextInt());
        }
        int minimumCost = getMinimumCost(persons, prices);
        System.out.println(minimumCost);
    }

    static int getMinimumCost(int numberOfPersons, PriorityQueue<Integer> prices){
        int[] persons = new int[numberOfPersons];
        int minimumCost = 0;
        int person=0;
        while(!prices.isEmpty()) {
            int price = (persons[person]+1)*prices.poll();
            persons[person]++;
            minimumCost +=price;
            person++;
            if(person==numberOfPersons) {
                person = 0;
            }
        }
        return minimumCost;
    }
}
