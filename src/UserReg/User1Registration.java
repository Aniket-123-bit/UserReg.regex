package UserReg;
import java.util.Scanner;
import java.util.regex.*;

public class User1Registration {

    private boolean check;
    private String firstandlast;
    private static  Scanner SCANNER  = new Scanner(System.in);


    public void checkFirstName() {
        System.out.println("Enter First-name and Last name starts with capital letter and has minimum 3 character : ");
        firstandlast = SCANNER.nextLine();
        check = Pattern.compile("[A-Z]{1}[a-z]{2,} [A-Z]{1}[a-z]{2,}").matcher(firstandlast).matches();
        if (!check) {
            System.out.println("Invalid!!A");
            checkFirstName();
        }
        else {
            System.out.println(" It's a Valid Firstname ");
        }
    }


    public static void main(String[]args) {
        User1Registration user = new User1Registration();
        user.checkFirstName();

    }
}



