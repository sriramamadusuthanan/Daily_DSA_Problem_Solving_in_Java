package Array;

public class Candy_135 {
    public static void main(String[] args) {
        int[] arr={1,0,2};
        candy(arr);
    }
    public static int candy(int[] ratings) {
        int output=0;
        int previous=Integer.MIN_VALUE;
        for(int i=0;i<ratings.length;i++)   //[1,0,2]
        {
            output++;
            if(ratings[i]<previous )
            {
                output++;
            }
            previous=ratings[i];  //1
        }

        return output;
    }
}
