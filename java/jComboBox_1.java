package JavaPost;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {
	
	JPanel main_panel; // 버튼을 붙여질 메인 패널 선언

	JComboBox<String> cbb_fruit;
	
	JLabel lb_print;
	
	String Date[] =  { "사과", "바나나", "딸기", "귤" };
	
	public Test() {
		setTitle("JComboBox 구현(1)"); // 프레임 타이틀바 텍스트 지정
		setSize(400,200); // 프레임 크기 조정(픽셀)
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); // 패널 객체화
		main_panel.setLayout(null);
		
		cbb_fruit = new JComboBox(Date);
		
		lb_print = new JLabel("선택된 과일:  ");
		
		cbb_fruit.setBounds(10, 10, 70, 25);
		lb_print.setBounds(100, 7, 200, 35);
		
		main_panel.add(cbb_fruit);
		main_panel.add(lb_print);
		
		add(main_panel); // 메인 프레임에 메인패널을 붙여주는 작업
		
		cbb_fruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fruit = cbb_fruit.getSelectedItem().toString();
				lb_print.setText("선택된 과일:  " + fruit);
			}
		});
		
		setVisible(true); // 프레임 보이게 하기
	}
	
	public static void main(String[] args) {
		new Test();
	}
}