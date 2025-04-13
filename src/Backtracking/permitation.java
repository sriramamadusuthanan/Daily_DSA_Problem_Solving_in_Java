package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class permitation {

    public static void main(String[] args) {
        int[] num ={1,2,3};
        System.out.println(permute(num));
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();

        ArrayList<Integer> list=new ArrayList<>();
        backtrack(result,list,nums);
        return result;
    }

    static void backtrack(List<List<Integer>> resultList, ArrayList<Integer>tempList, int[] nums){
        if(tempList.size()==nums.length)
        {
            resultList.add(new ArrayList<>(tempList));
            return ;
        }

        for(int number : nums)
        {
            if(tempList.contains(number))
            {
                continue;
            }

            tempList.add(number);
            backtrack(resultList,tempList,nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}
