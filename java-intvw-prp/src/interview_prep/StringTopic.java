package interview_prep;

public class StringTopic {

	public static void main(String[] args) {
	//Example on String class
		String name1="zaid";
		String name2="zaid";
		name1.concat("gaur"); //here name1 is not modify concat create new object and store it
		System.out.println(name1);
		System.out.println(name2);
		String name3=name2.concat(" akhlaq"); //store that object in new refrence and print 
		System.out.println(name1);   //it means string is an immutable class.
		System.out.println(name2);
		System.out.println(name3);
	//Example on StringBuilder class
		StringBuilder sbd1=new StringBuilder("Ayan");
		sbd1.append(" Akhlaq");//here it modify same obejct value means its mutable.
		System.out.println(sbd1);
	//Example on StringBuffer class
		StringBuffer sbf=new StringBuffer("Aleem");
		sbf.append("Gaur");  //here same object modify by appand method and also thread safe
		System.out.println(sbf);
		
		
		

	}

}
