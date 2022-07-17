import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {
	
	JPanel main_panel; // 버튼을 붙여질 메인 패널 선언

	JLabel lb_text1, lb_text2; // 라벨1,2 선언
	
	public Test() {
		setTitle("JLabel 예제"); // 프레임 타이틀바 텍스트 지정
		setSize(250,160); // 프레임 크기 조정(픽셀)
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); // 패널 객체화 / 기본배치관리자 FlowLayout

		lb_text1 = new JLabel("이번시간에는 JLabel클래스"); // 라벨 텍스트설정
		lb_text1.setOpaque(true); // 불투명도를 참으로 설정하여 배경색을 보이게 한다
		lb_text1.setBackground(Color.BLUE); // 라벨의 배경색 파란색으로 지정
		lb_text1.setForeground(Color.WHITE); // 글자색 하얀색으로 지정
		
		// html문법을 사용하여 \n으로도 안되는 개행을 가능하게 해줍니다.
		String strNextLine = "<html>JLabel도 <br/> 개행 가능합니다..!</html>";
		lb_text2 = new JLabel(strNextLine);
		
		main_panel.add(lb_text1); // 메인 패널에 텍스트필드1 붙이기
		main_panel.add(lb_text2); // 메인 패널에 텍스트필드2 붙이기
		
		add(main_panel); // 메인 프레임에 메인패널을 붙여주는 작업
		
		setVisible(true); // 프레임 보이게 하기
	}
	
	public static void main(String[] args) {
		new Test();
	}
}