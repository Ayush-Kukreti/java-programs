public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyStack myStack = new MyStack();

        // push
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        // peek
        myStack.top();


        MyQueue q1 = new MyQueue();
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);


        q1.push(1);

        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(5));

    }
}