class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        q1.add(x);

         while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

// We use two queues: q1 and q2

// We will keep q1 always storing stack order, meaning:

// top element should always be at the front of q1

// So when we push(x):

// Put x into q2

// Move all elements of q1 into q2

// Swap q1 and q2

// This way, newest element comes in front → behaves like a stack (LIFO)

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */