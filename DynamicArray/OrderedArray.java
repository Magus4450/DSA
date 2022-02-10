package DynamicArray;

@SuppressWarnings("unchecked")
public class OrderedArray {
    
    private int len = 0;
    private int capacity = 0;
    private long[] arr;

    public OrderedArray(){
        this(16); // If no argument sent, initilialize array with capacity of 16
    }
    public OrderedArray(int capacity){
        if(capacity < 0){ 
            throw new IllegalArgumentException("Capacity must be positive");
        }

        this.capacity = capacity;
        arr = new long[capacity]; // Create object array of length capacity and type cast to T[]

    }

    public int size(){ return len; }

    private void checkIndex(int index){ // If bad index, throw Exception
        if(index >= size() || index < 0) throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, size()));
    }

    public long get(int index){ 
        checkIndex(index);
        return arr[index];
    }

    
    public void insert(long elem){
        if(size() + 1 > capacity){
            capacity = (capacity == 0) ? 1 : capacity * 2;

            long[] newArr = new long[capacity];

            for(int i = 0; i < size(); i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }

        if(size() == 0){
            arr[0] = elem;
            len++;
            return;
        }

        int i;
        for(i = 0; i < size(); i ++){
            if(elem <= arr[i]){ break; }
        }
        for(int j = size(); j > i; j--){
            arr[j] = arr[j-1];
        }

        arr[i] = elem;
        len++;

    }

    public void delete(long elem){
        int index = find(elem);
        if (index == -1) { return; }
        for(int j = index; j < size(); j++){
            arr[j] = arr[j + 1];
        }
        arr[size()] = 0;
        len--;
    }

    public int find(long elem){

        int start = 0;
        int end = size() - 1;
        int current;
        while(true){
            current = (start + end) / 2;
            if(elem == arr[current]){
                return current;
            }else if (end < start){
                return - 1;
            }else if(elem < arr[current]){
                end = current - 1;
            }else if(elem > arr[current]){
                start = current + 1;
            }
        }


    }

    public void display(){ // Display the array
        System.out.print("[");
        for(int i = 0 ; i < size(); i++){
            if(i == size() - 1){
                System.out.print(get(i));
            }else{
                System.out.print(get(i)+",");
            }
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        OrderedArray arr = new OrderedArray(0);
        arr.display();          // []

        arr.insert(3);  
        arr.display();          // [3]
        arr.insert(2);
        arr.display();          // [2,3]

        arr.insert(7);
        arr.display();          // [2,3,7]
        arr.insert(4);
        arr.display();          // [2,3,4,7]
        arr.insert(1);
        arr.insert(-1); 
        arr.display();          // [-1,1,2,3,4,7]
        arr.delete(1);
        arr.display();          // [-1,2,3,4,7]
        arr.delete(-1);
        arr.display();          // [2,3,4,7]

    }
}
