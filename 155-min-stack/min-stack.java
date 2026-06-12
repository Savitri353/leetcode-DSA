class MinStack {
    Stack<Integer> s1;
    Stack<Integer> min;

    MinStack() {
        s1 = new Stack<>();
        min = new Stack<>();
    }


    public void push(int val) {
        if(min.isEmpty() || min.peek() >= val) {
            min.push(val);
        }

        s1.push(val);
    }

    public void pop() {
        if(s1.peek().equals(min.peek())) {
            min.pop();
        }

        s1.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
   