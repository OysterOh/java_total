package oop.poly.player;
/**
 * 230306
 */
public class Hunter extends Player{


	String pet;
	
	Hunter(String name){
		super(name);
		this.pet = "물고기";
	}
	@Override
	void characterInfo() {
		// TODO Auto-generated method stub
		super.characterInfo();
		
		System.out.println("#펫: " + pet);
	}
	
}
