class AddNumbers
{
	public static void main(String [] args)
	
	{
		
		String firstNumber =args[0];
		String secoundNumber=args[1];
		
		int firstNumberInt=Integer.parseInt(firstNumber);
		int secoundNumberInt=Integer.parseInt(secoundNumber);
		
		int sum =firstNumberInt+secoundNumberInt;
		
		
		System.out.println("START Main");
		System.out.println("sum is " + sum);
		System.out.println("END main");
	}
}

	
