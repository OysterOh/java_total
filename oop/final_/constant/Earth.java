package oop.final_.constant;
/** 
230308 
 */
public class Earth {

	/*
	 # 상수 (constant)
	 
	 - 상수는 고정된 불변의 값이다. 따라서 '어디에서 접근을 하더라도
	   같은 값'이 나와야 하며, 값의 변경 또한 불가능해야 한다.
	   
	 - 따라서 자바에서 상수 선언할 때 static, final 동시에 사용한다.  
	 */
	
	static final double RADIUS = 6400;  //지구 반지름
	
	static final double SURFACE_AREA;
	
	static {
		SURFACE_AREA = RADIUS * RADIUS * Math.PI * 4; //PI도 상수	
	}
}
