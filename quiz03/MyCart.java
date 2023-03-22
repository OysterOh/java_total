package quiz03;

public class MyCart {

	private int money; //내가 가지고있는 돈
	private Product[] cart = new Product[1]; //상품을 저장할 배열.
	private int i = 0; //cart안에 있는 상품의 개수를 알려주는 변수.

	//객체 생성 시 money를 받아서 초기화.
	public MyCart(int money) {
		this.money = money;
	}
	public void buy(Product p){
		if(p.price > money) {
			System.out.println("금액부족");
			return;
		} else {
			money -= p.price;
			add(p);
		}
	}

	/*
    - public void buy(모든 상품을 전달할 수 있는 매개변수)

    - 가진 돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족"
     출력후 메서드 강제 종료.
    - 가진 돈이 충분하면 물건의 가격을 money에서 빼고 
      add(상품)메서드 호출.
	 */

	private void add(Product p) {

		if(i>=cart.length) {
			Product[] cart2 = new Product[cart.length*2];
			for(int j=0; j<i; j++) {
//				cart2 = cart;
				cart2[j] = cart[j];
//				cart = new Product[cart2.length];
			}
			cart = cart2;
		}
		cart[i] = p;
		i++;
		info();
//		
//		cart[i] = p;
//		if(i>=cart.length) {
//			Product[] temp = new Product[cart.length*2];
//			temp = cart;
//			cart = new Product[temp.length];
//			cart = temp;
//			i++;
//		}
//		info();
		
	}
	/*
    - private void add(모든 상품을 받을 수 있도록 선언)

    - 매개변수로 전달된 상품을 장바구니에 담는다.
     상품이 추가될 때 마다 i의 값을 하나씩 올린다.

    - 만약 i의 값이 장바구니의 크기보다 같거나 크다면
     기존의 장바구니보다 크기가 * 2 큰 배열을 생성.
     기존의 장바구니의 값을 새로운 배열에 복사.
     새로운 장바구니의 주소값을 기존의 장바구니와 바꿉니다.

    - 모든 로직이 완료되면 info() 메서드를 호출합니다.
	 */


	public void info() {
		int sum = 0;  //총 상품의 합계를 담아줄 변수
		for(int a=0; a<i; a++) {
				sum += cart[a].price;
				System.out.println("장바구니 안에 담긴 물건: " + cart[a].name);
		}
		//		System.out.println("장바구니 안에 담긴 물건: " + cart.toString()); //장바구니 안 물건의 목록
		System.out.println("물건들 가격의 합: " + sum + "원");
		System.out.println("남은 금액: " + this.money + "원");  //남은금액 = 내 돈 - 장바구니 안 물건의 가격
	}
	/*
    - public void info()

    - 장바구니 안에 담긴 물건의 목록(name)을 출력합니다.
    - 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력해야 합니다.
    - 남은 금액을 출력해야 합니다.

    - MyCart 선언이 완료되었다면 MainClass에서 buy메서드를 호출해 봅니다.
	 */


}



