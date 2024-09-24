package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemClass0 {

    //16/8/24
    //1.input is a uppercase or lowercase
    public void caseCheck(char c)
    {
        if(c>='a'&& c<='z')
        {
            System.out.println("Entered Char is a lowercase"+c);
        } else if (c>='A'&& c<='Z')
        {
            System.out.println("Entered char is a uppercase"+c);
        }else {
            System.out.println("enter a valid char input");
        }
    }

    //varAgr-example
    //2.int...num -means it take array of numbs
    public void VarAgr(int...num)
    {
        System.out.println(Arrays.toString(num));
    }

    //3.example2
    public void VarAgr2(int a, int b, String...string)
    {
        System.out.println(a+b+Arrays.toString(string));
    }

    //question
    //4.prime number
    public boolean CheckForPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        if(num==2 || num==3){
            return true;
        }

      if(num%2==0)
      {
          return false;
      }

        for(int i=3; i<=Math.sqrt(num);i++)
        {
            if(num % i==0)
            {
                return false;
            }

        }
        System.out.println("number is a prime "+ num);
        return true;


    }

    //20/08/24
    //Check 3digit num : Armstrong or not

    public boolean ArmstrongNo(int number)
    {
        int orignal=number;
        int sum=0;
        while (number > 0)
         {

            int lastdigit=number%10;

            //int cube=lastdigit* lastdigit *lastdigit;

            int cube= (int)Math.pow(lastdigit,3);
            sum=sum+cube;
            number=number/10;
        }
        
        if(orignal==sum)
        {

            System.out.println("Armstrong");
            return true;
        }
        else

            return false;
    }

    //Armstrong number for a range
    public void RangArmstrongNoCheck()
    {
        for(int i=100; i<1000;i++)
        {
            if(ArmstrongNo(i))
            {
                System.out.println(i);
            }
        }
    }

    //array
    //syntax
    //datatype[] arrayname= new datatype[size]
    //datatype[] name={value,value,value}

    public void arrayMethod()
    {
        int[] arrayName;   //declaration -arrayName is getting defined in the stack

        arrayName = new int[5];  // Initialization - memory for 5 integers is allocated on the heap

        //2d Array
        int[][] Array2D=new int[3][3];  //row range is need and col is optional

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < Array2D.length; i++) {
            for (int j = 0; j < Array2D[i].length; j++) {
                Array2D[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        //to print

        for(int[] row:Array2D)
        {
            System.out.println(Arrays.toString(row));
        }

        //ArrayList
        //syntax
        //ArrayList<Datatype> Name_ = new ArrayList<>();
        //we shouldn't add primitives like int ...we should add wrapped Class like Integer
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(1);
        list.add(3);
        list.add(56);
        list.add(56);
        list.add(58);

        System.out.println(list.get(0));
        System.out.println(list.contains(56));
        System.out.println(list);


    }

    //swap element in array
    public void swapElement(int[] arr, int index1, int index2)
    {
        System.out.println(Arrays.toString(arr));
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        System.out.println(Arrays.toString(arr));
    }

    //max in a array
    public void maxinArray(int[] arr)
    {
        if(arr==null || arr.length==0)
        {
            System.out.println("Array is emplty");
            return;
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>max)
            {
                max =arr[i];
            }
        }
        System.out.println(max);
    }

    //reverse a Array
    public void reverseArray(int[] arr)
    {
        int first=0;
        int last=arr.length-1;
       // int middle=last/2;
        while(first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(arr));
    }

    //21/08/24
    //LinearSearch

    public void linearSearch(int[] arr,int target)
    {
        if(arr.length==0 )
        {
            System.out.println("Empty Array");
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
            System.out.println("Empty Array");
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
            System.out.println("Empty Array");
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


}
