package StacksAndQueues;
class StackR {
    
    private int curr;
    private char[] arr;
    private int capacity;


    public StackR(int capacity){
        this.capacity = capacity;
        arr = new char[this.capacity];
        curr = -1;
    }

    public void push(char j ){
        // Increment current and add j
        if(isFull()){
            throw new StackOverflowError();
        }
        arr[++curr] = j;
    }

    public char pop(){
        return arr[curr--];
    }

    public char peek(){
        return arr[curr];
    }

    public boolean isEmpty(){
        return curr == -1;
    }

    public boolean isFull(){
        return curr == capacity-1;
    }

}

public class ReverseWord {
    
    private String s;

    ReverseWord(String s){
        this.s = s;
    }

    public String reverse(){
        String reversed = new String();
        int len = s.length();

        StackR st = new StackR(len);

        // Push each character into the stack
        for(int i = 0; i < len; i++){
            st.push(s.charAt(i));
        }

        // Pop characters from stack until empty and append to string reversed
        while(!st.isEmpty()){
            reversed += st.pop();
        }

        


        return reversed;
    }

    public static void main(String[] args) {
        ReverseWord rw = new ReverseWord("Hello");
        System.out.println(rw.reverse());               // olleH
    }
}



