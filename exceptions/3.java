public class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String msg) {
        super(msg);
    }
}

public class LoginSystem {
    public static void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals("admin") || !pass.equals("1234")) {
            throw new InvalidCredentialsException("Invalid Credentials! Try again.");
        }
        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {
        try {
            validate("user", "0000");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
 {
    
}

