package oop.quiz03;

public class Car {
	
    private String model;
	private int speed;
	private char mode;
	private boolean start;
	
	public void setModel(String model) {
		this.model = model;
		System.out.println("*** " + this.model + "의 운행을 시작합니다. ***\n");
	}
	
	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public void setSpeed(int speed) {
//		System.out.println("mode: " + this.mode);
		if(mode == 'D') {
			this.speed = speed;
		} else if(mode != 'R') {		
			System.out.println("속도를 지정할 수 없습니다.");
		} else {
			if(mode == 'R' && speed > 40) {
				System.out.println("R모드는 속도를 40 초과해서 지정할 수 없습니다.");
			} else if(speed < 0 || speed > 200){
				System.out.println("속도는 0 미만, 200 이상일 수 없습니다.");
			}
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	
	
	public void setMode(char mode) {
		if(mode != '0') {
//			System.out.println("기어를 " + mode + "단으로 변경합니다.");
			this.mode = mode;
		} else {
			this.mode = 'P'; 
		}
	}
	
	public char getMode() {
		return this.mode;
	}
	
	
	
	
	
	
	void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		this.injectOil();
		this.injectGasoline();
		this.start = true;
		this.moveCylinder();
		System.out.println("시동이 걸렸습니다.");
		
	}
	
	
	private void injectGasoline() {
		System.out.println("연료에 엔진이 주입됩니다.");
	}
	
	
	
	private void injectOil() {
		System.out.println("엔진오일이 순환합니다.");
	}
	
	
	private void moveCylinder() {
		if(start) {
			System.out.println("실린더가 움직입니다.");
		} else {
			System.out.println("실린더가 움직이지 않습니다.");
		}
	}
	
	
	void engineStop() {
		if(speed > 0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		} else {
			if(mode != 'P') {
				System.out.println("P 모드로 먼저 변속기를 변경하세요.");
				return;
			} else {
				start = true;
				System.out.println("시동이 꺼졌습니다.");
			}
		}
	}
	
	

	
	
	
	
	
	
}
