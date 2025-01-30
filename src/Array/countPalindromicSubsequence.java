package Array;

import java.util.HashMap;

public class countPalindromicSubsequence {
    public static void main(String[] args) {
        String str="aabca";
        System.out.println(countPalindromicSubsequence(str));
    }
    public static int countPalindromicSubsequence(String s) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!hashmap.containsKey(s.charAt(i)))
            {
                hashmap.put(s.charAt(i),1);
            }else
            {
                hashmap.put(s.charAt(i),hashmap.get(s.charAt(i))+1);
            }
        }
        int subsequence=0;
        for(var e:hashmap.entrySet())
        {
            int n = e.getKey();
            if(n>=3)
            {
                subsequence=subsequence+hashmap.size();
            }
        }

        return subsequence;
    }
}
