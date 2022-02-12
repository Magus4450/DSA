package StacksAndQueues;


class StackD {
    
    private int curr;
    private char[] arr;
    private int capacity;


    public StackD(int capacity){
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


public class DelimChecker {
    
    String codeString;

    DelimChecker(String s){
        this.codeString = s;
    }

    public boolean checkDelimiters(){
        
        int len = codeString.length();

        StackD st = new StackD(len);

        
        for(int i =0; i < len; i++){

            // Current character
            char c = codeString.charAt(i);

            // If Start of delims, push to stack
            if(c == '[' || c == '{' || c == '('){
                st.push(c);
            // If end of delims
            }else if(c == ']' || c == '}' || c == ')'){
                
                // If stack is not empty pop the last element and check if it matches with it corresponding delim
                if(!st.isEmpty()){
                    char chx = st.pop();
                    if((c == '}' && chx != '{') || (c == ']' && chx != '[') || (c == ')' && chx != '(')){
                        System.out.println("Error: " + c + " at " + i);
                        return false;
                    }
                }else{
                    // If empty return
                    System.out.println("Error: " + c + " at " + i);
                    return false;
                }
            }
           

        }
        return true;
    }
    



    public static void main(String[] args) {
        DelimChecker dc = new DelimChecker("a[b{c}d]e}");
        System.out.println(dc.checkDelimiters());               // Error: } at 9
                                                                // false
              

        DelimChecker dc1 = new DelimChecker("{(a)[b{c}d]e}");
        System.out.println(dc1.checkDelimiters());              // true                
    }
}
