package StacksAndQueues;


public class Queue {


    private int capacity;
    private int[] arr;
    private int len;
    private int front;
    private int rear;

    Queue(int lim){
        capacity = lim;
        arr = new int[this.capacity];
        len = 0;
        front = 0;
        rear = -1;

    }

    public int size(){
        return len;
    }

    public void insert(int elem){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        } 
        if(rear == capacity-1){
            rear = -1;
        }
        arr[++rear] = elem;
        len++;
    }

    public int remove(){
        
        int elem = arr[front++];

        if(front == capacity){
            front = 0;
        }
        len--;
        return elem;
        
    }

    public int peekFront(){
        return arr[front];
    }

    public int peekRear(){
        return arr[rear];
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public boolean isFull(){
        return size()==capacity;
    }


    public void display(){
        System.out.print("<-- ");

        if(rear >= front){
            for(int i = front; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        }else{
            for(int i = front; i < capacity; i++){
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i <= rear; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
        


    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();            // <-- 10 20 30 40 

        queue.remove();
        queue.remove();
        queue.remove();

        queue.display();            // <-- 40

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        queue.display();            // <-- 40 50 60 70 80
    }
    
}
