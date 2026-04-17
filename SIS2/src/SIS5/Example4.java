package SIS5;
import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);
       StringTokenizer tk = new StringTokenizer(in.nextLine(), " ", false);
       int a = tk.countTokens();
       for(int i = 0; i<a; i++) {
	       tokenizer = new StringTokenizer(tk.nextToken(), "+-*/", true);
	
	       try
	       {
	          leftString   = tokenizer.nextToken();
	          operator     = tokenizer.nextToken();
	          rightString  = tokenizer.nextToken();
	          rightOperand = '0';
	          leftOperand = '0';
	          
	          try {
	        	  leftOperand  = Double.parseDouble(leftString);
	          }
	          catch(NumberFormatException nfe) {
	        	  System.out.println("Your left operand is not A NUMBER!!!! (╯°□°）╯︵ ┻━┻ ");
	          }
	          
	          
	          try {
	        	  rightOperand = Double.parseDouble(rightString);
	          }
	          catch(NumberFormatException nfe) {
	        	  System.out.println("Your right operand is not A NUMBER!!!! (╯°□°）╯︵ ┻━┻ ");
	          }
	          
	          if (operator.equals("+"))
	             result = leftOperand + rightOperand;
	          else if(operator.equals("-")) {
	        	  result = leftOperand - rightOperand;
	          }
	          else if(operator.equals("*")) {
	        	  result = leftOperand*rightOperand;
	          }
	          else if(operator.equals("/")) {
	        	  result = leftOperand/rightOperand;
	          }
	          else
	             result = 0.0;
	
	          System.out.println("Result: " + result + "\n");
	       }
	       catch(ArithmeticException ae) {
	    	   System.out.println("You are not allowed to divide by 0 here");
	       }
	       catch (NoSuchElementException nsee)
	       {
	          System.out.println("Invalid syntax");
	       }
	       catch (NumberFormatException nfe)
	       {
	          System.out.println("One or more operands is not a number");
	       }

       }
    }
}

/*
1) String tokenizer breaks a string based on delimiters 
2) formal parameters of a string tokenizer are 
String str - string that we desire to break, 
String delim - delimiter, by which string will be broken, 
boolean returnDelims - if true: delimiters are independent tokens 
3) Compiling result : Result: 14.5
4) after run 5.3+  -> invalid syntax 
the output was like that because of NoSuchElementException (for the right token + there was no another token with the number)
5) running 5.3+a -> one or more operands is not a number
it raised because of a, that when we use parseDouble causes NumberFormatException)
*/
