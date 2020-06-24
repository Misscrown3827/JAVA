package dynamic_beat_2;

public class Main {
	
	// Public static : 모든 프로젝트 내에서 공유할수 있는 변수
	// final : 한번 선언 후 절대 변하지 않는 상수(전부 대문자로 정의)
	// SCREEN_WIDTH : 우리가 만들 게임에 너비
	// SCREEN_HEIGHT : 우리가 만들 게임에 높이   // 해상도 : 1920x1080
	public static final int SCREEN_WIDTH = 1920;
	public static final int SCREEN_HEIGHT = 1080;
	
	public static void main(String[] args) {
		
		new DynamicBeat();
		
	}

}
