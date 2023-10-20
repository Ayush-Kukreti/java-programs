import java.util.Stack;

class MyQueue {

    Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();
    public void push(int x) {
        if(s1.isEmpty()){
            s1.add(x);
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
        }else{
            s2.add(x);
            while(!s1.isEmpty()){
                s2.add(s1.pop());
            }
        }
    }

    public int pop() {
        if(!s1.isEmpty())
            return s1.pop();
        return s2.pop();
    }

    public int peek() {
        if(!s1.isEmpty())
            return s1.peek();
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}