package recursion;
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

    //Sum triangle from array

    //Input : A = {1, 2, 3, 4, 5}

    //Output : [48]
    //         [20, 28]
    //         [8, 12, 16]
    //         [3, 5, 7, 9]
    //         [1, 2, 3, 4, 5]

    public static int[] sumTriFromArray(int[] array,int count,int[]arr)
    {

        arr=new int[array.length-2];
        if(arr.length==0)
        {
            return arr;
        }

        if(count==arr.length-1)
        {
            count=0;

        }

        arr[count]=array[count]+array[count+1];
        count++;
        return sumTriFromArray(array,count,arr);

    }




}
