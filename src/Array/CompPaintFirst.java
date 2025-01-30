package Array;

import java.util.Arrays;
import java.util.HashMap;

public class CompPaintFirst {
    public static void main(String[] args) {
        int[] arr={1,4,5,2,6,3};
        int[][] mat={{4,3,5},{1,2,6}};
        removeOuterParentheses("(()())(())(()(()))");
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0; // Keeps track of open parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    ans.append(c); // Append only if it's not an outer '('
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(c); // Append only if it's not an outer ')'
                }
            }
        }
        return ans.toString();
    }


    public static int firstCompleteIndex(int[] arr, int[][] mat) {

        HashMap<Integer,int[]> hashmap=new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                hashmap.put(mat[i][j],new int[]{i,j});
            }
        }

//        for(var e:hashmap.entrySet())
//        {
//            System.out.println(e.getKey()+":"+ Arrays.toString(e.getValue()));
//        }
        //row
        int n=mat[0].length;
        int[] row_count=new int[n];

        //col
        int m= mat.length;
        int[] col_count=new int[m];

        for(int i=0;i<arr.length;i++)
        {
            int[] temp=hashmap.get(arr[i]);
            int col=temp[0];
            int row=temp[1];
            row_count[row]++;
            col_count[col]++;
            if(row_count[row]==n || col_count[col]==m)
            {
                return i;
            }



        }

        return -1;
    }
}
