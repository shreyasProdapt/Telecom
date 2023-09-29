import java.util.*;
public class TeleMain {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		NewRegistration nReg = new NewRegistration();
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your gender: ");
		char gender = sc.next().charAt(0);
		System.out.println("Enter your Aadhar Number: ");
		String aadhar  = sc.next();
		while(nReg.checkAadhar(aadhar))
		{	
			System.out.println("Enter the Valid Aadhar Number: ");
			aadhar = sc.next();
		}
		System.out.println("Enter your Address: ");
		String address = sc.next();
		
		new NewRegistration(name,age,gender,aadhar,address);
		nReg.VerifyDetails();
		
	}

}
