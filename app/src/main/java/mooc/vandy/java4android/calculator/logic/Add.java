package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements OperationInterface{
    int sum;

    //Since operation is given as ADD, can perform the
    //adding function inside to reduce number of needed methods.
    public Add(int arg1, int arg2) {
        //Sum is equal to the sum of values put into the constructor.
        sum = arg1 + arg2;
    }

    @Override
    public String toString(){
        return sum + "";
    }

    // TODO - add your solution here.
}
