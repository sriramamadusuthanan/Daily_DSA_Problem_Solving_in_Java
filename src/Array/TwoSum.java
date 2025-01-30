package Array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target= 9;
        System.out.println(Arrays.toString(twosum(arr,target)));
    }

    //1. Two Sum
    public static int[] twosum(int[] nums, int target)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];
            if(hashMap.containsKey(comp))
            {
                return new int[]{hashMap.get(comp),i};
            }
            hashMap.put(nums[i],i);
        }

        return new int[] {-1,-1};
    }
}
