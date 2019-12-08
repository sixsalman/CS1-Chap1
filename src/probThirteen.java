import java.util.Scanner; //imported so Scanner could be used

/**
 *  Author: Salman
 *
 *  This program asks the user for his/her plan and the number of minutes used, validates them and
 *  calculates the user's total bill.
 */
public class probThirteen {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in); // scanner created
        boolean pkgValidation = true;
        boolean minValidation = true;
        char pkg;
        int min;
        //asks and validates package type
        do {
            System.out.print("Enter the package you have purchased (A, B or C): ");
            pkg = ((kbd.nextLine()).toUpperCase()).charAt(0);
            if (pkg=='A'||pkg=='B'||pkg=='C'){
                pkgValidation = false;
            } else {
                System.out.print("Invalid Entry\n");
            }
        }while(pkgValidation);
        //asks and validates no. of minutes used
        do {
            System.out.print("Enter the number of minutes you have used: ");
            min = kbd.nextInt();
            if (min>0){
                minValidation = false;
            } else {
                System.out.print("Invalid Entry\n");
            }
        } while(minValidation);
        kbd.close();
        //outputs bill accordingly
        if (pkg=='A') {
            if (min <= 450){
                System.out.print("Your bill is $39.99\n");
            } else {
                double bill =((min-450)*0.45 + 39.99);
                System.out.printf("Your bill is $%,.2f\n", bill);
            }
        } else if (pkg=='B'){
            if (min <= 900){
                System.out.print("Your bill is $59.99\n");
            } else {
                double bill =((min-900)*0.4 + 59.99);
                System.out.printf("Your bill is $%,.2f\n", bill);
            }
        } else if (pkg=='C'){
            System.out.print("Your bill is $69.99\n");
        }
    }
}
