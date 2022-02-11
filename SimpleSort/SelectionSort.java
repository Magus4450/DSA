package SimpleSort;

/*
First iterate through the array and find the smallest element
Swap the element with the first element
Again find the smallest element excluding the first sorted element and swap it with the second element
Repeat for n-1 times
Here after each iteration i = 0 to n-1, elements in array before and including index i is sorted. This is the loop invariant
*/


public class SelectionSort{
    
    private int[] arr;
    private int len = 0;

    public SelectionSort(int capacity){
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
    private void selectionSort(){

        for(int i = 0; i < size()-1; i++){
            int smallest = i;
            for(int j = i+1; j < size(); j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
                
            }
            swap(smallest,i);

        }
        
    }
    public static void main(String[] args) {
        SelectionSort ar = new SelectionSort(100);
        ar.add(5);
        ar.add(4);
        ar.add(3);
        ar.add(2);
        ar.add(1);
        ar.display();       //[5,4,3,2,1]
        ar.selectionSort();
        ar.display();       //[1,2,3,4,5]
    }
}
