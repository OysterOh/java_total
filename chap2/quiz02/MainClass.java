package chap2.quiz02;

public class MainClass {

	public static void main(String[] args) {

		Car c = new Car();
		c.setModel("c");
		c.setSpeed(20);
		c.engineStart();
//		c.injectGasoline();
//		c.injectOil();
//		c.moveCylinder();
		c.setMode('D');
		c.setSpeed(100);
		c.engineStop();
		c.setSpeed(0);
		c.setMode('P');
		c.engineStop();
		
	}

}
