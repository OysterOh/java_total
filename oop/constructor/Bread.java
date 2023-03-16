package oop.constructor;
/** 
230303 Bread
 */
public class Bread {

	String name;
	String ingredient;
	int price;
	
	Bread(){}
	
	Bread(String bName, String bIngredient, int bPrice){
			name = bName;			
			ingredient = bIngredient;
			price = bPrice;
	
		}
	
	
	void info() {
		System.out.println("**빵정보**");
		System.out.println("빵 이름: " + name);
		System.out.println("재료: " + ingredient);
		System.out.println("가격: " + price + "원");
	}
}
