Input : AABBCCDD , ABCDCCAD
Output :
ABB , BCD
D , A


import java.util.*;
public class Main {
    public static void main(String[] args) {
        String str1 , str2;
        int i,j;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter str1:");
        str1 = scan.nextLine();
        
        System.out.println("Enter str2:");
        str2 = scan.nextLine();
        int n = Math.min(str1.length(),str2.length());
        System.out.println("----------");
        for(i=0;i<n;i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                for(j=i;j<n && str1.charAt(j)!=str2.charAt(j) ;j++)
                    System.out.print(str1.charAt(j));
                System.out.print(" , ");
                for(;i<j;i++)
                    System.out.print(str2.charAt(i));
                System.out.println();
            }
        }
        System.out.println("----------");
    }
}
