package Array;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr= {2,1,2,1,0,0,1};
        int ans=BuyandSell(arr);
        System.out.println(ans);
    }

    public static int BuyandSell(int[] prices)
    {
        int buy=Integer.MAX_VALUE;
        int profit=0;

        for(int price: prices)
        {
            if(price<buy)
            {
                buy=price;
            }else
            {
                profit=Math.max(profit,price-buy);
            }
        }
        return profit;
    }
}
