

#include<stdio.h>



void reverseArray(int *a, int n){
    int temp;
    for(int i=0; i < n; i++){
        temp = *(a+i);
        *(a+i) = *(a+n-1);
        *(a+n-1) = temp;
        n--;
    }
}
// 5 , 2
void rotateArray(int *a, int n, int k){
    reverseArray(a,k);
    reverseArray(&a[k],n-k);
    reverseArray(a,n);

    
}

void printArr(int arr[], int count){
    for (int i = 0 ; i < count; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");
}
void main(){
    int arr[5] = {1,2,3,4,5};
    printArr(arr, 5);
    rotateArray(arr, 5, 2);
    printArr(arr, 5);
    
}