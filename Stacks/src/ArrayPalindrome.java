import java.util.Stack;

public class ArrayPalindrome<E> {

	ArrayStack<Character> one;
	ArrayStack<Character> two;
	ArrayStack<Character> three;

	public ArrayPalindrome() {

		one = new ArrayStack<>();
		two = new ArrayStack<>();
		three = new ArrayStack<>();

	}

	public boolean isPalindrome(String match) {
		
		String output = match;
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

				System.out.println( output + ": " + "This is not a palindrome ");
				return false;

			}
			one.pop();
			three.pop();

		}
		System.out.println( output + ": " + " This is a palindrome");
		return true;
	}

}
