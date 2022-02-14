package StacksAndQueues;

public class PriorityQueue {

    private int[] arr;
    private int len;
    private int capacity;


    PriorityQueue(int c){
        capacity = c;
        arr = new int[capacity];
        len = 0;
    }

    private int size(){
        return len;
    }

    private boolean isEmpty(){
        return size()==0;
    }

    private boolean isFull(){
        return size()==capacity;
    }

    private void insert(int elem){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(isEmpty()){
            arr[len++] = elem;
        }else{
            int j;
            for(j = size()-1; j >=0; j--){
                if(elem > arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = elem;
            len++;
            
        }
    }

    private Integer remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return null;
        }
        return arr[--len];
    }

    private int peekMin(){
        return arr[size()-1];
    }

    private void display(){
        System.out.print("<-- ");

        for(int i = 0; i < size(); i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
    

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);
        pq.insert(2);
        pq.insert(3);
        pq.insert(1);
        pq.display();           // <-- 3 2 1 

        pq.insert(-1);          // <-- 5 4 3 2 1 -1
        pq.insert(5);
        pq.insert(4);
        pq.display();

        pq.remove();
        pq.display();           // <-- 5 4 3 2 1


    }
}
