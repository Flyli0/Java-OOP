package SIS5;
public class Example2
{
    public static void main(String[] args)
    {
	int        i, ratio;
	int[]      numbers = {100,10,0,5,2,8,0,30};
	i = 0;
	
		
	 for (i=0; i < numbers.length-1; i++){
	    try
        {	
		ratio = numbers[i] / numbers[i+1];
		System.out.println(numbers[i]+"/"+numbers[i+1]+"="+ratio);
	    }
	
        catch (ArithmeticException ae)
        {
	    System.out.println("Couldn't calculate "+
			       numbers[i]+"/"+numbers[i+1]);
        }
    }
}
}

/*
1) Errors after the first compilation, "The local variable i may not have been initialized"
2) After adding initialization before the 'for' block,Error: "The local variable i may not have been initialized"  
	this error is generated because try block will not be executed if Arithmetic exception is raised
3) After adding initialization before the "try" block  100/10=10
													   Couldn't calculate 10/0
all divisors were not attempted because our for cycle is placed inside of the try block, and after an exception, try block is not executed anymore 
4) Move try-catch construction into the for block
Out: 100/10=10
	 Couldn't calculate 10/0
	 0/5=0
	 5/2=2
	 2/8=0
	 Couldn't calculate 8/0
 	 0/30=0
*/