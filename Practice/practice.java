class practice
{
 public static void main(String args [] )
 
 {
		String year = args[0];
		int yearInt = Integer.parseInt(year);
		if( yearInt <= 18 || yearInt >= 40) {
			System.out.println( "A person can enter the club specile premissiom : " + year);
		}else{
			System.out.println(" A person can not enter the club specile permission : " + year);
			
 }
 
 }
}  
