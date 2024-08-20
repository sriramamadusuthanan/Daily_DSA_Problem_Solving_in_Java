import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProblemClass {




    public void rever(int n)
    {
        int reverse=0;
        while(n>0)
        {
            int digit=n%10;
            reverse=reverse*10+digit;;

            n=n/10;

        }

        System.out.println(reverse);
    }

    public void loop()
    {
        int count = 0;

        while(count!=5)
        {
            System.out.println(count);
            count++;
        }
    }

    //Input a year and find whether it is a leap year or not.

    public void leepYear()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check Leap or not");
        int year= input.nextInt();
        input.close();
        if(year%4==0)
        {
            System.out.println("The year "+year+ "is a leap year");
        }else
        {
            System.out.println("The year "+year+ "is not a leap year");
        }
    }

    //Take a number as input and print the multiplication table for it.

    public void table(int num)
    {
        int count=0;

        while(count!=11)
        {
            System.out.println(num +"*"+ count +"="+ num*count);
            count++;
        }
    }

    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    public void takenosum()
    {

        Scanner input = new Scanner(System.in);

        int sum =0;

        String label;

        while(true)
        {
            System.out.println("Enter a number or 'x' to exit: ");

            label= input.nextLine();

            if(label.equals("x"))
            {
                break;
            }

            try
            {
                int num = Integer.parseInt(label);
                sum+=num;
            }
            catch (Exception e)
            {
                System.out.println(e);
            }



        }

        System.out.println("the sum of the number "+ sum);
    }

    //Roman to integer
    //map concept
	/*Symbol       Value
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000*/

    public int romanToInt(String s) {

        Map<Character,Integer> RomantoInt=new HashMap<>();

        RomantoInt.put('I',1);
        RomantoInt.put('V',5);
        RomantoInt.put('X',10);
        RomantoInt.put('L',50);
        RomantoInt.put('C',100);
        RomantoInt.put('D',500);
        RomantoInt.put('M',1000);

        int n=0;  //to

        for(int i=0; i<s.length();i++)
        {

            int CurrentVal = RomantoInt.get(s.charAt(i));

            if(i+1<s.length())
            {
                int NextVal = RomantoInt.get(s.charAt(i+1));
                if(NextVal>CurrentVal)
                {
                    n= n+(NextVal-CurrentVal);
                    i=i+1;

                }
                else
                {
                    n=n+CurrentVal;
                }
            }else
            {
                n=n+CurrentVal;
            }



        }
        System.out.println(n);
        return n;

    }

    public String longestCommonPrefix(String[] strs) {


        String prefix =strs[0];

        for(int i=0; i<strs.length;i++)
        {
            for(int j=0;j<strs[i].length();j++)
            {
                if(prefix.charAt(i)==strs[i+1].charAt(j))
                {

                }
            }
            if(strs[i]==prefix)
            {
                System.out.println(prefix);
                return prefix;
            }
        }
        return null;

    }

    //Take 2 numbers as inputs and find their HCF and LCM.
    public void HcfandLcm(int a,int b)
    {

    }
    // lcm of 2 number
    public int Lcm(int a, int b)
    {
        int max =0;
        int lcm=0;
        if(a>b) {
            max=a;
        }else
        {
            max=b;
        }
        while(lcm!=max)
        {
            if((max%a==0)&(max%b==0))
            {
                lcm=max;
                break;
            }else
            {
                max++;
            }

        }
        System.out.println(lcm);
        return lcm;

    }

    //hcf of two integer

    public int Hcf(int a, int b)
    {
        if(a==0)
        {
            System.out.println("HCF :" + b);
            return b;
        }
        else if(b==0)
        {
            System.out.println("HCF :" + a);
            return a;
        }

        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }

        System.out.println("HCF :" + a);
        return a;


    }

    //Write a program to print whether a number is even or odd, also take input from the user.

    public String checkEvenOdd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd");
        int number= sc.nextInt();
        sc.close();
        if(number%2==0)
        {
            System.out.println("Even number");
            return "Even";
        }
        System.out.println("Odd number");
        return "Odd";


    }

    //Take name as input and print a greeting message for that particular name.
    public String greetingGenerator(String name)
    {
        LocalTime currenttime= LocalTime.now();

        int hour=currenttime.getHour();
        String greetingname;
        if(hour<1 & hour<12)
        {
            greetingname="Good morning "+name;
        }else
        {
            greetingname="Good Afternoon "+ name;
        }
        System.out.println(greetingname);
        return greetingname;
    }

    //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public int simpleInterest()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Principal Amount : ");
        int Principal = sc.nextInt();

        System.out.println("Enter the Time Peroid (year) : ");
        int Time = sc.nextInt();

        System.out.println("Enter the Interest Rate(in annum) : ");
        int rate = sc.nextInt();
        sc.close();
        int SI=(Principal*Time*rate)/100;
        System.out.println("The Simple Interest"
                + " for the above details :"+SI);

        System.out.println(SI);
        return SI;
    }

    //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    private void UserCalculator()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operation to be pereformed (/,*,-,+) : ");
        String operaent = sc.next();
        sc.close();
        if(operaent.equals("*"))
        {
            System.out.println(num1*num2);
        }else if(operaent.equals("-"))
        {
            System.out.println(num1-num2);
        }else if(operaent.equals("+"))
        {
            System.out.println(num1+num2);
        }else
        {
            try{
                System.out.println(num1/num2);
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public void CallPrivatemethod()
    {
        UserCalculator();
    }

    //Take 2 numbers as input and print the largest number.
    public void largestnum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        if(num1>num2)
        {
            System.out.println(num1);
        }else
            System.out.println(num2);
    }
    //Input currency in rupees and output in USD.
    public void rupeestoUsd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        float rupees = sc.nextFloat();
        sc.close();
        float converstionrate= 85.5f;
        System.out.println("Usd Value of the Given Rupees is "+rupees/converstionrate);
    }

    //To calculate Fibonacci Series up to n numbers.
    public void fibonacciSeries(int n)
    {
        if(n<0)
        {
            System.out.println("enter a postive integer");
            return;
        }
        int f[]= new int[n];
        f[0]= 0;
        if(n>1)
        {
            f[1]=1;
        }


        if(n>2)
        {

            for(int i=2; i<n;i++)
            {
                f[i]=f[i-1]+f[i-2];

            }
        }

        for(int j=0;j<f.length;j++)
        {
            System.out.println(f[j]);
        }

    }

    public void palindrome(int x)
    {
        int reverse=0;
        int original =x;
        while(x>0)
        {
            int digit=x%10;
            reverse=reverse*10;
            reverse=reverse+digit;
            x=x/10;
        }

        if(reverse==original)
        {
            System.out.println("palindrone");
        }else
        {
            System.out.println("notPalidrone");
        }
    }

    //To find Armstrong Number

    public int armstrongNo(int number)
    {
        int x=number;
        int digit=0;
        while(x>0)
        {
            x = x/10;

            digit=digit+1;

        }
        System.out.println(digit);
        return digit;
    }

//	 public void repeatDigit()
//	 {
//		 int n=12346511;
//		 int count=1;
//		 String ns= String.valueOf(n);
//		 for(int i=0; i<ns.length();i++)
//		 {
//			 System.out.println(ns.charAt(i));
//			 for(int j=i+1;j<ns.length();j++)
//			 {
//
//				if(ns.charAt(i)==ns.charAt(j))
//				 {
//
//					 count++;
//					 int index=ns.charAt(j);
//					 ns.deleteCharAt(index);
//
//				 }
//
//			 }
//
//			 System.out.println("number of time repeated :" + count);
//			 count=0;
//		 }
//	 }

    public void repetnumber3(int n)
    {
        int count=0;
        while(n>0)
        {
            int remainder=n%10;
            if(remainder == 3)
            {
                count++;
            }
            n=n/10;
        }

        System.out.println(count);
    }

}
