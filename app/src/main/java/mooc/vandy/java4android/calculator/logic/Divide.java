package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements OperationInterface{
    private int result = 0;
    private int quotient = 0;

    //Since we know we need to divide and have a quotient,
    //we can perform the calculation of it by the use of constructor
    //values.
    public Divide(int arg1, int arg2) {
        result = arg1/arg2;
        //Because remainder is always positive, we use absolute value function.
        quotient = Math.abs(arg1%arg2);
    }

    //Will print results into screen.
    public String toString(){
        return result + " R: " + quotient;
    }

    // TODO - add your solution here.
}
