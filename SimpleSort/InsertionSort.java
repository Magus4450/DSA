package SimpleSort;

/*
For insertion sort, we consider one side of the array to be partially sorted.
The first element in an array is always partially sorted because it is the only element.
So we iterate from the 2nd element to the last element and insert that element in the partially sorted array.

[1,3,4,2,5]
Here, 1,3,4 is partially sorted, so we take the next element after the partially sorted array, 2, 
and insert it in its correct position


*/


public class InsertionSort{
    
    private int[] arr;
    private int len = 0;

    public InsertionSort(int capacity){
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

 
    /*
    Time Complexity
    For 1st iteration: it checks for 1 time
    For 2nd iteration: it checks for 2 time
    For n-1th iteration: it checks for n-1 time
    So total iteration is: 1 + 2 + .. + (n-1) = n*(n-1)/2

    The worst time complexity is N^2 ignoring constants

    It is faster than BubbleSort and SelectionSort because copying elements take less time than swapping.

    */
    private void insersionSort(){  

        for(int i = 1; i < size(); i++){
            int temp = arr[i];
            int j = i;
            while( j > 0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
            display();
        }
        
    }
    public static void main(String[] args) {
        InsertionSort ar = new InsertionSort(100);
        ar.add(5);
        ar.add(0);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        ar.add(1);
        ar.display();       //[5,4,3,2,1]
        ar.insersionSort();
        ar.display();       //[1,2,3,4,5]
    }
}
