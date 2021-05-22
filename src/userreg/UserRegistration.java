package userreg;
import java.util.Scanner;
import java.util.regex.*;
public class UserRegistration {
    private boolean check;
    private String firstName;
    private static final Scanner SCANNER = new Scanner(System.in);

   public void checkFirstName(){
       System.out.println("Enter First-name strats with capital letter and has minimum 3 character: ");
       firstName = SCANNER.nextLine();
       check = Pattern.compile("[A-z]{1}[a-z]{3,}").matcher(firstName).matches();
       if(!check) {
           System.out.println("Invalid!! name");
           checkFirstName();;

       }
       else{
           System.out.println("This is valid Firstname");
       }

}

public static void main(String[] args){
     UserRegistration user = new UserRegistration();
     user.checkFirstName();

   }
}
