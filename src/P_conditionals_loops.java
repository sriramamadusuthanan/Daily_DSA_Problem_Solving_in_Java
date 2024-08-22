import java.util.Arrays;
import java.util.Scanner;

//Basic Java Programs
//1.Area Of Circle Java Program
//2.Area Of Triangle
//3.Area Of Rectangle Program
//4.Area Of Isosceles Triangle
//5.Area Of Parallelogram
//6.Area Of Rhombus
//7.Area Of Equilateral Triangle
//8.Perimeter Of Circle
//9.Perimeter Of Equilateral Triangle
//10.Perimeter Of Parallelogram
//11.Perimeter Of Rectangle
//12.Perimeter Of Square
//13.Perimeter Of Rhombus
//14.Volume Of Cone Java Program
//15.Volume Of Prism
//16.Volume Of Cylinder
//17.Volume Of Sphere
//18.Volume Of Pyramid
//19.Curved Surface Area Of Cylinder
//20.Total Surface Area Of Cube
//21.Fibonacci Series In Java Programs
//22.Subtract the Product and Sum of Digits of an Integer
//23.Input a number and print all the factors of that number (use loops).
//24.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
//25.Take integer inputs till the user enters 0 and print the largest number from all.
//26.Addition Of Two Numbers
public class P_conditionals_loops {

    //1.Area Of Circle Java Program
    public float areaOfCircle(float radius)
    {
        float area= (float) Math.PI*radius*radius;
        return area;

        //inline
        //return (float) Math.PI*radius*radius;
    }

    //2.Area Of Triangle
    public double areaOfTirangle(double base,double height)
    {
        return  0.5*base*height;
    }

    //3.Area Of Rectangle Program
    public double areaOfRectangle(double length,double width)
    {
        return  length*width;
    }

    //4.Area Of Isosceles Triangle
    //# sides will be equal
    public double areaOfIsoTirangle(double base,double height)
    {
        return  0.5*base*height;
    }

    //5.Area Of Parallelogram
    public double areaOfParallelogram(int base, int height)
    {
        return base*height;
    }
    //.....
    ////19.Curved Surface Area Of Cylinder
    public double curvedSurfAreaOfCylinder(double radius, double height)
    {

        //Curved Surface Area=2πrh
        return (2*Math.PI)*radius*height;


    }

    //21.Fibonacci Series In Java Programs
    //#0,1,1,2,3,5,8,13,21,34,…
    public int[] fibonacciSeries(int n)
    {
        int[] array=new int[n];
        array[0]=0;
        array[1]=1;

        for(int i=2;i<n;i++)
        {
            array[i]=array[i-1]+array[i-2];
        }

        System.out.println(Arrays.toString(array));
        return array;
    }

    //22.Subtract the Product and Sum of Digits of an Integer
    public int findNumber(int num)
    {
        int sum=0;
        int product =1;
        int output;
        while(num>0)
        {
            int remainder = num%10;
            sum=sum+remainder;
            product= product*remainder;
            num=num/10;
        }

        output= product-sum;
        return output;
    }

    //Edge Cases not included
    //23.Input a number and print all the factors of that number (use loops).
    public void allFactorsOfNumber(int n)
    {
        System.out.println("the factors are : ");
        for(int i=1; i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }

    //24.Take integer inputs till the user enters 0 and
    // print the sum of all numbers (HINT: while loop)

    public void sumAllNum()
    {
        int sum=0;
        System.out.println("Enter number to sum and press '0' to exit");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        while (num>0)
        {

            sum=sum+num;

        }
        System.out.println(sum);
    }




}
