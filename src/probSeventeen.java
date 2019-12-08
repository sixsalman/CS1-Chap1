import java.util.Scanner; //imported so Scanner could be used

/**
 * Author: Salman
 *
 * This program gives instructions to troubleshoot a router problem and returns an appropriate
 * response for the result of every instruction.
 */
public class probSeventeen {

    /**
     * Main handles the driver code for the program. Inputs are taken,
     * processed and outputted in this method.
     */
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in); // scanner created
        System.out.print("Reboot the computer and try to connect again\nDid that fix the problem?(y or n): ");
        char fix = ((kbd.nextLine()).toLowerCase()).charAt(0);
        // asks if the previous suggestion fixed if it didn't it provides another one
        if (fix == 'y') {

            System.out.println("Problem fixed!");

        } else if (fix == 'n') {

            System.out.print("Make sure the cables between the router & modem are plugged in firmly." +
                    "\nDid that fix the problem?(y or n): ");
            fix = ((kbd.nextLine()).toLowerCase()).charAt(0);

            if (fix == 'y') {

                System.out.println("Problem fixed!");

            } else if (fix == 'n') {

                System.out.print("Move the router to a new location and try to connect." +
                        "\nDid that fix the problem?(y or n): ");
                fix = ((kbd.nextLine()).toLowerCase()).charAt(0);

                if (fix == 'y') {

                    System.out.println("Problem fixed!");

                } else if (fix == 'n') {

                    System.out.print("Get a new router.");

                } else {

                    System.out.println("Invalid entry");

                }
            } else {

                System.out.println("Invalid entry");

            }
        } else {

            System.out.println("Invalid entry");

        }
        kbd.close();
    }
}