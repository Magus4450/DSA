#include<stdio.h>

int sequentialSearch(int arr[], int size, int value)
{
    for(int i = 0; i < size; i++){
        if(value == arr[i]){
            return 1;
        }
    }
    return -1;
}

void main(){
    int arr[5] = {2,3,4,5,6};
    int val = 1;
    printf("%d\n", sequentialSearch(arr, 5, val));
}