public class PatternPrinting {


//    #DAY 1
//    Problem statement
//    Send feedback
//    Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
//    For every value of ‘N’, help Sam to print the corresponding N-dimensional forest.
//    Example:
//    Input: ‘N’ = 3
//
//    Output:
//            * * *
//            * * *
//            * * *

    public void patternPrinting(int n)
    {
        //int[row][col]
        int[][] array= new int[n][n];

        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    #Day2
//    Problem statement
//    Send feedback
//    Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
//    An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.
//    For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.
//    Example:
//    Input: ‘N’ = 3
//
//    Output:
//            *
//            * *
//            * * *


    public void printPattern1(int n)
    {

        int num=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
            num++;
        }
    }

//    #DAY3
//    Problem statement
//    Send feedback
//    Sam is making a Triangular painting for a maths project.
//    An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.
//    For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.
//    Example:
//    Input: ‘N’ = 3
//
//    Output:
//            1
//            1 2
//            1 2 3

    public void patternPrinting2(int n)
    {

        for(int i=1;i<=n;i++)
        {
            //int num=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
               // num++;
            }
            System.out.println();

        }
    }

//    #DAY4
//    Problem statement
//    Send feedback
//    Sam is making a Triangular painting for a maths project.
//    An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.
//    For every value of ‘N’, help sam to print the corresponding Triangle.
//            Example:
//    Input: ‘N’ = 3
//
//    Output:
//            1
//            2 2
//            3 3 3

    public void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
