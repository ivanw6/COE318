package coe318.lab6;

/**
 *
 * @author ivan wang 501086429
 */
public class Resistor {
    //instance variables
    double resistance;
    Node node1, node2;
    private int resId;
    private static int resCount = 1;
    //constructor
    public Resistor(double resistance, Node node1, Node node2)
    {
        if(resistance < 0) //throws error if resistance is negative
            throw new IllegalArgumentException("Resistances can't be negative!"); 
        if(node1 == null || node2 == null) //throws error if either nodes aren't entered
            throw new IllegalArgumentException("Both connecting nodes must exist!");
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resId = resCount; //assigns resId unique value
        resCount++; //increases the number of resistors
    }
    public Node [] getNodes()
    {
        Node[] nodes = {node1, node2};
        return nodes;
    }
    @Override
    public String toString()
    {
        return("R"+this.resId + " " + node1 + " " + node2 + " " + resistance);
    } 
}
