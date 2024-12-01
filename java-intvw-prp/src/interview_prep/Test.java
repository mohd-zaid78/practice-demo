package interview_prep;


public class Test {
	int i=10;  //here 10 stored in i inside memory
	int j=10;	//here 10 stored in j inside memory
	int k=12;
	String name1="zaid",name2="zaid",name3="zaid gaur";//here name1 and name2 both refer 1 zaid
	String ref1=new String("zaid");   //store in string non constant pool with own memory addres
	String ref2=new String("zaid");	  //store in string non constant pool with own memory addres
	String ref3=new String("zaidgaur");
	
	public static void main(String[] args) {
	Test test = new Test();
	System.out.println(test.i==test.j);//true bcs always == compares values for primitive types
	System.out.println(test.i==test.k);//false because value different
	
	System.out.println(test.name1==test.name2);//true,always for refrence types == operator 
	                                           //compares memory address not actual content
	System.out.println(test.name1==test.name3);//false due to different address
	
	System.out.println(test.ref1==test.ref2); //false due to different address
	System.out.println(test.ref1==test.ref3); //false due to different memory address
	
	/* always remember == operator if used within the primitive type values than it will 
	 * compare the actual content but if its used within the refrence type like String,Array
	 * then it will compares the memory addreses not an actual content
	 */
	
	
		
		
		
		

	}

}
