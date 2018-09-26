import java.util.Stack;

public class ArrayPalindrome {

	Stack<Character> one;
	Stack<Character> two;
	Stack<Character> three;

	public ArrayPalindrome() {

		one = new Stack<>();
		two = new Stack<>();
		three = new Stack<>();

	}

	public boolean isPalindrome(String match) {
		
		
		match = match.toLowerCase();
		match = match.replaceAll("\\P{L}", " ");
		match = match.replace(" " , "");
		
		for (int i = 0, j = match.length() ; i < j; i++) {
			
			
		
			one.push(match.charAt(i));
			two.push(match.charAt(i));
			
			

		}
		for (int i = 0; i < match.length(); i++) {
			three.push(two.pop());

		}
		for (int i = 0; i < match.length() ; i++) {
			char look = one.peek();
			char secondLook = three.peek();

			if (look != secondLook) {

				System.out.println( match + ": " + "This is not a palindrome ");
				return false;

			}
			one.pop();
			three.pop();

		}
		System.out.println( match + ": " + " This is a palindrome");
		return true;
	}

}
