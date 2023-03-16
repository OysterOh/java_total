package quiz03;

public class MainClass {

	public static void main(String[] args) {

		int money = 2100;
		MyCart m = new MyCart(money);

		m.buy(new Tv());  //600
		m.buy(new Radio());  //500
		m.buy(new Computer());  //1000

	}

}
