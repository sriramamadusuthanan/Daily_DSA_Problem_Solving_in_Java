import java.util.Arrays;
import java.util.List;

public class P_Array {

//    Easy
//    Build Array from Permutation
//    Concatenation of Array
//    Running Sum of 1d Array
//    Richest Customer Wealth
//    Shuffle the Array
//    Kids With the Greatest Number of Candies
//    Number of Good Pairs
//    How Many Numbers Are Smaller Than the Current Number
//    Create Target Array in the Given Order
//    Check if the Sentence Is Pangram
//    Count Items Matching a Rule
//    Find the Highest Altitude
//    Flipping an Image
//    Cells with Odd Values in a Matrix
//    Matrix Diagonal Sum
//    Find Numbers with Even Number of Digits
//    Transpose Matrix
//    Add to Array-Form of Integer
//    Maximum Population Year
//    Determine Whether Matrix Can Be Obtained By Rotation
//    Two Sum
//    Find N Unique Integers Sum up to Zero
//    Lucky Number In a Matrix
//    Maximum Subarray
//    Reshape the Matrix
//    Plus One
//    Remove Duplicates from Sorted Array
//    Minimum Cost to Move Chips to The Same Position

//    1. Build Array from Permutation
    public int[] permutation(int[] array)
    {
        int[] ans = new int[array.length];

        for(int i=0; i<array.length;i++)
        {
            ans[i]=array[array[i]];
        }

        return ans;
    }
    //    Concatenation of Array
    public int[] concatenation(int[] array)
    {
        int[] ans=new int[array.length*2];

        for(int i=0; i<array.length-1;i++)
        {

            ans[i]=array[i];
            ans[i+array.length]=array[i];
        }
        return ans;
    }

    //    Running Sum of 1d Array
    //Input: nums = [1,2,3,4]
    //Output: [1,3,6,10]
    public int[] runningSumArray(int[] array)
    {
        int[] ans=new int[array.length];
        ans[0]=array[0];
        for(int i=1;i<=array.length-1;i++)
        {
            ans[i]=array[i]+ans[i-1];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    //    Shuffle the Array --to be solved..
//    Example 1:
//
//    Input: nums = [2,5,1,3,4,7], n = 3
//    Output: [2,3,5,4,1,7]
//    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7
//    then the answer is [2,3,5,4,1,7]

//    public int[] shuffleArray(int[] array, int n)
//    {
//        int[] ans=new int[array.length];
//        ans[0]=array[0];
//
//        for(int i=0;i<=n-1;i++)
//        {
//                if(i%2==0){
//                    ans[i]=array[i];
//                }
//
//
//
//        }
//        for(int i=n;i<=array.length;i++)
//        {
//            if(i%2!=0){
//                ans[i]=array[i];
//            }
//        }
//        System.out.println(Arrays.toString(ans));
//        return ans;
//    }

    //    Kids With the Greatest Number of Candies
    public String[] kidsWithCandies(int[] candies, int extraCandies)
    {
        String[] ans= new String[candies.length];
        for(int i=0; i<candies.length;i++)
        {
            candies[i]=candies[i]+extraCandies;
            int max;
            max=candies[i];
            for(int j=0; j<candies.length;j++)
            {

                if(candies[j]>max)
                {
                    ans[i]="false";
                    break;

                }else
                {
                    ans[i] = "true";
                }
            }
            candies[i]=candies[i]-extraCandies;
        }



        System.out.println(Arrays.toString(ans));
        return ans;

    }

    //    Number of Good Pairs
    public int numIdenticalPairs(int[] nums)
    {
        int pair=0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    pair++;
                }
            }

        }
        System.out.println(pair);
        return pair;
    }
    //    How Many Numbers Are Smaller Than the Current Number
//    Input: nums = [8,1,2,2,3]
//    Output: [4,0,1,1,3]
    public int[] smallerNumbersThanCurrent(int[] nums)
    {

        int[] ans= new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            int smallestNoCount=0;
            int smallest=nums[i];

            for(int j=0;j<nums.length;j++)
            {
                if(smallest>nums[j])
                {
                    smallestNoCount++;
                }
            }
            ans[i]=smallestNoCount;

        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    //    Create Target Array in the Given Order
//    public int[] createTargetArray(int[] nums, int[] index)
//    {
//
//    }
}
