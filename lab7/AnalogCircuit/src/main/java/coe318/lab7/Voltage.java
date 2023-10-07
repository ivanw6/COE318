package coe318.lab7;

/**
 *
 * @author ivan wang 501086429
 */
public class Voltage {

    //initialize instance variables
    private double voltage;
    private int node1, node2;
    private static int voltCount = 1;
    private int voltId = 0;

    /**
     * creates the voltage constructor
     * @param node1
     * @param node2
     * @param voltage 
     */
    public Voltage(int node1, int node2, double voltage) {
            this.voltage = voltage;
            this.node1 = node1;
            this.node2 = node2;
            this.voltId = voltCount;
            voltCount++;   
    }
    /**
     * 
     * @return an array of nodes
     */
    public int[] getNodes() {
        int nodes[] = new int[2];
        nodes[0] = this.node1;
        nodes[1] = this.node2;
        return nodes;
    }
    /**
     * 
     * @return source voltage in string representation
     */
    @Override
    public String toString() {
        return ("V" + this.voltId + " " + this.node1 + " " + this.node2 + " DC " + this.voltage); //returns the voltage in string format
    }
}
