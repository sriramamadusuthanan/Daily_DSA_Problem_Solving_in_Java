public class RandomProblem {


    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        for(int i=1;i<=N;i++)
        {
            //int start=i;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    sum+=j;
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
}
