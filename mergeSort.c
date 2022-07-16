#include <stdio.h>

void merge(int *A, int *B, int *C, int size) {
	int k, i=0, j=0;
    for(k=0; k < size; k++) {
		if(A[i] == 0) {
			C[k] = B[j]; j++;
		} else if(B[j] == 0) {
			C[k] = A[i]; i++;
		} else if(A[i] < B[j]) {
			C[k] = A[i]; i++;
		} else if(A[i] > B[j]) {
			C[k] = B[j]; j++;
		} else {
			C[k++] = A[i]; i++;
			C[k] = B[j]; j++;
		}
    }
}

int main() {
	int k, cnt=0;
    int a[10] = { 1, 3, 5, 6 },
		b[10] = { 2, 3, 5, 8, 9, 10, 12, 13 },
		c[20];
    
    printf("Array=A: ");
	for(k=0; a[k] != 0; k++) { printf("%d ", a[k]); cnt++; }
    puts("");

    printf("Array=B: ");
	for(k=0; b[k] != 0; k++) { printf("%d ", b[k]); cnt++; }
    puts("");

    merge(a, b, c, cnt);

    printf("Array=C: ");
    for(k=0; k < cnt; k++) printf("%d ", c[k]);
    puts("");

	return 0;
}