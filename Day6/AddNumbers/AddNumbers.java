  class AddNumbers 
  {
	  
	  public static void main(String [] args)
	  {
	  if (args.length!=2)
	  {
		  System.out.println("pls provide two numbers");
		  return;
	  }
     String	first  = args[0];
	 String sec = args[1];
	 
	 int firstInt= Integer.parseInt( first);
	 int secInt = Integer.parseInt(sec);
	 
	 int sum = firstInt+ secInt;
	 
	 System.out.println("sum is " + sum);
	 
	  }
   }
  