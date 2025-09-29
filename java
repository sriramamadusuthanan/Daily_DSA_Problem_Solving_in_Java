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
..............
29 
14. Longest Common Prefix
 Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
 public String longestCommonPrefix(String[] strs) {
        String str=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            if(str.length()>strs[i].length())
            {
                str=str.substring(0,strs[i].length());
            }

            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)==strs[i].charAt(j))
                {
                    continue;
                }else
                {
                    if(j==0)
                    {
                        return "";
                    }
                    str=str.substring(0,j);  // str.substring(index, ending index) its just cuts in the index , its leave that ending index
                }
            }
        }
        return str;
        
    }
