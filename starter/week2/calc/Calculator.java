package week2.calc;

import java.util.Stack;

public class Calculator {

	private char[] supportedOperations = new char[] { '*', '/', '+', '-' };

	private boolean checkIfCharIsOperation(char c) {
		for (char cc : supportedOperations) {
			if (cc == c) {
				return true;
			}
		}
		return false;
	}

	private boolean checkIfBracket(char c) {
		return (c == '(' || c == ')') ? true : false;
	}

	private String[] findNumbers(String input, int indexOperation) {
		char[] inputArray = input.toCharArray();
		int leftOffset = indexOperation;
		int rightOffset = indexOperation;
		// accounting for negative numbers
		while (leftOffset != 0 && (!checkIfCharIsOperation(inputArray[leftOffset-1])  
				&& !checkIfBracket(inputArray[leftOffset-1]) || inputArray[leftOffset-1] == '-'))
			leftOffset--;
		
		do
			rightOffset++;
		while (rightOffset != input.length() && !checkIfCharIsOperation(input.toCharArray()[rightOffset])
				&& !checkIfBracket(inputArray[rightOffset]));
		return new String[] { input.substring(leftOffset, indexOperation),
				input.substring(indexOperation + 1, rightOffset) };
	}

	private double evaluateExpression(double val1, double val2, char c) {
		if (c == '*')
			return val1 * val2;
		if (c == '/')
			return val1 / (double) val2;
		if (c == '+')
			return val1 + val2;
		if (c == '-')
			return val1 - val2;
		return 0;
	}

	private String findBracketPair(String input, int startIndex) {
		Stack<Character> stack = new Stack<>();
//		stack.push('(');
		for (int i = startIndex; i < input.length(); i++) {
			if (input.charAt(i) == '(')
				stack.push('(');
			else if (input.charAt(i) == ')') {
				stack.pop();
				if (stack.isEmpty()) {
					return input.substring(startIndex + 2, i);
				}
			}
		}
		return null;
	}

	public double execute(String input) {
		double result = 0;
		String s = input.replaceAll("\\s", "");
		for (char c : supportedOperations) {
			for (int i = 0; i < s.length(); i++) {
				if (i < s.length()-1 && s.toCharArray()[i+1] == '(') {
					String bracket = findBracketPair(s, i);
					//"+3" because we have +1 for the first bracket +1 for the second and +1 for the non-inclusive index
					s = s.substring(0, i+1) + String.valueOf(execute(bracket)) + s.substring(i + bracket.length() + 3);
				}
				if (s.toCharArray()[i] == c) {
					String[] numbers = findNumbers(s, i);
					double calculated = evaluateExpression(Double.valueOf(numbers[0]), Double.valueOf(numbers[1]), c);
					s = s.substring(0, i - numbers[0].length()) + String.valueOf(calculated)
							+ s.substring(i + numbers[1].length() + 1);
					i = 0;
				}
			}
		}
		try {
			result = Double.valueOf(s);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		return result;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.execute("5-5-5-5"));
		// String s = "5+5";
		// System.out.println(s.substring(2, 3));
		// System.out.println(s);
		System.out.println(c.execute("555+555"));
		System.out.println(c.execute("5*5+5"));
		System.out.println(c.execute("5*(5+5)"));
		System.out.println(c.execute("4*(4+5)"));
		// System.out.println();
	}

}
