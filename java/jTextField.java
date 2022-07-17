package test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame {
	
	JPanel main_panel; // 버튼을 붙여질 메인 패널 선원
	
	JTextField tf_test1, tf_test2;
	
	public Test() {
		setTitle("JTextField 예제"); // 프레임 타이틀바 텍스트 지정
		setSize(300,160); // 프레임 크기 조정(픽셀)
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); // 패널 객체화 / 기본배치관리자 FlowLayout
		
		tf_test1 = new JTextField(15); // 매개변수15는 텍스트필드의 길이를 지정
		
		// 길이 매개변수 앞에 String형 데이터를 매개변수로 넣어주면 텍스트필드에 해당 텍스트가 미리 출력된다.
		tf_test2 = new JTextField("미리 텍스트 설정가능", 15); 
		
		// tf_test2텍스트 필드내에 입력되는 모든 텍스트들은 중앙정렬
		tf_test2.setHorizontalAlignment(JTextField.CENTER);
		
		main_panel.add(tf_test1); // 메인 패널에 텍스트필드1 붙이기
		main_panel.add(tf_test2); // 메인 패널에 텍스트필드2 붙이기
		
		add(main_panel); // 메인 프레임에 메인패널을 붙여주는 작업
		
		setVisible(true); // 프레임 보이게 하기
	}
	
	public static void main(String[] args) {
		new Test();
	}
}