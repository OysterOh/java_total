package oop.encap.bad;
/**
 * 230306 은닉
 */
public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		my.year = 2000;
		my.month = 11;
		my.day = 9;
		
		my.birthInfo();
		
		
	}

}
