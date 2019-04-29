package SimpleMaths.leetcode;

public class BestTimetoBuyandSellStockII {

	/**
	 * 122. Best Time to Buy and Sell Stock II
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public static int maxProfit(int[] prices) {
        int len =prices.length;
        int small=Integer.MAX_VALUE;
        int profit=0;
        
        for(int i =0;i<len;i++){
            if(prices[i]<small){
                small=prices[i];
            }
            int now=prices[i]-small;
            if(now >0){
                small=prices[i];
                profit+=now;
            }
        }
        return profit;
    }
}
