package ExceptionHanding;

class InValidUsername extends Exception{
    public InValidUsername(String message) {
        super(message);
    }
}

class InValidPassword extends Exception{
    public InValidPassword(String message) {
        super(message);
    }
}

public class UserAuthentication {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";

    private static void authenticate(String username, String password) throws InValidUsername, InValidPassword {
        if (!isValidateusername(username)) {
            throw new InValidUsername("Invalid username");
        }
        if(!isValidatePassword(password))
        {
            throw new InValidPassword("Invalid Password");
        }
    }

    private static boolean isValidateusername(String username){
        return username.equals(VALID_USERNAME);
    }

    private static boolean isValidatePassword(String password){

        return password.equals(VALID_PASSWORD);
    }
    public static void main(String[] arg) {
        String username = "admin";
        String password = "password123";

            try {
                authenticate(username, password);
                System.out.println("Authentication Successful!");
            } catch (InValidPassword | InValidUsername e) {
//                throw new Runt
                System.out.println("Error : " + e.getMessage());
            }
    }

}
