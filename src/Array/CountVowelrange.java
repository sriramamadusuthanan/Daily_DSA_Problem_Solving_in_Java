package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelrange {

    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};
        vowelStrings(words,queries);
    }

    //my method out of time limit
//    public int[] vowelStrings(String[] words, int[][] queries) {
//        int length=queries.length;
//        int[] ans=new int[length];
//        Set<Character> vowel = new HashSet<>();
//        vowel.add('a');
//        vowel.add('e');
//        vowel.add('i');
//        vowel.add('o');
//        vowel.add('u');
//        for(int i=0;i<length;i++)
//        {
//            int start=queries[i][0];
//            int end=queries[i][1];
//            int count=0;
//            for(int j=start;j<=end;j++)
//            {
//                char temp = words[j].charAt(0);
//                char temp1= words[j].charAt(words[j].length()-1);
//                if(vowel.contains(temp) && vowel.contains(temp1))
//                {
//                    count++;
//                }
//            }
//
//            ans[i]=count;
//        }
//
//        return ans;
//    }

    //optimized way
    //words = ["aba","bcb","ece","aa","e"]
    //queries = [[0,2],[1,4],[1,1]]
    public static  int[] vowelStrings(String[] words, int[][] queries)
    {
        //length of the word array
        int n =words.length;

        int[] prefix=new int[n+1];
        Set<Character> vowel= Set.of('a','e','i','o','u');
        //precalculating the prefix with vowels
        for(int i=0;i<n;i++)
        {
            char firstChar= words[i].charAt(0);
            char lastCahr=words[i].charAt(words[i].length()-1);

            if(vowel.contains(firstChar) && vowel.contains(lastCahr))
            {
                prefix[i+1]=prefix[i]+1;
            }else {
                prefix[i+1]=prefix[i];
            }
        }

        int[] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int start=queries[i][0];
            int end= queries[i][1];

            ans[i]=prefix[end+1]-prefix[start];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
