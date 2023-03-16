package oop.quiz03;

public class MainClass {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.setModel("k5");
		c.setSpeed(50);
		c.engineStart();
		c.setMode('D');
		c.setSpeed(100);
		c.engineStop();
		c.setSpeed(0);
		c.setMode('P');
		c.engineStop();

	}

}
