package oop.poly.player;
/** 
230306 
 */

public class Warrior extends Player{
	int rage;

	Warrior(String name){
		//모든 생성자에는 super()가 내장되어 있다.
		//자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
		//부모의 속성과 기능이 실존하게 되고, 물려줄 수가 있기 때문이다.
		super(name);
		this.name = name;
		this.rage = 60;
	}
	
//	public void rush(Warrior w1) {
		
//		w1.hp -= 10;
//		System.out.printf("나의 체력: %d, 상대방 체력: %d\n", this.hp, w1.hp);
//	}
//	
//	public void rush(Mage m1) {
//		m1.hp -= 20;
//		System.out.printf("나의 체력: %d, 상대방 체력: %d\n", this.hp, m1.hp);
//	}
//	
//	public void rush(Hunter h1) {
//		h1.hp -= 15;
//		System.out.printf("나의 체력: %d, 상대방 체력: %d\n", this.hp, h1.hp);
//	}
//	
	
	public void rush(Player p) {
		/*
		 - 전사의 고유 기능인 rush 메서드를 작성합니다.
		 - rush의 대상은 모든 직업들이다.
		 - 만약 rush의 대상이 전사라면 10의 피해를 받고,
		   마법사라면 20의 피해, 사냥꾼이라면 15의 피해를 받는다.
		 - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용한다.
		 - 남은 체력도 출력한다.
		 - main에서 객체를 생성한 후 호출한다. 
		 */
		System.out.printf("%s(이)가 %s에게 돌진을 시전했다\n"
				, this.name, p.name);
		
		if(p instanceof Warrior) {
			p.hp -= 10;
			System.out.printf("%s(이)가 10의 피해를 입었다\n"
					, p.name);
		}else if(p instanceof Mage) {
			p.hp -= 20;
			System.out.printf("%s(이)가 20의 피해를 입었다\n"
					, p.name);
		}else if(p instanceof Hunter){
			p.hp -= 15;
			System.out.printf("%s(이)가 15의 피해를 입었다\n"
					, p.name);
		}
		
		System.out.printf("%s의 남은 체력: %d\n", p.name, p.hp);
		System.out.println("----------------------------");
		
		
	}
		
	
	@Override   //오버라이드 문법 맞는지 확인해주는 기능이 있는 주석 alt+shift+s
	//override/implement methods
	void characterInfo() {
		super.characterInfo();
		System.out.println("#분노: " + rage);
	}
	
}
