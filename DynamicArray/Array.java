package DynamicArray;

@SuppressWarnings("unchecked")
public class Array <T>{

    protected T [] arr; // Static array
    private int len = 0; // Length the user sees
    protected int capacity = 0; // Actual length of the array


    public Array(){
        this(16); // If no argument sent, initilialize array with capacity of 16
    }
    public Array(int capacity){
        if(capacity < 0){ 
            throw new IllegalArgumentException("Capacity must be positive");
        }

        this.capacity = capacity;
        arr = (T[]) new Object[capacity]; // Create object array of length capacity and type cast to T[]

    }

    public int size(){ // Return actual size of the array
        return this.len; 
    }

    private void checkIndex(int index){ // If bad index, throw Exception
        if(index >= size() || index < 0) throw new IndexOutOfBoundsException(String.format("Index %d out of bound for length %d", index, size()));
    }

    public T get(int index){ // Return value at index
        checkIndex(index);
        return arr[index];
    }

    public void set(int index, T elem){ // Set value at index
        checkIndex(index);
        arr[index] = elem;
    }

    public void clear(){ // Clear the whole array
        arr = (T[]) new Object[capacity];
        len = 0;
    }

    private boolean increaseCap(){ // When trying to add new element, check if it has enough capacity, if not double it
        if(size() + 1 > capacity){
            capacity = (capacity == 0) ? 1 : capacity * 2;
            return true;
        }
        return false;
    }
    public void add(T elem){ // Add element to the end of the array

        if(increaseCap()){ // If capacity was increase, copy the array to new array of new capacity
            T[] newArr = (T[]) new Object[capacity];
            int i;
            for(i = 0; i < size(); i++){
                newArr[i] = get(i);
            }
            newArr[i] = elem; // Add the element to the end of the new array
            len++; // Increment size
            arr = newArr; // Assign the new array to old array
        }else{
            arr[size()] = elem; // Add element to the end of the array
        }
        
    }

    public int find(T elem){ // Return index of element
        for(int i = 0 ; i < size(); i++){
            if(elem.equals(get(i)))
                return i;
        }
        return -1; // If not found, return -1
    }

    public void remove(T elem){ // Remove element

        int i, index = find(elem);
        
        // Copying the value backwards till the element we want to delete
        for(i = index; i < size()-1; i++){
            arr[i] = arr[i+1];
        }
        arr[i] = null; // Setting the last element of the array to null
        len--; // Decreasing size
    }

    public void insert(int index, T elem){ // Insert element at index
        
        checkIndex(index);
        
        if(increaseCap()){ // If capacity was increased
            T[] newArr = (T[]) new Object[capacity]; // Create new array with new capacity to store element of old array
            for(int i = 0; i < size(); i++){ // Copying
                newArr[i] = arr[i];
            }
            arr = newArr; // Assigning old array to the value of new array
        }

        int i;
        for(i = size(); i > index; i--){ // Shifting the value backwards till the index we want to add element
            arr[i] = arr[i-1];
        }

        arr[i] = elem; // Add element to the index
        len++; // Increment size


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
        Array<Integer> ar = new Array<>(0);

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.display(); // [1,2,3,4]
        ar.remove(3);
        ar.display(); // [1,2,4]
        ar.insert(2, 100);
        ar.display(); // [1,2,100,4]
        ar.remove(100);
        ar.display(); // [1,2,4]

    }   
}