#include <stdio.h>

// Company 구조체 정의
struct Company {
	// 구조체 멤버들
	int sawonNum; // 사원번호가 저장될 멤버
	int birth; // 사원의 생년월일이 저장될 멤버
	char name[30]; // 사원의 이름이 저장될 멤버
	char address[60]; // 사원의 주소가 저장될 멤버
};

int main() {
	struct Company c; // 구조체 변수 선언

	// 자바와 동일하게 . 을 사용하여 멤버에 접근하여 값을 할당
	c.sawonNum = 10102; 
	c.birth = 20010810;
	// strcpy함수는 말그대로 문자열을 복사하는것이 때문에 c.name, address 에 대입
	strcpy(c.name, "성열암"); 
	strcpy(c.address, "대한민국");

	// 구조체에 접근하여 값을 출력
	printf("사원번호: %d\n", c.sawonNum);
	printf("생년월일: %d\n", c.birth);
	printf("이름: %s\n", c.name);
	printf("주소: %s\n\n", c.address);

	return 0;
}