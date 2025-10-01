package Exception;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("====USER REGISTRATION SYSTEM ====");
		
		//Test 1:Valid user
		System.out.println("\n1. Testing Valid User:");
		UserRegistration user1 = new UserRegistration("Dawn",21,"d.mung@gmail.com");
		try { 
			user1.registerUser();
		}catch (InvalidAgeException e) {
			System.out.println("Registration failed:" + e.getMessage());
		}
		//Test 2:Invalid User
		System.out.println("\n2. Testing Underage User:");
		UserRegistration user2 = new UserRegistration("Ashyy", 16, "ashyy@gmail.com");
		try {
			user2.registerUser();
		}catch (InvalidAgeException e) {
			System.out.println("Registration failed:" + e.getMessage());
		}
	      // Test case 3: Another valid user
        System.out.println("\n3. Testing Another Valid User:");
        UserRegistration user3 = new UserRegistration("Charlie", 30, "charlie@email.com");
        try {
            user3.validateAge(); // Testing the validateAge method directly
        } catch (InvalidAgeException e) {
            System.out.println("Age validation failed: " + e.getMessage());
        }
        
        System.out.println("\n=== PROGRAM COMPLETED ===");
	}

}
