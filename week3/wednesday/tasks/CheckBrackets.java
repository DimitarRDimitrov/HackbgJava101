package wednesday.tasks;

import java.util.ArrayDeque;

public class CheckBrackets {

	
//	Such expression is a string like "()()())))((())(" - it has multiple brackets, your job is to check whether the expression is correct. Such expression is correct if:
//
//	    it starts with a '('
//	    it ends with a ')'
//	    the number of opening brackets equals exactly the number of closing brackets
//	    at no point in the string the number of closing brackets is higher than the number of opening brackets. E.g. ())(() is not a valid one, because at index 2 there is a second closing bracket with only one opening bracket.

	
	private ArrayDeque<Character> brackets = new ArrayDeque<>();
	
	
	public void checkExpression(String s){
		for (char c: s.toCharArray()) {
			if(c == '('){
				brackets.addFirst(c);
			}
			if(c == ')'){
				if (brackets.isEmpty()) {
					System.out.println("Error, incorrect expression!");
					return;
				}
				
				brackets.pop();
			}
		}
		if(brackets.isEmpty()) {
			System.out.println("Correct expression");
		} else {
			System.out.println("Error, incorrect expression!");
		}
	}

	
	public static void main(String[] args) {
		CheckBrackets cb = new CheckBrackets();
		cb.checkExpression("((())(()))(");
	}
}
