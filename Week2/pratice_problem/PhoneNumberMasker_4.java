package Week2.pratice_problem;

import java.util.Scanner;

public class PhoneNumberMasker_4 {
    public static String maskPhoneNumber(String phone) {
        if (phone.length() != 10) {
            return "Invalid phone number";
        }
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }
        String lastFour = phone.substring(6);
        StringBuilder masked = new StringBuilder();
        masked.append("XXXXXX");
        masked.append(lastFour);
        masked.insert(6, "-");
        return masked.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.println(maskPhoneNumber(phone));
        sc.close();
    }
}
