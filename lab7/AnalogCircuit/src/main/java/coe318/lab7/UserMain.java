package coe318.lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivan wang 501086429
 */
public class UserMain {

    private static int n1, n2; //nodes of resistor or source
    private static double value; //value of resistor or source

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circuit cir = Circuit.getInstance();
        System.out.println("Please enter a source or a resistor (format: 'v' or 'r' followed by nodes and value, each seperated by a space) (input 'end' to stop)");
        String entered = "";
        while (input != null) {
            entered = input.nextLine();
            String arr[] = entered.split(" ", 4);
            if (entered.startsWith("v")) {
                n1 = Integer.parseInt(arr[1]);
                n2 = Integer.parseInt(arr[2]);
                value = Double.parseDouble(arr[3]);
                Voltage v1 = new Voltage(n1, n2, value);
                cir.addVoltage(v1);
            }
            if (entered.startsWith("r")) {
                n1 = Integer.parseInt(arr[1]);
                n2 = Integer.parseInt(arr[2]);
                value = Double.parseDouble(arr[3]);
                Resistor r1 = new Resistor(n1, n2, value);
                cir.addResistor(r1);
            }
            if (entered.equals("spice")) {
                System.out.println(cir.toString());
            }
            if (entered.equals("end")) {
                break;
            }
        }
        System.out.println("All Done!");
    }
}
