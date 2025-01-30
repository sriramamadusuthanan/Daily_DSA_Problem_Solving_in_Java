package Search;

import java.util.Arrays;

public class Problem {


    public void linearSearch(int[] arr,int target)
    {
        if(arr.length==0 )
        {
            System.out.println("Empty Array.Array");
            return;
        }

        for (int index = 0; index < arr.length; index++)
        {
            if(arr[index]==target) //arr[index].equal(target)
            {
                System.out.println("Element "+target+" is found at "+index+" position of the array");
                return;

            }
        }

        System.out.println("Element not found");

    }

    //for string :no case sensitivity :if it's for a single string use charAt(i)
    public void linearSearchForString(String[] arr,String target)
    {
        if(arr.length==0 )
        {
            System.out.println("Empty Array.Array");
            return;
        }

        for (int index = 0; index < arr.length; index++)
        {
            if(arr[index].equalsIgnoreCase(target)) //arr[index].equal(target)
            {
                System.out.println("Element "+target+" is found at "+index+" position of the array");
                return;

            }
        }

        System.out.println("Element not found");

    }

    //linear search in 2D array
    public void searchIn2DArray(int[][] array,int target)
    {
        if(array.length==0)
        {
            System.out.println("Empty Array.Array");
            return;
        }

        for (int row = 0; row < array.length; row++)
        {
            for (int col = 0; col < array[row].length; col++)
            {

                if(array[row][col]==target)
                {
                    System.out.println("Element " +target+ " is present at "+row+" row's "+col+" col int the array");
                    return;
                }
            }
        }
        System.out.println("Element "+target+ " Not found in the array");
    }

    //Binary Search
    public int binarySearch(int[] array, int target)
    {
        int start=0;
        int last=array.length-1;


        while(start<=last)
        {
            int mid=(start+last)/2;
            if(target<array[mid])
            {

                last=mid;
            } else if (target>array[mid]) {
                start=mid;

            }
            else
            {
                System.out.println(target);
                return target;

            }

        }
        System.out.println("element not found");
        return -1;

    }

    //check sorted in ascending  or descending
    public void checkArraySortDirection(int[] array)
    {
        int length=array.length-1;
        if(array[0]<array[length])
        {
            System.out.println("ascending order sorted");
        }else
            System.out.println("descending order sorted");
    }

    //order-agnostic binary search
    public int agnosticBinarySearch(int[] array,int target)
    {

        if(array[0]<array[array.length-1])
        {
            int start=0;
            int end=array.length-1;

            while (start<=end)
            {
                int mid = start + (end - start) / 2;
                if(target>array[mid])
                {
                    start=mid-1;
                } else if (target<array[mid])
                {
                    end=mid;
                }
                else
                {
                    System.out.println(target+ " element found at "+mid);
                    return target;
                }
            }

            return -1;
        }else
        {
            int start=0;
            int end=array.length-1;

            while(start<=end)
            {
                int mid = start + (end - start) / 2;
                //[9,8,7,6,5,4]
                if(target>array[mid])
                {
                    end=mid;
                } else if (target<array[mid])
                {
                    start=mid+1;
                }else
                {
                    System.out.println(target+ " element found at "+mid );
                    return target;
                }
            }

            return -1;
        }
    }





    //ceiling of a number
    public void ceilingNo(int[] array, int target)
    {
        int start=0;
        int end=array.length-1;



        while(start<=end)
        {
            int mid=start+(end-start)/2;


            if(target<array[mid])
            {
                end=mid-1;

            }else
            {
                start=mid+1;

            }
            if(array[mid]==target)
            {
                System.out.println("found");
                return;
            }



        }


        if(array[start]<target)
        {
            System.out.println("celing of the no is"+start);
        }
        if(target<array[start])
        {
            System.out.println("no celing exist");
        }


    }

    //floar of the number

    public void floor(int[] array,int target)
    {
        int start=0;
        int end=array.length-1;

        if(target<array[start])
        {
            System.out.println("floor doesn't exist");
            return;
        }

        while(start<=end)
        {
            int mid= start+(end-start)/2;

            if(target==array[mid])
            {
                System.out.println("Floor of the number" + array[mid]);
                return;
            }
            if(target<array[mid])
            {
                end=mid-1;
            }
            if(target>array[mid])
            {
                start=mid+1;
            }


        }


        System.out.println("floor of the number "+ array[end]);
    }

    //Find Smallest Letter Greater Than Target
    public char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end= letters.length-1;
        if(target>=letters[end])
        {


            return letters[0];
        }
        int count=1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target==letters[mid])
            {
                while(target==letters[mid+count])
                {

                    count++;
                }
                System.out.println(letters[mid+count]);
                return letters[mid+count];





            }

            if(target>letters[mid])
            {
                start=mid+1;
            }

            if(target<letters[mid])
            {
                end=mid-1;
            }


        }

        System.out.println(letters[start]);
        return letters[start];


    }

    //Find First and Last Position of Element in Sorted Array.Array
    //brute force
    public int[] searchRange(int[] nums, int target) {

        int[] array=new int[2];

        if(nums.length==0)
        {
            array[0]=-1;
            array[1]=-1;

        }
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                array[0]=i;
                break;
            }
            else {
                array[0]=-1;
            }


            if(target!=nums[i])
            {
                array[0]=-1;
                array[1]=-1;
            }

        }

        for(int i=nums.length-1;i>=0;i--)
        {

            if(target==nums[i])
            {
                array[1]=i;
                break;
            }
            else {
                array[1]=-1;
            }

        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    //efficient method
    public int[] searchRange1(int[] nums, int target) {

        int[] array={-1,-1};
        array[0]=searchSatart(nums,target,true);
        array[1]=searchSatart(nums,target,false);

        return array;
    }

    int searchSatart(int[] nums,int target,boolean found)
    {
        int start=0;
        int end=nums.length-1;

        int ans=-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target<nums[mid])
            {
                end=mid-1;
            }else if(target>nums[mid])
            {
                start=mid+1;
            }else
            {
                ans=mid;
                if(found)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }



        }
        return ans;
    }

    //without using length method
    public void searchRange2(int[] nums, int target,int start,int end)
    {
        while(nums[end]<target)
        {
            start=end+1;
            //e-(s-1)
            end=end*2;
            if(end>nums.length-1)
            {
                end=nums.length-1;
            }
        }

            System.out.println(binarySearch(start,end,nums,target));


    }

    static int binarySearch(int start,int end,int [] nums,int target)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(target==nums[mid])
            {
                return mid;
            }

            if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }


        }
        return -1;
    }
    //find peak element in a array
    public int findPeakElement(int[] nums) {
        // int max=nums[0];
        // int var=0;
        // for(int i=1;i<nums.length;i++)
        // {

        //    if(max<nums[i])
        //    {
        //      max=nums[i];
        //      var=i;
        //    }
        // }

        // return var;

        int start=0;
        int end=nums.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[mid+1])
            {
                end=mid;

            }else
            {
                start=mid+1;
            }

            //return mid;
        }
        return start;
    }

    //peak index in a mountain array
    public int peakIndexInMountainArray(int[] arr) {
        // int count=0;
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     if(arr[i]>arr[i+1])
        //     {
        //         count=i;
        //         return i;
        //     }
        // }
        // return count;

        int start=0;
        int end=arr.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1])
            {
                end=mid;

            }else
            {
                start=mid+1;
            }

            //return mid;
        }
        return start;
    }

    // Find in Mountain Array.Array


    //1.find the peak element index
    //2.simple binary search in first half
    //3. if not found search in 2nd half decending array

    public int findMountainArray(int[] array, int target)
    {
       int peak= peakInMountainArray(array);

       int first=binaryS(array,target,peak);

       if(first!=-1)
       {
         return first;
       }else {
           binaryD(array,target,peak);
       }

       return -1;
    }

    static int peakInMountainArray(int[] array)
    {
        int start=0;
        int end=array.length-1;

        while(start<end)
        {
            int mid=start+(end-start)/2;

            if(array[mid]<array[mid+1])
            {
                start=mid+1;
            }else {
                end=mid;
            }
        }

        return start;
    }

    static int binaryS(int[] array,int target,int last)
    {

        int start=0;
        int end=last;
        //System.out.println(end);
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(array[mid]==target)
            {
                System.out.println(mid);
                return mid;
            }
            if(array[mid]<target)
            {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }

        //return binaryD(array,target);

        return -1;

    }




    static  int  binaryD(int[] array, int target,int least)
    {
        int start=least;
        int end=array.length-1;
        while(start<=end)
        {
           int mid=start+(end-start)/2;

           if(array[mid]==target)
           {
               return mid;
           }

           if(array[mid]>target)
           {
               start=mid+1;
           }
           else
           {
               end=mid-1;
           }
        }
        return -1;
    }



    //33. Search in Rotated Sorted Array.Array

    public int search(int[] nums, int target) {

        int peakelement=findPeakElement(nums);

        int firstresult=binaryS(nums,target,peakelement);

        if(firstresult!=-1)
        {
            return firstresult;
        }


        return  binaryS2(nums,target,peakelement);
    }

    static int binaryS2(int[] array,int target,int peak)
    {
        int start1=peak+1;
        int end1=array.length-1;

        while(start1<=end1)
        {
            int mid=start1+(end1-start1)/2;
            if(array[mid]==target)
            {
                System.out.println(mid);
                return mid;
            }
            if(array[mid]<target)
            {
                start1=mid+1;
            }else {
                end1=mid-1;
            }
        }

        //return binaryD(array,target);

        return -1;


    }
}
