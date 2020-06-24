package dynamic_beat_2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	// ������ : �ϳ��� ���α׷� �ȿ� ���� ���α׷�
	
	// MP3�� ���� ����
	private Player player; // player : java zoom ����Ʈ�� �ִ� ���̺귯�� �� �ϳ�
	private boolean isLoop; // ���� ���� ���ѷ��� ���� �ƴ����� ���� ����
	private File file; // ���� ��������
	private FileInputStream fis; // ���Ͽ� �Է�
	private BufferedInputStream bis; // ���Ͽ� ����
	
	// ���̸�, �ش� � ���ѷ��� ����
	public Music(String name, boolean isLoop) {
		// ���� ó�� 
		try {
			this.isLoop = isLoop; // isLoop�� ���� �ʱ�ȭ
			file = new File(Main.class.getResource("../music/" + name).toURI()); // ���� ��������
			fis = new FileInputStream(file); // ���� �Է�
			bis = new BufferedInputStream(fis); // ���� �����ϰ� �о�´�.
			player = new Player(bis); // player�� �ش� ������ ����
		// try ������ ������ �߻��� catch ���� ����	
			} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// ���� ������ ����Ǵ� ���
	public int getTime() {
		if (player == null)
			return 0; // ���� ������ � ��ġ�� �ϴ��� �˷��ش�.
		
		return player.getPosition(); // ��Ʈ�� �������� �ð��� ���
	}
	
	// ������ ���� ����Ǵ� ���Ḧ ��ų �� �ִ�.
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt(); // �����带 �����Ų��.(���� �����Ű�� ���� ���α׷��� �����Ų��.)
	}
	
	@Override   // �����带 ��ӹ��� ��� ������ ����ϴ� �Լ�
	public void run() {
		// �� ����
		try {
			do {
				player.play();
				fis = new FileInputStream(file); // ���� �Է�
				bis = new BufferedInputStream(fis); // ���� �����ϰ� �о�´�.
				player = new Player(bis); // player�� �ش� ������ ����
				
			} while (isLoop); // isLoop�� true���̶�� ���ѷ����� �����Ų��.
			}
	// ���� �޼��� ���
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}
