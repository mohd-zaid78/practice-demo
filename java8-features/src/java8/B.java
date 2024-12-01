package java8;
@FunctionalInterface
public interface B {
	public default void defMethodDemo(){
		System.out.println("its a default method define in B interface");
	}
	
	void c();

}
