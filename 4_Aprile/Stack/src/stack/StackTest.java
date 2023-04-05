package stack;

public class StackTest {
    public static void main(String[] args) {
        MyStack mstack = new MyStack(5);

        try {
            mstack.push(5);
            mstack.push(3);
            mstack.push(6);
            System.out.println(mstack.pop());
            System.out.println(mstack.pop());
            System.out.println(mstack.pop());
            System.out.println(mstack.pop());
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println(e.getMessage());
        }
 
    }
}
