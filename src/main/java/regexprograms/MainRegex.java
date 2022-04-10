package regexprograms;

public class MainRegex {

	public static void main(String[] args) {
		
		Regex reg=new Regex();
		System.out.println("Created Regex program");
		System.out.print("validName is:");
		reg.ValidName();
		
		System.out.print("  LastName is:");
		reg.LastName();
		System.out.print("  Email is: ");
		reg.Email();
		System.out.print("  MobileNumber is: ");
		reg.Mobilenumb();
		System.out.print("  PassWord is: ");
		reg.Password();
		

	}

}
