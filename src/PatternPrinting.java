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
}
