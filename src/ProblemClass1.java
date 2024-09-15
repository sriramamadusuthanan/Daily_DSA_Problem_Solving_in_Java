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

    //22/08/24
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

    //evenlyDivides
    static int evenlyDivides(int N)
    {
        int count=0;
        int original =N;
        while(N>0)
        {
            int digit = N%10;
            if(digit==0)
            {
                N=N/10;
            }else
            {
                if(original%digit==0)
                {
                    count++;
                }

                N=N/10;
            }




        }
        System.out.println(count);
        return count;
    }

    // Reverse Bits
    public  long reverseBits(long n) {
        // Write your code
        int num= (int)n;

        long result= Long.parseLong(Integer.toBinaryString(num).replace(' ','0'));
        System.out.println(result);
        return result;
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

}
