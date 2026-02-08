import java.util.Stack;

public class BrowserNavigation {

    Stack<String> backStack = new Stack<>();
    Stack<String> forwardStack = new Stack<>();
    String current = null;

    void visit(String page) {
        if (current != null) {
            backStack.push(current);
        }
        current = page;

        forwardStack.clear();  
    }

    void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(current);
            current = backStack.pop();
        } else {
            System.out.println("Back not possible!");
        }
    }

    void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(current);
            current = forwardStack.pop();
        } else {
            System.out.println("Forward not possible!");
        }
    }

    void showState() {
        System.out.println("\nCurrent Page: " + current);
        System.out.println("BackStack    : " + backStack);
        System.out.println("ForwardStack : " + forwardStack);
       
    }

    public static void main(String[] args) {

        BrowserNavigation b = new BrowserNavigation();

        b.visit("Google");
        b.visit("Facebook");
        b.visit("YouTube");

        
        b.back();

    
        b.visit("Wikipedia");

       
        b.showState();
    }
}