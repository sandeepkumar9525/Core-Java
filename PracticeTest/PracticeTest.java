/*
	 4> Collage Admission
	  > admission(String studentName, String String courseName);
	  > verifyDocument(String documentId);
	  > payFees(int amount);
	  > generatRollNumber(String studentId);

*/
  class PracticeTest
  {
  
	public static String admission(String studentName , String courseName){
		System.out.println(" Student name is : " + studentName);
		System.out.println("I completed : " +courseName);
		return "admission is successfull";
	}
	public static String verifyDocument(String documentId){
		System.out.println("Student document ID is : " + documentId);
		return "documentId";
	}
	public static boolean payFees(int amount ){
		System.out.println("Collage fees is : " + amount);
		return true;
	}
	public static String generat RollNumber(String studentId){
		System.out.println("It is need  : " + studentId);
		return "studentId";
	}
  public static void main(String [] args)
  {
		PracticeTest cd = new PracticeTestS();
		pt.admission("Sandeep Kumar" , "BCA");
		pt.verifyDocument("FGDF3456");
		pt.payFees(7500);
		pt.generatRollNumber("A45");
	}
	
}
   
  