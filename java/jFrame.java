import javax.swing.JFrame; // JFrame클래스 사용

public class Ex_1 extends JFrame{ // JFrame상속받은 메인 클래스
	
	public Temp() { // Temp클래스의 디폴트생성자
		setTitle("프레임출력"); // 프레임의 타이틀명 지정
		setSize(300,300); // 프레임의 사이즈(=단위는 픽셀)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X번튼의 기능서술
		
		setVisible(true); // 프레임 보이게하기
	}
	
	public static void main(String[] args) { // 메인메소드
		new Ex_1(); // Temp클래스 인스턴스화
	}
}