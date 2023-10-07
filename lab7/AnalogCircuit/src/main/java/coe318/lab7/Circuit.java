package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author ivan wang 501086429
 */
public class Circuit {

    private ArrayList<Object> circuit;
    private static Circuit instance = null;

    /**
     * 
     * @return new instance of a circuit
     */
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    /**
     * constructs an array list of objects
     */
    private Circuit() {
        this.circuit = new ArrayList<Object>();
    }

    /**
     * adds the resistor into the circuit
     * @param r 
     */
    public void addResistor(Resistor r) {
        this.circuit.add(r);
    }

    /**
     * adds the voltage into the circuit
     * @param v 
     */
    public void addVoltage(Voltage v) {
        this.circuit.add(v); 
    }
    /**
     * returns the circuit in string representation
     * @return circuitStr
     */
    @Override
    public String toString() {
        String circuitStr = new String();
        for (int i = 0; i < this.circuit.size(); i++) //loops through the circuit arraylist
        {
            circuitStr += this.circuit.get(i).toString() + "\n"; //adds each index of the array list into circuitStr variable in string format
        }
        return circuitStr; //returns the circuit in string representation
    }
}
