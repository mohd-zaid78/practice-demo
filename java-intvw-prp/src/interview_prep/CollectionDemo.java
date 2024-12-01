package interview_prep;

import java.util.Comparator;

public class CollectionDemo implements  Comparable<CollectionDemo>{
	
	int i;
	String name;
	Integer j=12;
	Integer j1=23;
	public CollectionDemo(int i, String name) {
		this.i = i;
		this.name = name;
	}
	public CollectionDemo() {
		
	}
	
	public int compareTo(CollectionDemo o) {
		CollectionDemo sub=(CollectionDemo)o;
		return (this.i-sub.i);
		
	}
	
	@Override
	public String toString(){
		return name+" "+i;
	}
	
	@Override
	public int hashCode(){
		return this.i;
		
	}
	
	@Override
	public boolean equals(Object o){
		return this.hashCode()==o.hashCode();
	}
//	@Override
//	public int compare(Object o1, Object o2) {
//		CollectionDemo n=(CollectionDemo)o1;
//		CollectionDemo n1=(CollectionDemo)o2;
//		return n.i-n1.i;
//	}
//	
	
	

}
