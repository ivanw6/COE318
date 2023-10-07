package coe318.lab6;

/**
 *
 * @author ivan wang 501086429
 */
public class CircuitTry {
    public static void main(String[] args)
    {
        //initialize circuit object
        Circuit cir = Circuit.getInstance();
        
        //initialize new nodes
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        //prints out string format of nodes
        System.out.println("\nNodes:");  
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        //initalize new resistors
        Resistor r1 = new Resistor(10.0, a, b);
        Resistor r2 = new Resistor(1.0, b, c);
        //prints out string format of resistors
        System.out.println("\nResistors:");  
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        //adds the resistors into the circuit
        cir.add(r1);
        cir.add(r2);
        //prints out string format of circuit
        System.out.println("\nCircuits:");  
        System.out.println(cir.toString()); 
        
        
        /*testing errors
        Resistor r3 = new Resistor(5.0, b, null);
        Resistor r4 = new Resistor(-1.0, b, c);
        System.out.println(r3.toString());
        System.out.println(r4.toString());
        */
    }
}
