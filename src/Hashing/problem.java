package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class problem {


//    public static void hashmap(int[] array)
//    {
//        HashMap<Integer,Integer> noOfelementhash=new HashMap<>();
//
//        for(int i=0;i<array.length;i++)
//        {
//            int key=array[i];
//        }
//
//        for(int key:noOfelementhash)
//        {
//
//        }
    //}


    //#DAY37 "A"
    //Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
    //
    //Examples:
    //
    //Example 1:
    //Input: array[] = {10,5,10,15,10,5};
    //Output: 10 15
    //Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.
    //
    //Example 2:
    //Input: array[] = {2,2,3,4,4,2};
    //Output: 2 3
    //Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.

    public void highandLowfreq(int[] array)
    {
        //create a hashmap
        HashMap<Integer, Integer> freq_number=new HashMap<>();

        //add unique value
        for(int i=0;i<array.length;i++)
        {
            if(freq_number.containsKey(array[i]))
            {
                freq_number.put(array[i],freq_number.get(array[i])+1);
            }else
            {
                freq_number.put(array[i],1);
            }
            //freq_number.put(array[i],0);

        }

//        freq_number.forEach((key,value)->{
//            System.out.println("key"+key+":"+"value"+value);
//         });
        int max=0;
        int maxkey=0;
        int min=freq_number.get(array[0]);
        int minkey=0;
        for (Integer key : freq_number.keySet()) {
            System.out.println("Key: " + key + ", Value: " + freq_number.get(key));
            if(freq_number.get(key)>max)
            {
                max=freq_number.get(key);
                maxkey=key;
            }

            if(freq_number.get(key)<min)
            {
                max=freq_number.get(key);
                minkey=key;
            }

        }

        System.out.println(maxkey+" "+minkey);
    }
    //Find a pair with the given sum in an array
    //Given an unsorted integer array, find a pair with the given sum in it.
    //
    //For example,
    //
    //Input:
    //nums = [8, 7, 2, 5, 3, 1]
    //target = 10
    //Output:
    //Pair found (8, 2)
    //or
    //Pair found (7, 3)
    //
    //Input:
    //nums = [5, 2, 6, 8, 1, 9]
    //target = 12
    //Output: Pair not found

    public void sumPair(int[] array,int target)
    {
        HashSet<Integer> sumPair=new HashSet<>();

        for(int num : array)
        {
            sumPair.add(num);
        }
        int count=0;
        for(int num1: sumPair )
        {
            int value=target-num1;
            //System.out.println(num1);
            if(sumPair.contains(value))
            {
                count++;
                System.out.println(value+" "+num1);
                break;
            }
        }

        if(count==0)
        {
            System.out.println("Pair not found");
        }

    }

    //#DAY39
    //Longest Consecutive Subsequence
    public int longSubsequence(int[] array)
    {
        SortedSet<Integer> sortedset= new TreeSet<>();

        for(int nums:array)
        {
            sortedset.add(nums);
        }
        int count=1;
        int max=0;
        int first=sortedset.first();
        int i=1;
        for(int nums1:sortedset)
        {


            if(nums1==first+i)
            {
                count++;
                first=nums1;

            }else {
                count=1;
                //first=nums1;

            }

            if(max<count)
            {
                max=count;
            }
        }
        System.out.println(max);
        return max;
    }

}
