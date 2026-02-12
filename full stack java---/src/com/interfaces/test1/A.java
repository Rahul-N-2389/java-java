package com.interfaces.test1;

 interface A {
	static void getData() {
		System.out.println("this is interface A");
	}
	

}
interface B{
	
	  static void getData() {
		System.out.println(" this is interface B");
	}
		
}
 class C implements A,B{
	 public void getData() {
		 System.out.println(" this class C");
		 
	 }
}
 
 class Z {
	 public static void main(String[] args) {
		C c = new C();
		c.getData();
		B.getData();
		A.getData();
	}
 }
