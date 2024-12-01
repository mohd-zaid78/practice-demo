package interview_prep;

class Demo12{
	int id ;
	String name;
public Demo12(int id ,String name){
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
	System.out.println("finalize execute to clean up the memory"); //getcalled by garbage collector;
}
}
public class FinalizeCheck {

	public static void main(String[] args) {
		System.out.println("program starts");
		Demo12 d1=new Demo12(101, "Dinga");
		Demo12 d2=new Demo12(102, "Zaid");
		
		//after crteate object of demo class we can use by calling the demo class property
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d1.toString());
		System.out.println("d1 object uses is done ");
		d1=null;
		d2=null;
	//System.out.println(d1.id); //null .id will throw you Null pointer exception
	System.gc();
	System.out.println("other some code has to be executed ");
		System.out.println("program ends ");
				
		
	}

}
