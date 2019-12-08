import java.util.Scanner; //imported so Scanner could be used

/**
 *  Author: Salman
 *
 *  This program asks the user fora number between 1 and 10 and outputs the corresponding
 *  roman figure using if-else statements.
 */
public class probIfElse {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main (String[] args) {
            Scanner kbd = new Scanner(System.in); // scanner created
            System.out.println("Please input an integer (1-10)");
            int myInt = kbd.nextInt();
            kbd.close();
            //selects the roman figure
            if (myInt == 1) {
                System.out.println("i");
            } else if (myInt == 2) {
                System.out.println("ii");
            } else if (myInt == 3) {
                System.out.println("iii");
            } else if (myInt == 4) {
                System.out.println("iv");
            } else if (myInt == 5) {
                System.out.println("v");
            } else if (myInt == 6) {
                System.out.println("vi");
            } else if (myInt == 7) {
                System.out.println("vii");
            } else if (myInt == 8) {
                System.out.println("Viii");
            } else if (myInt == 9) {
                System.out.println("ix");
            } else if (myInt == 10) {
                System.out.println("x");
            } else {
                System.out.println("Invalid Entry");
            }
    }
}
