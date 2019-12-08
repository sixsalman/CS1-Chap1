import java.util.Scanner; //imported so Scanner could be used

/**
 *  Author: Salman
 *
 *  This program asks the user fora number between 1 and 10 and outputs the corresponding
 *  roman figure using switch statements.
 */
public class probSwitch {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in); // scanner created
        System.out.println("Please input an integer (1-10)"); // asks for the integer
        int myInt = kbd.nextInt();
        kbd.close();
        //selects the roman figure
        switch (myInt) {
            case 1:
                System.out.println("i");
                break;
            case 2:
                System.out.println("ii");
                break;
            case 3:
                System.out.println("iii");
                break;
            case 4:
                System.out.println("iv");
                break;
            case 5:
                System.out.println("v");
                break;
            case 6:
                System.out.println("vi");
                break;
            case 7:
                System.out.println("vii");
                break;
            case 8:
             System.out.println("Viii");
                break;
            case 9:
                System.out.println("ix");
                break;
            case 10:
                System.out.println("x");
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
