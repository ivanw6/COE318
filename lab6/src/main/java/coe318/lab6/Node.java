package coe318.lab6;

/**
 *
 * @author ivan wang 501086429
 */
public class Node {
    //instance variables
    private int nodeId;
    private static int nodeCount = 0;
    
    //constructor for node
    public Node(){ 
        this.nodeId = nodeCount; //assigns nodeId unique value
        nodeCount++; //accumulates the number of nodes
    }
  
    /*
    returns the string representation of the node id
    */
    @Override
    public String toString(){
        return (Integer.toString(this.nodeId)); // returns the node id string formatted
    }
}


