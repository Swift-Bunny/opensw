#include <stdio.h>

// 이진검색 함수
int BinarySearch(int *data, int low, int high, int key) {
	int middle=0;
	if (low > high) return -1;
	middle = (low + high) / 2;
	if(key == data[middle-1]) return middle;
	if(key < data[middle-1]) return BinarySearch(data, low, middle-1, key);
	else return BinarySearch(data, middle+1, high, key);
}

// 버블정렬 함수
void bubbleSort(int *sn, int*ss, int len) {
	int k, z;
	for(k=len-1; k >= 0; k--) {
		for(z=0; z < k; z++) {
			if(ss[z] > ss[z+1]) {
				int temp = ss[z];
				ss[z] = ss[z+1];
				ss[z+1] = temp;

				temp = sn[z];
				sn[z] = sn[z+1];
				sn[z+1] = temp;
			}
		}
	}
}

int main() {
	int result, KEY, k;
	int studentNum[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
		studentScore[] = { 75, 68, 15, 27, 45, 78, 87, 95, 39, 55 };

	bubbleSort(studentNum, studentScore, 10);

	printf("#StudentNumber# ");
	for(k=0; k < 10; k++) printf("%2d  ", studentNum[k]);
	printf("\n#StudentScore # ");
	for(k=0; k < 10; k++) printf("%2d  ", studentScore[k]); puts("\n");

	while(1) {
		printf("Search student's score: ");
		scanf("%d", &KEY);
		if(KEY == -1) return 0;

		result = BinarySearch(studentScore, 1, 10, KEY);
		if(result == -1) printf("Couldn't not found!!\n\n");
		else printf("Number: %d, Score: %d\n\n", studentNum[result-1], studentScore[result-1]);

	}
}