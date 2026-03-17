package com.constructor.Case1;


class FunB{

public FunB(){
System.out.println("hello world phase 1");
}
}
class FunC extends FunB {

public FunC(){
System.out.println("hello world phase 2");
}

}

class FunA extends FunC{
public static void main (String [] args){
FunC obj = new FunA();

}
}
