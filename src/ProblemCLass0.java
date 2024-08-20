import java.util.Arrays;

public class ProblemCLass0 {

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

}
