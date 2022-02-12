package StacksAndQueues;


class Stack {
    
    private int curr;
    private int[] arr;
    private int capacity;


    public Stack(int capacity){
        this.capacity = capacity;
        arr = new int[this.capacity];
        curr = -1;
    }

    public void push(int j ){
        // Increment current and add j
        if(isFull()){
            throw new StackOverflowError();
        }
        arr[++curr] = j;
    }

    public int pop(){
        // Return last element and decrement curr
        return arr[curr--];
    }

    public int peek(){
        // Return the last element
        return arr[curr];
    }

    public boolean isEmpty(){
        return curr == -1;
    }

    public boolean isFull(){
        return curr == capacity-1;
    }


    public void display(){
        // Fancy way to print the stack
        System.out.println("  ^  ");
        for(int i = curr; i >= 0; i--){
            System.out.println("| " + arr[i]+" |");
        }
        System.out.println("-----");
    }
    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.display();
    }
}
