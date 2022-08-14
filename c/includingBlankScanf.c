#include <stdio.h>

int main() {
	char str[100];
	scanf("%[^\n]s", str); 
// 위 문장처럼 추가로 [^\n] 붙여주면 다음줄이 되기전까지 값을 입력받을수 있습니다
	printf("%s\n", str);
}