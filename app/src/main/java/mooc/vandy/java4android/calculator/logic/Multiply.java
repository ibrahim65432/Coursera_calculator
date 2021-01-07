package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements OperationInterface {
    private int result = 0;

    //Simple operation, can multiply using the values put into constructor.
    public Multiply(int arg1, int arg2) {
        result = arg1*arg2;
    }

    //Prints the result.
    @Override
    public String toString(){
        return result + "";
    }

    // TODO - add your solution here.
}
