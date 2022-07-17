import java.util.*; //java 폴더의 util폴더에 있는 모든 클래스 참조

public class Start { //자바 클래스명의 시작은 대문자로 시작하는 버릇을 들이자.
	public static void main(String[] args) {
		Start set = new Start(); //new연산자는 다른 메소드를 참조할때 각 메소드 리턴값을 메인메소드 에서 사용할수 있도록 만들어주는 역할을합니다.
		Scanner sc = new Scanner(System.in); //Scanner 클래스를 참조한다는 내용은 이미 위 import문에서 참조했기때문에  본격적으로 스캐너를 사용하기 위한 문장이다. 저는  객체변수를 sc로지정을 했습니다.
		
		System.out.println("성명입력 : ");
		String name = sc.nextLine(); //이름을 문자열형으로 입력받아 name변수에 저장한다.
		
		System.out.println("국어점수 입력 : ");
		int korean = sc.nextInt(); //국어점수는 정수형으로 입력받아 korean변수에 저장한다.
		System.out.println("영어점수 입력 : ");
		int english = sc.nextInt(); //영어점수는 정수형으로 입력받아 english변수에 저장한다.
		System.out.println("수학점수 입력 : ");
		int mathematics = sc.nextInt(); //수학점수는 정수형으로 입력받아 mathematics변수에 저장한다.
		
		boolean discriminate_result = set.discriminate(korean,english,mathematics);	 //discriminate메소드의 리턴값을 boolean형 discriminate_result변수에 저장
		System.out.println("\n올바른 입력범위 : "+discriminate_result); //true or false 출력
		
		int total_result = set.total(korean,english,mathematics); //total메소드의 리턴값을 정수형 total_result변수에 저장
		System.out.println(name+"님의 과목총합 : "+total_result); //과목 총합 출력
		
		double average_result = set.average(total_result); //average메소드의 리턴값을 실수형 average_result변수에 저장
		System.out.println("평균 : "+average_result); //평균 출력
		
		String rating_result = set.rating(average_result); //rating메소드의 리턴값을 문자열형 rating_result변수에 저장
		System.out.println("등급 : "+rating_result); //등급 출력
		
	}
	public boolean discriminate(int kor, int eng, int math) { //국어점수 영어점수 수학점수등을 매개변수로 같고와 그 값으로 값이범위에 벗어나지 않게 교정후 결과값은 true or false로 출력한다.
		Scanner sc = new Scanner(System.in); //이 메소드에서도 스캐너를 선언한 이유는 재입력 을 요구하기 위해 선언 합니다.
		
		boolean result=true; //result변수를 가지고 참 거짓을 판볋한다.
		int count=0; //단순한 번수 카운트 변수이다.
		
		do { //재입력 반복을 위해 선언.
			if(kor < 0 || kor > 100) { //kor이 0미만 100초과 일때 밑 문장을 실행하고 아닐시 조건문을 실행하지않는다.
				result = false;
				count++;
				System.out.println("※국어점수의 입력값의 범위이탈["+count+"]번");
				System.out.println("국어점수 재입력 : ");
				kor = sc.nextInt();
			}
			else if(kor >= 0 && kor <= 100) result = true; //kor이 0이상 100이하에 속하는 값일때 result에 true가 대입되고 반복문은 종료된다.
		} while(result == false); //result 값이 false일시 반복 true일시 빠져나옴
		count=0; //두번째 과목을 카운트해야하기 때문에 '0'으로 초기화하였다.
		do {  //재입력 반복을 위해 선언.
			if (eng < 0 || eng > 100) {  //eng이 0미만 100초과 일때 밑 문장을 실행하고 아닐시 조건문을 실행하지않는다.
				result = false;
				count++;
				System.out.println("※영어점수의 입력값의 범위이탈["+count+"]번");
				System.out.println("영어점수 입력 : ");
				eng = sc.nextInt();
			}
			else if (eng >= 0 && eng <= 100) result = true; //eng이 0이상 100이하에 속하는 값일때 result에 true가 대입되고 반복문은 종료된다.
		} while(result == false);  //result 값이 false일시 반복 true일시 빠져나옴
		count=0; //세번째 과목을 카운트해야하기 때문에 '0'으로 초기화하였다.
		do { //재입력 반복을 위해 선언.
		if (math < 0 || math > 100) { //math이 0미만 100초과 일때 밑 문장을 실행하고 아닐시 조건문을 실행하지않는다.
			result = false; 
			count++;
			System.out.println("※수학점수의 입력값의 범위이탈["+count+"]번");
			System.out.println("수학점수 입력 : ");
			math = sc.nextInt();
		}
		else if (math >= 0 && math <= 100) result = true;  //math이 0이상 100이하에 속하는 값일때 result에 true가 대입되고 반복문은 종료된다.
		} while(result == false); //result 값이 false일시 반복 true일시 빠져나옴
		
		return result; //리턴값을 주는 곳 까지 왔다는 예기는 reuslt변수값은 true일것이고 모든 과목의 입력 범위는 0이상 100이하이기 때문에 정확한 점수가 대입되었다는 얘기가 될것이다. 그러니 result를 리턴값으로 넘겨준다. 
	}
	public int total(int kor, int eng, int math) { //main메소드에서 국어,영어,수학 점수를 받아 매게변수에 저장한다음 그 값을 가지고 총합을 연산하게된다.
		int total_method = kor+eng+math; //국어,영어,수학점를 모두 더해 total_method변수에 저장한다.
		return total_method; //total_method변수내에는 세과목의 총합이 있기때문에 총합을 리턴값으로 넘겨준다.
	}
	public double average(int tot) { //main메소드에서 총점을 주어 현 메소드에서 tot로 매겨변수로 저장하고 tot를 / 3.0으로 나누어 평균을 구하게 해주는 메소드이다.
		double average_method = tot / 3.0; //tot를 3.0으로 나누어 평균을 구하여 그 값을 average_method변수에 실수형으로 넣어준다.
		return average_method; //위 과정에서 나온 평균값을 리턴값으로 넘겨준다.
	}
	public String rating(double avg) { //main메소드 에서 넘겨준 평균값을 avg매개변수에 저장하여 평균 값에 따른 등급을 밑 과정에서 따져준다.
		String rating_method = ""; //등급을 저장할 변수선언
		
		if(avg >= 90) rating_method = "수"; //avg가 90이상일때 rating_method에 "수"저장
		else if (avg >= 80) rating_method = "우"; //avg가 80이상일때 rating_method에 "우"저장
		else if (avg >= 70) rating_method = "미"; //avg가 70이상일때 rating_method에 "미"저장
		else if (avg >= 60) rating_method = "양"; //avg가 60이상일때 rating_method에 "양"저장
		else rating_method = "가"; //avg가 60미만일때 "가" 를 rating_method에 저장해준다.
		return rating_method; //위 과정에서 평균에 따른 등급을 가진 rating_method변수를 넘겨준다.
	}
}