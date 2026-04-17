package SIS5;
public class Example3
{
    public static void main(String[] args)
    {
	int              i;
	int[]            data = {50, 320, 97, 12, 2000};


	for (i=0; i < data.length; i++)
        {
		System.out.println(data[i]);
	    }

        
	 System.out.println("Done");
    }
}

/*
 First compilation: OK 
50
320
97
12
2000
Done

Fixes:  Deleted try-catch construction, fixed upper bound in the for loop (i<10 -> i<data.length)
Output:
50
320
97
12
2000
Done
 */