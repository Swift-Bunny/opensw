#include <stdio.h>

int main() {
    int num = 10;
    int *pNum = &num;
    int **dpNum = &pNum;
    int ***tpNum = &dpNum;
    
    *pNum = *pNum + 1;
    printf("%d\n", num);
    
    **dpNum = **dpNum + 1;
    printf("%d\n", num);
    
    ***tpNum = ***tpNum + 1;
    printf("%d\n", num);
    return 0;
}