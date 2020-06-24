package dynamic_beat_2;

//자동으로 import 하기 : CTRL+SHIFT+O
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon; 
import javax.swing.JFrame;

       //하나의 틀		      //상속       //텍스트 기반x,그래픽 기반o
public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic; // 전체화면에 이미지를 담기 위함
	private Image introBackground; // 가져온 이미지를 담을 수 있는 객체
			
			//생성자 : 자신의 클래스와 같은 이름을 가진 메소드 
			//실행 및 화면 구현 및 종료
	public DynamicBeat() {
		setTitle("Dynamic Beat"); // 제목
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 전체 게임의 창(1920x1080)
		setResizable(false); // 함부로 해상도를 바꾸지 못함
		setLocationRelativeTo(null); // 게임 창이 컴퓨터 정중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 창을 종료 시, 게임 전체가 종료(*이걸 넣지 않을 시 창을 종료해도 게임이 작동 중..)
		setVisible(true); // 게임이 정상적으로 화면에 출력시키키 위함
		
		 introBackground = new ImageIcon(Main.class.getResource("../images/introbackground.jpg")).getImage();
		// introBackground(이미지를 담을 수 있는 객체)에다가 가져온 이미지를 초결한다.(결함)
		 
		 Music introMusic = new Music("introMusic.mp3", true); // 시작화면에서 음악이 무한루프로 돌아간다.
		 introMusic.start(); // 음악 시작
		// ----------------------------------------------------------------------------------------------------------------
	}
	
	// 전체적인 화면 개발
	// 화면을 불러오는 과정
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 해상도 크기에 이미지를 만들어 준 뒤, 그걸 screenImage에 넣겠다.
		screenGraphic = screenImage.getGraphics(); // screenImage를 이용해서 그래픽 객체를 얻어온다.
		screenDraw(screenGraphic); // screenGraphic에 뭔가를 그려넣는다.
		g.drawImage(screenImage, 0, 0, null); // screenImage 0, 0에 위치해 그려준다.
	}
	
	// 이미지를 가져오고 적용되는 과정
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null); // 전체 이미지를 screenImage에 그려줄 수 있게 해준다.
		this.repaint();
		
	}

}
