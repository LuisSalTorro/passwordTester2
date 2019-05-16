import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        boolean passwordAccepted = false;
        String pass;
        System.out.println("Enter a password to test its strength.");

        while(!passwordAccepted){
            Scanner key  = new Scanner(System.in);
            pass = key.nextLine();
            passwordAccepted = passwordIsGood(pass);
        }

    }
    public static boolean passwordIsGood(String pass){
        if(pass.length() > 6 && containsDigits(pass) && containsUpLowCase(pass) && hasSpecial(pass)){
            System.out.println("You're password is strong!");
            return true;
        }
        System.out.println("Weak password.  Try another.");
        return false;

    }

    public static boolean containsDigits(String pass){
        if(pass.matches(".*\\d.*")){
            return true;
        }
        System.out.println("You need a digit.");
        return false;
    }

    public static boolean containsUpLowCase(String pass){
        if(!pass.equals(pass.toLowerCase()) && !pass.equals(pass.toUpperCase())){
            return true;
        }
        System.out.println("You need a lower and upper case letter.");
        return false;
    }

    public static boolean hasSpecial(String pass){
        if(!pass.matches("[A-Za-z0-9 ]*")){
            return true;
        }
        System.out.println("You need a special character.");
        return false;
    }

}