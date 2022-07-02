package main;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s ="abxyba";
			if(isplaindrom(s)) System.out.println("Given String is Palindrome");
			else System.out.println("Given String is NOT Palindrome");;
	}

	private static boolean isplaindrom(String s) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length()-1;
		
		while (i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
			
		}
		
		return true;
	}

}
