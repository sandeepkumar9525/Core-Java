class PaymentInfo    
{
	static byte amount;
	static short totalAmount;
	static int finalAmount;
	static float finalAmountNew;
	static boolean status;
	static char suspended;
	
	public static void main(String [] args)
	{
		System.out.println( "Amount ::: "+ amount);
		System.out.println( "Total Amount ::: "+ totalAmount);
		System.out.println( "Final Amount ::: "+ finalAmount);
		System.out.println( "Final Amount New ::: "+ finalAmountNew);
		System.out.println( "Status ::: "+ status);
		System.out.println( "Suspended ::: "+ suspended);
	}
}