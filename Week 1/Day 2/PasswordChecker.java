import java.util.*;
public class PasswordChecker {
    public static void CheckPassword(String pass){
        boolean hasupper = false;
        boolean haslower = false;
        boolean hasdigit = false;
        boolean hasspecial = false;

        if(pass.length()<8){
            System.out.println("Please Enter atleast 8 Digit Character");
        }
        for(char ch : pass.toCharArray()){
             if (Character.isUpperCase(ch)) {
                hasupper = true;
            } else if (Character.isLowerCase(ch)) {
                haslower = true;
            } else if (Character.isDigit(ch)) {
                hasdigit = true;
            } else {
                hasspecial = true;
            }
        }

        if(hasupper && haslower && hasdigit && hasspecial){
            System.out.println("Strong Password");
        }
        if (!hasupper)
                System.out.println("-Missing uppercase letter");
            if (!haslower)
                System.out.println("-Missing lowercase letter");
            if (!hasdigit)
                System.out.println("-Missing digit");
            if (!hasspecial)
                System.out.println("-Missing special character");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String pass = sc.nextLine();
        CheckPassword(pass);
    }
}
