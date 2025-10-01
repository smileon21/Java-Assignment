package Exception;

public class UserRegistration {
//instance variables
private String name;
private int age;
private String email;

//constructor
public UserRegistration(String name,int age ,String email) {
	this.name = name;
	this.age = age;
	this.email = email;
}
//Method to throw our custom exception
public void validateAge() throws InvalidAgeException {
	if (age < 18) {
		throw new InvalidAgeException("User must be 18 or older! Current age:" + age);	
	}
	System.out.println("Age validation passed");
}
//Another method that might throw exception
public void registerUser() throws InvalidAgeException {
	System.out.println("Registering user:" + name);
	validateAge();//This might throw invalidAgeException
	System.out.println("User registered successfully!");
}

//getter methodds
public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getEmail() {
	return email;
}
}
