package stack;

/**
 * Stack
 */
public class MyStack {

    int[] stack;
    int pos;

    public MyStack(int n) {
        this.stack = new int[n];
        pos = 0;
    }

    public int pop() throws Exception {
        if(pos ==0){
            throw new Exception("Stack vuoto");
        }
        pos--;
        int result = stack[pos];
        stack[pos] = 0;
        return result;
    }
    
    public void push(int n) {
        //Inserisce n nello stack
        if(pos<stack.length){
            stack[pos] = n;
            pos++;
        }else{
            System.out.println("Stack già pieno.");
        }
    }
}