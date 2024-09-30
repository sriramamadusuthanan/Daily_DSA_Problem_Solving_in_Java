package recursion;

import java.util.Arrays;
import java.util.Locale;

//space complexity is not constant since it create calls in stacks
//The recursion formula - the basic formula for the problem when its break down to simpler problem
//recursion relation is the formula ^
//how to find where the PS is solved by recursion -try to break down to smaller problem
public class Problem {

    //https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops
    //Print 1 To N Without Loop
    public void printNos(int N)
    {
        //Your code here
        print(1,N);
    }


    static void print(int n,int N)
    {
        if(n==N)  // base contation :- is a recursion condition when the call should end(no more new calls)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n);
        print(n+1,N);
    }


    //GFG pattern
    //https://bit.ly/3y2BiWz
    void printGfg(int N) {


        printPattern(N);
    }

    static void printPattern(int n)
    {
        String pattern= "GFG";
        if(n==1)
        {
            System.out.print(pattern);
            return;
        }
        System.out.print(pattern+" ");
        //tail recursion ie function call at last and no other process
        printPattern(n-1);
    }

    //sum of n natural number
    public void sumOfNaturalNo(int n)
    {
        int sum=0;
        sum(n,sum);
        //System.out.println();
    }

    static void sum(int n,int sum)
    {

        sum+=n;

        if(n==0)
        {
            System.out.println(sum);
            return;
        }
        sum(n-1,sum);

    }

    //sum of n natural number
    public int sumofNo(int n)
    {

        if(n==0)
        {

            return 0;
        }

        return n+sumofNo(n-1);
    }

    //fibo
    public int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }

        if(n==1)
        {
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }

    //linear search without loop
    public int linearSearch(int[] array,int target,int length)
    {


        if(length==-1)
        {
            System.out.println("not found");
            return -1;
        }

        if(array[length]==target)
        {
            return length;
        }

        return linearSearch(array,target,length-1);
    }

    //binary search without loop
    public int binarySearch(int[] array, int target,int start,int end)
    {

        if(start<=end)
        {

           int mid=start+(end-start)/2;

            if(target==array[mid])
            {
                System.out.println("found");
                return mid;
            }

            if(target<array[mid])
            {
                return  binarySearch(array,target,start,mid-1);
            }else
            {
                return binarySearch(array,target,mid+1,end);
            }

        }else
        {
            return -1;
        }


    }

    //factorial of a number without loop

    public int factorial(int n)
    {

        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }

    //reverse a array
    public  int[] reverse(int[] array, int num)
    {
        int last=array[array.length-1-num];
       array[array.length-1-num]=array[num];
       array[num]=last;
       if(num==(array.length-2)/2)
       {
           return array;
       }
       return reverse(array,num+1);

    }

    //Sum triangle from array

    //Input : A = {1, 2, 3, 4, 5}

    //Output : [48]
    //         [20, 28]
    //         [8, 12, 16]
    //         [3, 5, 7, 9]
    //         [1, 2, 3, 4, 5]

    public int[] sumTriFromArray(int[] array)
    {
        //base case
        if(array.length<2)
        {
            return array;
        }

        int[] arr=new int[array.length-1];

        for(int i=0;i<array.length-1;i++)
        {
            arr[i]=array[i]+array[i+1];
        }



        return sumTriFromArray(arr);
    }


    //Input: arr = {1, 4, 3, -5, -4, 8, 6};
    //Output: min = -5, max = 8

    public void maxAndmin(int[] array, int count)
    {
        int max=array[count];
        int min = array[count];
        if(count==array.length-1)
        {
            System.out.println("max val in arr is "+max);
            System.out.println("min val in arr is "+min);
            return;
        }

        if(max<array[count])
        {
            max=array[count];

        }

        if(min>array[count])
        {
            min=array[count];
        }

         maxAndmin(array,count+1);

    }

    //palindrome
    public boolean isPalindrome(String s,int num) {

        String slower=s.toLowerCase();
        int last=slower.length()-1-num;
        if(num>=last)
        {
            System.out.println("pal");
            return true;
        }
        int c=slower.charAt(num);
        while(c<97 || c>122 )
        {
            num++;
            c=slower.charAt(num);
        }
        int d=slower.charAt(last);
        while(d<97 || d>122)
        {
            last--;
            d=slower.charAt(last);
        }
        if(slower.charAt(num)!=slower.charAt(last))
        {
            return false;
        }

        return isPalindrome(s,num+1);

    }


    public void freqofnum(int arr[], int N, int P) {
        // do modify in the given array
        int[] array=new int[N];

        for(int i=1;i<=N;i++)
        {
            int freq=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==arr[j])
                {
                    freq++;
                }


            }

            array[i-1]=freq;
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }




}
