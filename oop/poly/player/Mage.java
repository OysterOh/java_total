package oop.poly.player;
/**
 * 230306
 */
public class Mage extends Player{

	int mana;
	
	Mage(String name){
		super(name);
		this.mana = 50;
	}
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		
		System.out.println("#방어력: " + mana);
	}

	
}
