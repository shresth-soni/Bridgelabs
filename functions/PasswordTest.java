interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[a-z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()].*");
    }
}

public class PasswordTest {
    public static void main(String[] args) {
        String password = "Strong@123";
        System.out.println("Is strong password? " + SecurityUtils.isStrongPassword(password));
    }
}
