public class ProblemClass1 {

    //21/08/24
    //1295. Find Numbers with Even Number of Digits
    public int findNumbers(int[] nums)
    {
        int noOfDigit=1;
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int a=nums[i];

            if(a<10)
            {
                continue;
            }else if (a>=10)
            {
                while (a>=10)
                {
                    noOfDigit++;
                    a=a/10;
                }
                if(noOfDigit%2==0)
                {
                    count++;
                    noOfDigit=1;
                }
            }


        }

        System.out.println(count);
        return count;
    }
    //1672. Richest Customer Wealth
    public int maximumWealth(int[][] accounts) {


        int max=0;

        for(int row=0;row<accounts.length;row++)
        {
            int sum=0;
            for (int col=0;col<accounts[row].length;col++)
            {
                sum=sum+accounts[row][col];

            }
            if(max<sum)
            {
                max=sum;
            }

        }

        return max;
    }
}
