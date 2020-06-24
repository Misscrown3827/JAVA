package dynamic_beat_2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	// 쓰레드 : 하나의 프로그램 안에 작은 프로그램
	
	// MP3에 대한 설정
	private Player player; // player : java zoom 사이트에 있던 라이브러리 중 하나
	private boolean isLoop; // 현재 곡이 무한루프 인지 아닌지에 대한 설정
	private File file; // 파일 가져오기
	private FileInputStream fis; // 파일에 입력
	private BufferedInputStream bis; // 파일에 저장
	
	// 곡이름, 해당 곡에 무한루프 여부
	public Music(String name, boolean isLoop) {
		// 예외 처리 
		try {
			this.isLoop = isLoop; // isLoop에 변수 초기화
			file = new File(Main.class.getResource("../music/" + name).toURI()); // 파일 가져오기
			fis = new FileInputStream(file); // 파일 입력
			bis = new BufferedInputStream(fis); // 파일 저장하고 읽어온다.
			player = new Player(bis); // player에 해당 파일을 저장
		// try 문에서 오류가 발생시 catch 문을 실행	
			} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// 현재 음악이 실행되는 계산
	public int getTime() {
		if (player == null)
			return 0; // 현재 음악이 어떤 위치에 하는지 알려준다.
		
		return player.getPosition(); // 노트가 떨어지는 시간을 계산
	}
	
	// 음악이 언제 실행되던 종료를 시킬 수 있다.
	public void close() {
		isLoop = false;
		player.close();
		this.interrupt(); // 쓰레드를 종료시킨다.(곡을 실행시키는 작은 프로그램을 종료시킨다.)
	}
	
	@Override   // 쓰레드를 상속받은 경우 무조건 써야하는 함수
	public void run() {
		// 곡 실행
		try {
			do {
				player.play();
				fis = new FileInputStream(file); // 파일 입력
				bis = new BufferedInputStream(fis); // 파일 저장하고 읽어온다.
				player = new Player(bis); // player에 해당 파일을 저장
				
			} while (isLoop); // isLoop가 true값이라면 무한루프를 실행시킨다.
			}
	// 오류 메세지 출력
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
	}

}
