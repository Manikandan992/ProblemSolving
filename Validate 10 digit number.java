import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        Validate whether the phone number is in this specific pattern "XXX-XXX-XXXX"
        String pNo=input.next();
        if (pNo.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
            System.out.println("Valid Phone Number");
        else
            System.out.println("Invalid Phone Number");
    }
}
