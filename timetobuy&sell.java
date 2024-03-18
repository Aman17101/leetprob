class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int profit=0;
        for (int i=0;i<n;i++){
          int diff=prices[i]-min;
          profit=Math.max(profit,diff);
          min=Math.min(min,prices[i]);
        }
        return profit;
    }
}
