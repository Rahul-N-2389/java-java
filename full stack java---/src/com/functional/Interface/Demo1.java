package com.functional.Interface;
import java.util.function.Consumer;

class Demo implements Consumer<String>{
	@Override
	public void accept(String str) {
		System.out.println(str);
	}
}


public class Demo1 {
	public static void main(String[] args) {
		Consumer<String> consumer = new Demo();
		consumer.accept("Robin hood");
	}

	}
