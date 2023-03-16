package oop.poly.car;
/** 
230307 
 */
public class Driver {

	public void drive(Car c) {
		System.out.println("운전을 시작합니다.");
		c.run();
	}
	
//	public void drive(Tesla t) {
//		System.out.println("운전을 시작합니다.");
//		t.run();
//	}
	
	public Car buyCar(String name){
		if(name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata();
		} else if(name.equals("포르쉐")) {
			System.out.println("포르쉐를 구입합니다.");
			return new Porsche();
		} else if(name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다.");
			return new Tesla();
		} else {
			System.out.println("뭐");
			return null;
		}
	}
	
}
