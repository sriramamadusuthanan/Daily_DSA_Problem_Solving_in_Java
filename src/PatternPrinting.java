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

//    #DAY5
//    Problem statement
//    Send feedback
//    Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.
//    For every value of ‘N’, print the field if the trees are represented by ‘*’.
//    Example:
//    Input: ‘N’ = 3
//
//    Output:
//            * * *
//            * *
//            *
    public void pattern4(int n)
    {

        for(int i = n; i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
         }
    }

//    #DAY6
//    Problem statement
//    Send feedback
//    Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
//    Example:
//    Input: ‘N’ = 3
//
//    Output:
//
//            1 2 3
//            1 2
//            1

    public void pattern5(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//    #DAY7
//    Problem statement
//    Send feedback
//    Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.
//    Example:
//    Input: ‘N’ = 3
//
//    Output:
//
//             *
//            ***
//           *****

    public void pattern6(int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i+count;k++)
            {
                System.out.print("*");

            }

            System.out.println();
            count++;
        }
    }

    //day8
    public void pattern7(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    //day9
    public void pattern8(int n)
    {
        int count=1;
        for(int i=0; i<n; i++)
        {
            //space
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            //star
            for(int k=0;k<i+count;k++)
            {
                System.out.print("*");
            }
            System.out.println( );
            count++;
        }
        count=1;
        for(int i=1; i<n; i++)
        {
            //space
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int k=(2*n)-(2*i+1);k>0;k--)
            {
                System.out.print("*");
            }
            System.out.println( );
            count++;
        }



    }

    //Day 10
    public void pattern9(int n)
    {
        int count=0;
        for(int i=1;i<n;i++)
        {
           for(int j=n-i;j>0;j--)
           {
               System.out.print(" ");
           }

           if(i==1)
           {
               System.out.print("*");
           }
           if(i==n-1)
            {
                int last=2*n-1;
                for(int k=0;k<last;k++)
                {
                    System.out.print("*");
                }

            }
           if(i>1 && i<n-1)
           {

                    System.out.print("*");
                    for(int m=0;m<count;m++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");

           }

            System.out.println();
           count+=2;
        }
    }

    //Day11
    public void pattern10(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }
    //Day12

//                    1
//                   2 2
//                  3 3 3
//                 4 4 4 4
//                5 5 5 5 5

        public void pattern11(int n)
        {
            int count =1;
            for(int i=1;i<=n;i++)
            {
                for(int k=n-i;k>0;k--)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(count+" ");
                }
                System.out.println();
                count++;
            }
        }

        //day 13

//                          1
//                        2 3 2
//                       3 4 5 4 3
//                      4 5 6 7 6 5 4
//                    5 6 7 8 9 8 7 6 5

    public void pattern12(int n)
    {
        int count=0;
        int innercount=2;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            System.out.print(i+1);
            for(int k=1;k<i+count;k++)
            {
//                System.out.print(" ");
                if(k<=(i+count)/2)
                {
                    innercount++;
                }else{
                    innercount--;
                }

                System.out.print(innercount);

            }
            if(i>0)
            {
                System.out.print(i+1);
            }

            System.out.println();
            count++;

        }
    }

    //Day 13
//                        1
//                       1 1
//                      1 2 1
//                     1 3 3 1
//                    1 4 6 4 1

    public void pattern13(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(" ");
            }
            System.out.print(1);
            for(int k=0;k<i;k++)
            {
                System.out.print("&");
            }
            if(i>0)
            {
                System.out.print(1);
            }

            System.out.println( );



        }
    }



}
