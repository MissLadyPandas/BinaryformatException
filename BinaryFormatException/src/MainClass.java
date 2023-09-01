import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // input to enter a binary number
        System.out.println("Enter a binary number:");
        // reads and stores in a variable
        String binaryString = input.next();
        
        try {
            // try to convert the binary string to a decimal number
            int decimal = bin2Dec(binaryString);
            // if successful, outputs confirmation
            System.out.println("The decimal equivalent is: " + decimal);
            // if there is a binaryformat exception, error message will print
        } catch (BinaryFormatException e) {
            // if a BinaryFormatException is thrown, display an error message
            System.out.println(e.getMessage());
        }

        // close scanner
        input.close();
    }
    // method to convert binary string to decimal
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Initialize decimal value to 0
        int decimal = 0;

        // Loop through each character in the binary string
        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);

            // If the character is not a binary digit, throws a BinaryFormatException
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Not a binary number");
            }

            // Add the binary digit to the decimal value
            decimal = decimal * 2 + (ch - '0');
        }

        // Return the decimal value
        return decimal;
    }
}
