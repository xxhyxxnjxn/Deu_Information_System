package mainpackage;

import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PMainView extends JFrame implements View {
/*  학생 로그인 첫 화면 (기 분기점)*/
	private Container ct;
	private JButton LogOutBtn;
	private JLabel mainLabel;
	private JButton courseBtn;
	private JButton changePwBtn;
	
	
	public PMainView() {
		 initComps();
		 addComps();
		 initWindow();

	}
	
	
	public void initComps(){
		ct=getContentPane();
		ct.setLayout(null);
		LogOutBtn = new  JButton("되돌아가기");
		LogOutBtn.setBounds(6, 243, 117, 29);
		
		mainLabel = new JLabel("대학 정보 전산 시스템  (교수용)");
		mainLabel.setBounds(137, 6, 129, 16);
		
		courseBtn = new JButton("수강 관리 기능");
		courseBtn.setBounds(137, 68, 117, 50);
		
		changePwBtn = new JButton("계정 암호 변경");
		changePwBtn.setBounds(137, 148, 117, 50);

	}
	
	public void addComps() {
		ct.add(LogOutBtn);
		ct.add(mainLabel);		
		ct.add(courseBtn);
		ct.add(changePwBtn);



	}
	

	
	public void initWindow() { //  창초기화
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(510, 200, 400, 300);
		setTitle("교수 - 메인 메뉴");
		setVisible(true);

	}


	public JButton getLogOutBtn() {
		return LogOutBtn;
	}


	public void setLogOutBtn(JButton LogOutBtn) {
		this.LogOutBtn = LogOutBtn;
	}


	public JButton getCourseBtn() {
		return courseBtn;
	}


	public JButton getChangePwBtn() {
		return changePwBtn;
	}


	public void setChangePwBtn(JButton changePwBtn) {
		this.changePwBtn = changePwBtn;
	}


	@Override
	public void addListener(ActionListener e) {
		courseBtn.addActionListener(e);
		changePwBtn.addActionListener(e);
		LogOutBtn.addActionListener(e);
		
	}
}
