package SimpleSort;

/*
There are n items in array with index 0 to n - 1
Compare two elements one at a time
First compare starting from left, from index 0
Compare first two elements, 0 and 1
If the element to the left is greater, swap them and move one step right
Compare index 0 and 1, if 0 is greater, swap, then move on to index 1 and 2
By first iteration through array, the highest value will have bubbled out to the last
The comparison will happen for n-1 times and swap will happen in range of 0 to n-1 times
Next iteration we will only loop for n-2 times, because the last element is already in place.
*/


public class BubbleSort{
    
    private int[] arr;
    private int len = 0;

    public BubbleSort(int capacity){
        arr = new int[capacity];
    }

    public int size(){
        return len;
    }

    public void add(int elem){
        arr[len] = elem;
        len++;
    }

    public void display(){ // Display the array
        System.out.print("[");
        for(int i = 0 ; i < size(); i++){
            if(i == size() - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]\n");
    }

    private void swap(int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    /*
    Time Complexity
    For 1st iteration: loop runs n-1 times
    For 2nd iteration: loop runs n-2 times 
    For n-1th iteration: loop runs n-n+1 times 
    So total iteration is: (n-1) + (n-2) + .. 1 = n*(n-1)/2

    The worst time complexity is N^2 ignoring constants

    */
    private void bubbleSort(){

        for(int j = size()-1; j > 0; j--){   // Loop for n-1 times
            for(int i = 0; i < j; i++){      // Iterate through the array excluding sorted elements in the back
                if(arr[i] > arr[i+1]){       // Compare and swap
                    swap(i, i+1);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        BubbleSort ar = new BubbleSort(100);
        ar.add(5);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        ar.add(1);
        ar.display();       //[5,4,3,2,1]
        ar.bubbleSort();
        ar.display();       //[1,2,3,4,5]
    }
}
