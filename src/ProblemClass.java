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

}
