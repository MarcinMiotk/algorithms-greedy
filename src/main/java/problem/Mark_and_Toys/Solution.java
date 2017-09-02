package problem.Mark_and_Toys;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int products = scanner.nextInt();
            int wallet = scanner.nextInt();
            int maximumNumberOfProductsToBuy = 0;
            PriorityQueue<Integer> prices = new PriorityQueue<>();
            for(int i=0; i<products; i++) {
                int price = scanner.nextInt();
                prices.offer(price);
            }
            // I have [wallet] and sorted [prices].
            do {
                int price = prices.poll();
                wallet-=price;
                if(wallet>=0) {
                    maximumNumberOfProductsToBuy++;
                }
            } while(wallet>=0);
            System.out.println(maximumNumberOfProductsToBuy);
        }
    }
}
