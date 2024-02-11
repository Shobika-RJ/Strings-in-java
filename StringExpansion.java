Input : a1b10
Output : abbbbbbbbbb

Input : b3c6d15
Output : bbbccccccddddddddddddddd

import java.util.*;
public class Main {
    public static void main(String[] args) {
                String s1 = "a13b9";
                //String s2 = "";
                int count ;
                char temp = '\0' ;
                for(int i = 0;i<s1.length();i++)
                {
                    count = 0;
                    //char temp = s1.charAt(i-1);
                     if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
                    {
                        temp = s1.charAt(i-1);
                        while (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
                        {
                            count = (count * 10) + (s1.charAt(i)-48);
                            i++;
                            if(i == s1.length())
                            {
                                break;
                            }
                        }
                   }
                    for(int j = 0; j< count;j++)
                    {
                        System.out.print(temp);
                    }
                }
    }
}
