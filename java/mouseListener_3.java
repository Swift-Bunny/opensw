/* 내부클래스로 버튼이벤트 구현 */

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {
	
	JPanel main_panel; // 버튼을 붙여질 메인 패널 선언

	JButton bt_test;
	
	public Test() {
		setTitle("JButton 마우스 이벤트처리"); // 프레임 타이틀바 텍스트 지정
		setSize(400,200); // 프레임 크기 조정(픽셀)
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); // 패널 객체화 / 기본배치관리자 FlowLayout
		
		bt_test = new JButton("누르시오");
		bt_test.setPreferredSize(new Dimension(100,50));
		
		// 익명(=무명)클래스로 버튼 이벤트를 추가해준다
		bt_test.addMouseListener(new MouseAction());
		
		main_panel.add(bt_test); // 패널에 버튼을 붙여준다
		
		add(main_panel); // 메인 프레임에 메인패널을 붙여주는 작업
		
		setVisible(true); // 프레임 보이게 하기
	}
	
	class MouseAction implements MouseListener {
		@Override // 버튼이 클릭됬을때 해당 메소드 작동
		public void mouseClicked(MouseEvent arg0) {
			System.out.println("클릭");
		}

		@Override // 마우스 커서가 버튼 범위내로 들어왔을때 해당 메소드 실행
		public void mouseEntered(MouseEvent arg0) {
			System.out.println("엔터");
		}

		@Override // 마우스 커서가 버튼 범위를 벗어낫을때 해당 메소드 실행
		public void mouseExited(MouseEvent arg0) {
			System.out.println("익시트");
		}

		@Override // 마우스로 버튼을 클릭하는 순간에 해당 메소드 실행
		public void mousePressed(MouseEvent arg0) {
			System.out.println("프레스");
		}

		@Override // 마우스로 눌렸던 것을 도로 땠을때 해당 메소드 실행
		public void mouseReleased(MouseEvent arg0) {
			System.out.println("릴리즈");
		}
	}
	
	public static void main(String[] args) {
		new Test();
	}
}