//                      6. Stack - Undo Operation
//
//                                Scenario
//A text editor stores user actions in a stack. When the user selects Undo,
// the most recent action should be removed.

//                                    Question
//Implement a Java program using stack<string> that:

//1  Stores editing operations.
//2  Displays the latest operation.
//3  Performs two undo operations.
//4  Displays remaining operations.

import java.util.Stack;
public class Stack_UndoOperation {
    public static void main(String[] args){
        Stack<String> op=new Stack<String>();
        op.push("+");
        op.push("_");
        op.push("*");
        op.push("/");
        op.push("%");

        System.out.print("Display operation : ");
        System.out.println(op);
        System.out.print("Display latest operation : ");
        System.out.println(op.peek());
        op.pop();
        op.pop();
        System.out.println("Performed two undo operations.");
        System.out.print("Display remaining operation : ");
        System.out.println(op);



    }
}
