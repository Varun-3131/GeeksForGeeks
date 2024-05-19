package Main;

public class BuyStockWithTransactionFee {
    public long maximumProfit(long prices[], int n, int fee) {
        // Code here
        if(n == 1){
            return 0;
        }

        long profit = 0;
        long min = prices[0];
        long max = prices[0];
        boolean is_bought = false;

        for(int i=1; i<n; i++){
            if(!is_bought){
                if(prices[i] < min){
                    min = prices[i];
                }
                else if(prices[i] - min > fee){
                    max = prices[i];
                    is_bought = true;
                }
                continue;
            }

            if(is_bought){
                if(prices[i] > max){
                    max = prices[i];
                }
                else if(max - prices[i] > fee){
                    // sold
                    profit += max - min - fee;
                    is_bought = false;
                    min = prices[i];
                    max = 0;
                }
            }
        }

        if(is_bought){
            profit += max - min - fee;
        }

        return profit;
    }
}
