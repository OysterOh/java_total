package chap2.quiz02;

public class Car {

	private String model;
	private int speed;
	private char mode;
	private boolean start;
	
	public void setModel(String model) {
		this.model = model;
		System.out.println(model + " 운행시작");
	}

	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}

	public void setSpeed(int speed) {
//		System.out.println("@@@@@@@@@@: " + speed);
//		System.out.println("@@@@@@@@@@: " + this.speed);
		
		this.speed = speed;  //
//		System.out.println("@@@@@@@@@@: " + speed);
//		System.out.println("@@@@@@@@@@: " + this.speed);
		
		if(this.mode == 'D') {
			if(this.speed<0 || this.speed>=200) {
				System.out.println("속도는 0 미만, 200 이상일 수 없습니다");
			}else {  //mode D에 0<speed<200
			System.out.println("현재 스피드: " + this.speed);
			}
		}else if(this.mode == 'R') {
			if(this.speed >40) {
				System.out.println("속도를 초과했습니다");
			}else {
				System.out.println("현재 속도: " + this.speed);
			}
			this.speed = speed;  //
		}else {
			System.out.println("속도를 지정할 수 없습니다.");
		}
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public String getModel() {
		return this.model;
	}


	public char getMode() {
		return this.mode;
	}

	public void setMode(char mode) {
//		if(mode == 'P') {
//			this.mode = mode;
//			System.out.println(this.mode + "모드");
//		} else {
//			this.mode = mode;
//			System.out.println(this.mode + "모드");
//		}
		
		switch (mode) {
		case 'D' : case 'R' : case 'N' : case 'P':
			this.mode = mode;
			break;
			
		default : this.mode = 'P';	
		}
	}
	 private void injectGasoline() {
		System.out.println("엔진에 연료가 주입됩니다.");
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

	public void engineStart() {
		System.out.println("시동버튼을 눌렀습니다.");
		injectOil();
		injectGasoline();
		this.start = true;
		moveCylinder();
		System.out.println("시동이 걸렸습니다.");
	}
	
	void engineStop() {
		 System.out.println("시동버튼을 눌렀습니다.");
		if(this.speed >0) {
			System.out.println("주행 중에는 시동을 끌 수 없습니다.");
			return;
		}else { //speed =0
			if(this.mode != 'P') {
				System.out.println("P모드로 먼저 변속기를 변경하세요");
				return;
			}else {  //mode = P
				start = false;
				System.out.println("시동이 꺼졌습니다.");
			}
		}
	}
	
	}

