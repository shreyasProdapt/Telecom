
public class NewRegistration {
	public static String name;
	public static int age;
	public static char gender;
	public static String aadharNo;
	public static String address;
	
	NewRegistration()
	{
		
	}
	NewRegistration(String name,int age,char gender,String aadhar,String address)
	{
		NewRegistration.name=name;
		NewRegistration.age=age;
		NewRegistration.gender=gender;
		NewRegistration.aadharNo=aadhar;
		NewRegistration.address=address;
	}
	public void VerifyDetails()
	{	
		System.out.println("\n");
		System.out.println("Kindly Check the below details : ");
		System.out.println("The name of the person is: "+name);
		System.out.println("The age of the person is: "+age);
		System.out.println("The gender of the person is: "+gender);
		System.out.println("The aadharNo of the person is: "+aadharNo);
		System.out.println("The Address of the person is: "+address);
		System.out.println("\n");


	}
	
	public boolean checkAadhar(String no) {
		if(no.length()!=12)
		{
			System.out.println("The Aadhar number you entered is invalid!!! \n Please Enter again");
			return true;
		}
		else
			return false;
	}
	

}
