
Input : AAABBC
Output : A3B2C (or)  A3BBC

import java.util.*;
public class Main
{
public static void main(String[] args) {
       String s1 = "aabbbbc";
       String s2 = "";
       int j = 0,i=0;
       while(i<s1.length())
       {
           j = i;
           while(j<s1.length() && s1.charAt(i) == s1.charAt(j))
           {
               j++;
           }
           s2 += s1.charAt(i) + "" ;
           if(j-i > 1)
           {
               s2 += j-i;
           }
           i = j;
       }
      System.out.println(s2);
	}
}
