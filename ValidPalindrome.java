Input : m@ala$$y*a&lam
Output : true


import java.util.Scanner;

public class palindrome_removal {
	
	    public static boolean palindrome(String s)
	    {
	    	s = s.replaceAll("[!@#$%^&*]", "").toLowerCase(); 

	        int left = 0, right = s.length() - 1;

	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    		
	    }
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    	String  input = sc.nextLine();
	        boolean result= true;
	        result= palindrome(input);
	        System.out.print(result);
	    }
	

}
