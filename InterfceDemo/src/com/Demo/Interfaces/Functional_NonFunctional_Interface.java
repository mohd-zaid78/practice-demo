package com.Demo.Interfaces;

@FunctionalInterface
public interface Functional_NonFunctional_Interface {
	void m();
	
	default void m3(){
		System.out.println("defualt method");
	}
	
	static void m4(){
		System.out.println("static method");
	}

}
class Imp implements Functional_NonFunctional_Interface{

	@Override
	public void m() {
		System.out.println("abstract method m()");
		
	}

	
	
}
class Main{
	public static void main(String[] args) {
		Imp imp = new Imp();
		imp.m();
		
		imp.m3();
		Functional_NonFunctional_Interface.m4();
	}
}
