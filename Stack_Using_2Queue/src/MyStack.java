import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    //using two queue. The push is inefficient.
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        if(q1.isEmpty()) {
            q1.add(x);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }

        }else {
            q2.add(x);
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
        }
    }

    public int pop() {
        if(!q1.isEmpty())
            return q1.poll();
        else
            return q2.poll();
    }

    public int top() {
        System.out.print(q1);
        System.out.print(q2);
        return q1.isEmpty() ? q2.peek() : q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}