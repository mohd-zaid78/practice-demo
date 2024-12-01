package interview_prep;

class Demo13 implements Cloneable{
	int id ;
	String name;
public Demo13(int id ,String name){
	this.id=id;
	this.name=name;
	
}
@Override
public int hashCode() {
	   return id;
	}
@Override
public boolean equals(Object obj) {
	return this.hashCode()==obj.hashCode();
}
@Override
public String toString() {
	return name+" "+id;
}
@Override
protected void finalize() throws Throwable {
	System.out.println("finalize execute to clean up the memory");
	
}
@Override
protected Object clone() throws CloneNotSupportedException {
	System.out.println("obejct is being copied ");
	return super.clone();
}
}
public class CloneMethodDemo  {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("program starts");
		Demo13 d1=new Demo13(101, "Dinga");
		//after crteate object of demo class we can use by calling the demo class property
		Demo13 d2=(Demo13)d1.clone(); //here it stores in object class type refrence becuase 
		                       //object class return type is class obejct thats why we accept in this 
		                      /// but we can  make refernce of subclas bacuase we knbow object is subclass type 
//		Demo13 d2=(Demo13)obj;     // here we do downcasting or we can directly take in this like Demo d2 =(Demo)d1.clone()
		                       //but here we did like in we did for understanding..
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d2.name);
	    System.out.println(d2.id);
		System.out.println("program ends ");
				
		
	}

}
