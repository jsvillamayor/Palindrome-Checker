import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string to check if palindrome: ");
		String string = scanner.nextLine();
		char[] temp = string.toCharArray();
		boolean isPalindrome = true;
		int j=string.length()-1;
		
		for(int i=0;i<string.length();i++) {
			
			if(temp[i]==temp[j]) {
				j--;
			}
			else {
				isPalindrome = false;
			}
			
		}
		
		if(isPalindrome == false) {
			System.out.println("This is not a palindrome.");
		}
		else {
			System.out.println("This is a palindrome.");
		}

	}

}
