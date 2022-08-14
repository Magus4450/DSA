#include<stdio.h>

void main(){
    int val;
    int* adr;

    val = 10;
    adr = &val;

    printf("The value of variable var is %d\n", val);
    printf("The value of variable var is %d\n", *adr);

    printf("The memory address of variable var is %d\n", &val);
    printf("The memory address of variable var is %d\n", adr);
}