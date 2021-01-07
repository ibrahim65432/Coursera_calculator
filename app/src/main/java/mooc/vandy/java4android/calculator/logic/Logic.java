package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        if(operation==1){
            //Making constructor.
            Add add = new Add(argumentOne, argumentTwo);
            //The sum is calculated by the declaration of the constructor
            //so can print to print the result.
            mOut.print(add.toString());
        }
        else if(operation==2){
            //Making constructor.
            Subtract subtract = new Subtract(argumentOne, argumentTwo);
            //The subtraction is calculated by the declaration of the constructor.
            //So can print the result using the toString method in the class.
            mOut.print(subtract.toString());
        }
        else if(operation==3){
            //Making constructor.
            Multiply multiply = new Multiply(argumentOne, argumentTwo);
            //The product is calculated by the declaration of the constructor.
            //The toString method in class has the printing.
            mOut.print(multiply.toString());
        }
        else{
            //Since we cannot divide by zero in this program, we will
            //warn the user concerning it.
            if(argumentTwo==0){
                mOut.print("Warning: Division by 0");
            }
            //Since we are not dividing by zero, we can declare the function, which
            //will calculate the result and quotient.
            else {
                Divide divide = new Divide(argumentOne, argumentTwo);
                //Follow by printing using the toString method in the
                mOut.print(divide.toString());
            }
        }
        // TODO - Put your code here.
        
    }
}
