package microsoft;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public static int evalRPN(String[] tokens) {
	    Stack<Integer> stack = new Stack<Integer>();
	  
	    for (String s : tokens) {
	        switch (s) {
	            case "+":
	            stack.push(stack.pop() + stack.pop());
	            break;
	                
	            case "-":
	            stack.push(-stack.pop() + stack.pop());
	            break;
	                
	            case "*":
	            stack.push(stack.pop() * stack.pop());
	            break;

	            case "/":
	            int n1 = stack.pop(), n2 = stack.pop();
	            stack.push(n2 / n1);
	            break;
	                
	            default:
	            stack.push(Integer.parseInt(s));
	        }
	    }
	  
	  return stack.pop();
	}
	public static void main(String[] args) {
		String s[] = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.println(EvaluateReversePolishNotation.evalRPN(s));
	}
}

