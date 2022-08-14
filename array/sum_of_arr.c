#include<stdio.h>
int sumArray(int arr[], int size){

    int sum;
    for (int i = 0; i < size; i ++){
        sum += arr[i];
    }
    return sum;
}

void main(){
    int arr[5] = {1,2,3,4,5};

    printf("%d\n", sumArray(arr, 5));

}