                            //5. Stack - Browser Back Button
                            //        Scenario

//A web browser stores visited pages in a stack. When the user clicks the Back button,
// the most recently visited page should be removed from the stack.

//                   Question

//Using stack<string>:
//        1. Push five visited webpages.
//        2. Display the current page.
//        3. Perform two Back operations.
//        4. Display the page currently visible.
//        5. Display remaining history.

import  java.util.Stack;
public class Stack_BrowserBackButton {
    public static void main(String[] args) {
        Stack<String> page=new Stack<String>();
        page.push("kiet.edu");
        page.push("aktu.ac.in");
        page.push("erp.ac.inn");
        page.push("gla.ac.in");
        page.push("mha.ac.in");

        System.out.print("Display the current page : ");
        System.out.println(page.peek());
        System.out.println("Two Back Operations  ");
        page.pop();
        page.pop();
        System.out.print("Display the current page : ");
        System.out.println(page.peek());
        System.out.print("Page History : ");
        System.out.println(page);

    }
}
