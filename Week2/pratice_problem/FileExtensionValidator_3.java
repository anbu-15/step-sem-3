package Week2.pratice_problem;

import java.util.Scanner;

public class FileExtensionValidator_3 {

    // Method to validate file extension
    public static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected - invalid file type";
        }
//        BankReferenceValidator_5.normalizeReference("");
        String extension = filename.substring(dotIndex + 1);
        if (extension.equalsIgnoreCase("pdf")
                || extension.equalsIgnoreCase("docx") ) {
            return "Accepted";
        }
        return "Rejected - invalid file type";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File Name: ");
//        "Assignment1.PDF
        String filename = sc.nextLine();

        System.out.println(validateFileExtension(filename));

        sc.close();
    }
}
