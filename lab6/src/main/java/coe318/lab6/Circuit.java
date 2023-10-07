package coe318.lab6;
import java.util.ArrayList;
/**
 *
 * @author ivan wang 501086429
 */
public class Circuit {
    
    ArrayList<Resistor> resistors;
    private static Circuit instance = null;
    
    public static Circuit getInstance()
    {
        if (instance == null)
        {
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit()
    {
        this.resistors = new ArrayList<Resistor>(); //creates a new arraylist of resistors
    }
    
    public void add(Resistor r)
    {
        this.resistors.add(r); //adds the resistor into arraylist
    }
    
    @Override
    public String toString()
    {
        String circuit = new String();
        for(int i = 0; i < this.resistors.size(); i++)
        {
            circuit += this.resistors.get(i).toString() + "\n";
        }
        return circuit;
    }
}
