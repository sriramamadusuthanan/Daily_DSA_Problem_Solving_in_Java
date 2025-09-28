28
1. Two Sum
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

link - https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array
my solution 

 public int[] twoSum(int[] nums, int target) {
        int i=0;
        while(i<nums.length)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                    if(nums[i]+nums[j]==target)
                    {
                        return new int[] {i,j};  // way to create a return  a simple array 
                    }
            }

            i++;
        }
       return new int[]{-1,-1};
    }

// best solution
//suggested solution
    //creating a hashmap to store number 
    Map<Integer,Integer> hashmap=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        int current = nums[i];
        int remainder = target - current;

        if(hashmap.containsKey(remainder))
        {
            return new int[] {hashmap.get(remainder),i};
        }
        hashmap.put(current,i);
    }
    return new int[] {-1,-1};
    }
