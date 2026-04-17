package SIS5;
public class Example1
{
    public static void main(String[] args)
    {
	int     denominator, numerator, ratio;


	numerator   = 5;
	denominator = 0;
	
	try {
		ratio = numerator / denominator;
		System.out.println("The answer is: "+ratio);
	}
	catch(ArithmeticException e) {
		System.out.println("Divide by zero");
		e.printStackTrace();
	}
    
	

	System.out.println("Done."); // Don't move this line
    }
}


//1 the first answer is 2
/*
2)after we changed denominator to 0, the ArithmeticException was raised.
it's generated at the runtime because it's Unchecked exception (when the code is correct, but logic has errors 

3)after we've added try catch block, CheckedException (the local variable may not be initialized) has occurred
because the ratio variable now created as a local variable of the try block 

4)after we added ration in try and println in catch block, -> Divide by zero; Done

5)printStackTrace() ->  Divide by zero
						java.lang.ArithmeticException: / by zero
							at SIS2/SIS5.Example1.main(Example1.java:13)
						Done.	Application executed properly 
 */