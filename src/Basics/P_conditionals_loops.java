package Basics;

import java.time.YearMonth;
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
    public float areaOfCircle(float radius) {
        float area = (float) Math.PI * radius * radius;
        return area;

        //inline
        //return (float) Math.PI*radius*radius;
    }

    //2.Area Of Triangle
    public double areaOfTirangle(double base, double height) {
        return 0.5 * base * height;
    }

    //3.Area Of Rectangle Program
    public double areaOfRectangle(double length, double width) {
        return length * width;
    }

    //4.Area Of Isosceles Triangle
    //# sides will be equal
    public double areaOfIsoTirangle(double base, double height) {
        return 0.5 * base * height;
    }

    //5.Area Of Parallelogram
    public double areaOfParallelogram(int base, int height) {
        return base * height;
    }

    //.....
    ////19.Curved Surface Area Of Cylinder
    public double curvedSurfAreaOfCylinder(double radius, double height) {

        //Curved Surface Area=2πrh
        return (2 * Math.PI) * radius * height;


    }

    //21.Fibonacci Series In Java Programs
    //#0,1,1,2,3,5,8,13,21,34,…
    public int[] fibonacciSeries(int n) {
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println(Arrays.toString(array));
        return array;
    }

    //22.Subtract the Product and Sum of Digits of an Integer
    public int findNumber(int num) {
        int sum = 0;
        int product = 1;
        int output;
        while (num > 0) {
            int remainder = num % 10;
            sum = sum + remainder;
            product = product * remainder;
            num = num / 10;
        }

        output = product - sum;
        return output;
    }

    //Edge Cases not included
    //23.Input a number and print all the factors of that number (use loops).
    public void allFactorsOfNumber(int n) {
        System.out.println("the factors are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    //24.Take integer inputs till the user enters 0 and
    // print the sum of all numbers (HINT: while loop)

    public void sumAllNum() {
        int sum = 0;


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number to sum and press '0' to exit");
            int num = sc.nextInt();
            if (num > 0) {
                sum = sum + num;
            }
            if (num == 0) {
                break;
            }


        }
        System.out.println(sum);

    }

    //25.Take integer inputs till the
// user enters 0 and print the largest number from all.
    public void largestOfAllNum() {
        int largest = Integer.MIN_VALUE;


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number to check largest and press '0' to exit");
            int num = sc.nextInt();
            if (num > largest) {
                largest = num;
            }
            if (num == 0) {
                break;
            }


        }
        System.out.println(largest);

    }

//### Intermediate Java Programs
//1. Factorial Program In Java
//2. Calculate Electricity Bill
//3. Calculate Average Of N Numbers
//4. Calculate Discount Of Product
//5. Calculate Distance Between Two Points
//6. Calculate Commission Percentage
//7. Power In Java
//8. Calculate Depreciation of Value
//9. Calculate Batting Average
//10. Calculate CGPA Java Program
//11. Compound Interest Java Program
//12. Calculate Average Marks
//13. Sum Of N Numbers
//14. Armstrong Number In Java
//15. Find Ncr & Npr
//16. Reverse A String In Java
//17. Find if a number is palindrome or not
//18. Future Investment Value
//19. HCF Of Two Numbers Program
//20. LCM Of Two Numbers
//21. Java Program Vowel Or Consonant
//22. Perfect Number In Java
//23. Check Leap Year Or Not
//24. Sum Of A Digits Of Number
//25. Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
//            26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.


    //1. Factorial Program In Java
    //edge case not included
    public int Factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative number");
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
    //2. Calculate Electricity Bill

    //     1 to 100 units: $0.10 per unit
    //     101 to 200 units: $0.15 per unit
    //      201 units and above: $0.20 per unit

    public double electricityBill(int units) {
        if (1 <= units && units <= 100) {
            return units * 0.10;
        } else if (101 <= units && units <= 200) {
            return units * 0.15;
        } else {
            return units * 0.20;
        }
    }

    //3. Calculate Average Of N Numbers
    public int AverageOfNnum(int n) {
        int sum = 0;
        int average = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        average = sum / n;

        return average;
    }

    //4. Calculate Discount Of Product
    public double discount(double mrp, double discountPercentage) {
        return mrp * (discountPercentage / 100);

    }

    //5. Calculate Distance Between Two Points

    public double distanceBtw2Pts(int[] a, int[] b) {
        double x1 = b[0] - a[0];
        double y1 = b[1] - a[1];

        double rootbaseX = Math.pow(x1, 2);
        double rootbaseY = Math.pow(y1, 2);

        double d = Math.sqrt(rootbaseX + rootbaseY);
        return d;
    }

    //..../...


    //17. Find if a number is palindrome or not
    public boolean palindromeCheck(int num) {
        int orginal = num;
        int reverse = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }

        if (reverse == orginal) {
            return true;
        }
        return false;
    }
    //19. HCF Of Two Numbers Program


    //21. Java Program Vowel Or Consonant
    //A, E, I, O, U
    public boolean vowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'e' || letter == 'a' || letter == 'i' || letter == 'o' || letter == 'u';
    }

    //22. Perfect Number In Java
    public int perfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num - 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return num;
        }
        return -1;
    }

    //23. Check Leap Year Or Not
    public boolean checkLeapYrs(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    //24. Sum Of A Digits Of Number
    public int sumOfDigit(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }

        return sum;
    }

    //25. Kunal is allowed to go out with his friends only
    // on the even days of a given month. Write a program
    // to count the number of days he can go out in the month
    // of August.

    public int outingDays(int monthNo, int year) {
        int count = 0;
        YearMonth month = YearMonth.of(year, monthNo);
        int monthdays = month.lengthOfMonth();
        for (int i = 1; i <= monthdays; i++) {
            if (i % 2 == 0) {
                count++;

            }
        }
        System.out.println(count);
        return count;
    }
    // 26. Write a program to print the sum of negative numbers,
    // sum of positive even numbers and the sum of positive odd
    // numbers from a list of numbers (N) entered by the user.
    // The list terminates when the user enters a zero.

    public void sumOfGivenNo() {
        int sumNegative = 0;

        int sumPostiveEvenNo = 0;
        int sumPostiveOddNo = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int no = sc.nextInt();
            //sum of negative no

            if (no == 0) {
                break;
            }
            if (no < 0) {
                sumNegative += no;

            }
            // sum of positive even numbers
            else if (no > 0 && no % 2 == 0) {
                sumPostiveEvenNo += no;
            }
            //sum of positive odd
            else {
                sumPostiveOddNo += no;
            }


        }
        System.out.println(sumNegative);
        System.out.println(sumPostiveEvenNo);
        System.out.println(sumPostiveOddNo);

    }

    public int countNo(int num) {
        int count = 0;
        while (num > 0) {

            count++;

            num = num / 10;

        }
        return count;
    }

    public int OptimlcountNo(int num) {
        return (int) Math.log10(num) + 1;
    }
}

