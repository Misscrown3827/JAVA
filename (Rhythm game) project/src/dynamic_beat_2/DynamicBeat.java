package dynamic_beat_2;

//�ڵ����� import �ϱ� : CTRL+SHIFT+O
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon; 
import javax.swing.JFrame;

       //�ϳ��� Ʋ		      //���       //�ؽ�Ʈ ���x,�׷��� ���o
public class DynamicBeat extends JFrame {
	
	private Image screenImage;
	private Graphics screenGraphic; // ��üȭ�鿡 �̹����� ��� ����
	private Image introBackground; // ������ �̹����� ���� �� �ִ� ��ü
			
			//������ : �ڽ��� Ŭ������ ���� �̸��� ���� �޼ҵ� 
			//���� �� ȭ�� ���� �� ����
	public DynamicBeat() {
		setTitle("Dynamic Beat"); // ����
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // ��ü ������ â(1920x1080)
		setResizable(false); // �Ժη� �ػ󵵸� �ٲ��� ����
		setLocationRelativeTo(null); // ���� â�� ��ǻ�� ���߾�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� â�� ���� ��, ���� ��ü�� ����(*�̰� ���� ���� �� â�� �����ص� ������ �۵� ��..)
		setVisible(true); // ������ ���������� ȭ�鿡 ��½�ŰŰ ����
		
		 introBackground = new ImageIcon(Main.class.getResource("../images/introbackground.jpg")).getImage();
		// introBackground(�̹����� ���� �� �ִ� ��ü)���ٰ� ������ �̹����� �ʰ��Ѵ�.(����)
		 
		 Music introMusic = new Music("introMusic.mp3", true); // ����ȭ�鿡�� ������ ���ѷ����� ���ư���.
		 introMusic.start(); // ���� ����
		// ----------------------------------------------------------------------------------------------------------------
	}
	
	// ��ü���� ȭ�� ����
	// ȭ���� �ҷ����� ����
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // �ػ� ũ�⿡ �̹����� ����� �� ��, �װ� screenImage�� �ְڴ�.
		screenGraphic = screenImage.getGraphics(); // screenImage�� �̿��ؼ� �׷��� ��ü�� ���´�.
		screenDraw(screenGraphic); // screenGraphic�� ������ �׷��ִ´�.
		g.drawImage(screenImage, 0, 0, null); // screenImage 0, 0�� ��ġ�� �׷��ش�.
	}
	
	// �̹����� �������� ����Ǵ� ����
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null); // ��ü �̹����� screenImage�� �׷��� �� �ְ� ���ش�.
		this.repaint();
		
	}

}
