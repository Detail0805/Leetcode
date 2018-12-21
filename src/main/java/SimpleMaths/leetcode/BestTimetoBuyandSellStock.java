package SimpleMaths.leetcode;

public class BestTimetoBuyandSellStock {

	
	
	/**
	 * leetcode 121. Best Time to Buy and Sell Stock
	 * @param args
	 */
	public static void main(String[] args) {
		int [] price ={7,1,5,3,6,4};//Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5
		int [] bad={7,6,4,3,1};
		//{7,2,8,3,1,4}
		maxprofit(price);
		maxprofit(bad);
	}
	
	
	public static int maxprofit(int[] prices){
		
		int length = prices.length;
		int small =Integer.MAX_VALUE;
		int profit =0;
		
		for(int i =0;i<length;i++){
			if( small>prices[i]){
				small=prices[i];
			}
		int nowProfit= prices[i]-small;
		if(nowProfit>profit){
			profit=nowProfit;
			}
		}
		System.out.printf(" small : %d profit : %d",small,profit);
		
		return profit;
	}
}
