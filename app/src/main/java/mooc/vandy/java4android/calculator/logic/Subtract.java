package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements OperationInterface{
    private int result = 0;

    //Simple subtraction operation can be performed within the
    //constructor for simplicity.
    public Subtract(int arg1, int arg2) {
        result = arg1 - arg2;
    }

    //Prints the result.
    public String toString(){
        return result + "";
    }

    // TODO - add your solution here.
}
