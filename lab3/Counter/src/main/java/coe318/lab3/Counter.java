/**
 *
 * @author Ivan Wang 501086429
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int mod; //modulus
    int digit; //counter digit
    Counter neighbour; //left
        
    public Counter(int modulus, Counter left) {
        neighbour = left; 
        mod = modulus;
        digit = 0; 
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return neighbour;
    }

    /** 
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        digit++;
        if (digit == mod)
        {
            digit = 0;
            if (neighbour != null)
            {
                neighbour.digit++;
            }
        }
    }
    
    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        if (neighbour != null)
        {
            return (digit + mod * neighbour.digit);
        }
        else
        {
            return(digit);
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}