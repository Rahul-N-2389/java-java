package com.functional.Interface;

import java.util.function.Supplier;

class Dem {
	private String Name, Desg;

	public Dem(String name, String desg) {
		super();
		Name = name;
		Desg = desg;
	}

	@Override
	public String toString() {
		return "Dem [Name=" + Name + ", Desg=" + Desg + "]";
	}

}

public class Demo3 {

	public static void main(String[] args) {

		Supplier<Dem> sup = new Supplier<Dem>() {

			@Override
			public Dem get() {
				return new Dem("Robin Hood", "Decoit");
			}
		};

		System.out.println(sup.get());
//		Supplier<String> sup = new Supplier<String>() {
//			
//			@Override
//			public String get() {
//				
//				return "Surya...";
//			}
//		};
//		System.out.println(sup.get());

	}

}
