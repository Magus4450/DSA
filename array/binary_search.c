#include<stdio.h>

int binarySearch (int arr[], int size, int value){
    int low = 0;
    int mid;
    int high = size - 1;

    while(low <= high){
        mid = (low + high) / 2;
        if (arr[mid] == value){
            return mid;
        } else if (arr[mid] < value){
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;

}

void main(){
    int arr[10] = {1, 2, 6, 7 ,8 ,9, 10, 12 ,14, 16};
    int value = 10;
    printf("%d\n", binarySearch(arr, 10, value));
}
