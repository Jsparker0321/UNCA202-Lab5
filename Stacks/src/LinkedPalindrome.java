
public class LinkedPalindrome<E> {

	LinkedStack<Character> linkOne;
	LinkedStack<Character> linkTwo;
	LinkedStack<Character> linkThree;

	public LinkedPalindrome() {

		linkOne = new LinkedStack<>();
		linkTwo = new LinkedStack<>();
		linkThree = new LinkedStack<>();
	}

	public boolean isPalindrome(String palindrome) {

		String output = palindrome;
		palindrome = palindrome.toLowerCase();
		palindrome = palindrome.replaceAll("\\P{L}", " ");
		palindrome = palindrome.replace(" ", "");

		for (int i = 0, j = palindrome.length(); i < j; i++) {

			linkOne.push(palindrome.charAt(i));
			linkTwo.push(palindrome.charAt(i));

		}
		for (int i = 0; i < palindrome.length(); i++) {
			linkThree.push(linkTwo.pop());

		}
		for (int i = 0; i < palindrome.length(); i++) {
			char firstLook = linkOne.peek();
			char secondLook = linkThree.peek();

			if (firstLook != secondLook) {

				System.out.println(output + ": " + "This is not a palindrome ");
				return false;

			}
			linkOne.pop();
			linkThree.pop();

		}
		System.out.println(output + ": " + " This is a palindrome");
		return true;

	}
}
