package Array;

public class isPowerofThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(2147483647));
    }
    public static boolean isPowerOfThree(int n) {
        int temp=0;
        int sqr=0;
        while(temp<n)   //27
        {
            temp=(int)Math.pow(3,sqr);

            if(temp==n)
            {
                return true;
            }
            if(temp>n)
            {
                return false;
            }

            sqr++;

        }

        return false;
    }
}
