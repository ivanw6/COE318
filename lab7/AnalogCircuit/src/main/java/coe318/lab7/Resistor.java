package coe318.lab7;

/**
 *
 * @author ivan wang 501086429
 */
public class Resistor {

    //initialize instance variables
    private double resistance;
    private int node1, node2;
    private static int resCount = 1;
    private int resId = 0;

    /**
     * creates the resistor constructor
     * @param node1
     * @param node2
     * @param resistance 
     */
    public Resistor(int node1, int node2, double resistance) {
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resId = resCount;
        resCount++;
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
     * @return resistors in string representation
     */
    @Override
    public String toString() {
        return ("R" + this.resId + " " + this.node1 + " " + this.node2 + " " + this.resistance); //returns the resistor in string format
    }
}
