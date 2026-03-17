package com.functional.Interface;

import java.util.function.Function;

class Dmo implements Function<String, Boolean> {
	public Boolean apply(String Name) {
		return Name.length() > 5;
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Function<String, Boolean> fun = new Dmo();
		System.out.println(fun.apply("hello My world"));
		System.out.println(fun.apply("world"));

//		Function<String, Boolean> fun = new Function<String,Boolean>() {
//			public Boolean apply(String Name) {
//				return Name.length() >5;
//			}
//			
//		};j
//		System.out.println(fun.apply("Robin Hood"));
//		System.out.println(fun.apply("Robin"));

	}

}
