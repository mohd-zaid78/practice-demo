package interview_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*enum mai{Monday,chal,Wednesday,Thursday};*/
public class CollectionMain {
	//enum mai{Monday,Tuesday,Wednesday,Thursday};
	
	public static void main(String[] args) {
		
		
		/*mai ma=mai.chal;
	    switch(ma){
	    case Monday:System.out.println("monday");
	    break;
	    case chal:System.out.println("tuesday");
	    break;
	    case Thursday:System.out.println("thursday");
	    break;
	    default: System.out.println("hello");
	    }*/
		//Set<CollectionDemo> set=new TreeSet<CollectionDemo>(new CustomSortTreeSet());
		/*set.add("zaid");
		set.add("aleem");
		set.add("anas");
		set.add("ayan");
		set.add("zaid");
		System.out.println(set);
		CollectionDemo n=new CollectionDemo();
		System.out.println(n.j.compareTo(n.j1));*/
		
		/*set.add(new CollectionDemo(12,"zaid"));
		set.add(new CollectionDemo(15,"aleem"));
		set.add(new CollectionDemo(26,"sufiyan"));
		set.add(new CollectionDemo(21,"nasruddin"));
		set.add(new CollectionDemo(21,"nasruddin"));
		set.add(new CollectionDemo(122,"zaid"));*/
//		set.add(12);
//		set.add("zaid");
		/*System.out.println(set);
		System.out.println(new CollectionDemo(12,"zaid").hashCode());
		System.out.println(new CollectionDemo(12,"zaid").hashCode());
		System.out.println(new CollectionDemo(21,"nasruddin").hashCode());
		System.out.println(new CollectionDemo(212,"nasruddin").hashCode());
		System.out.println(new CollectionDemo(12,"zaid").equals(new CollectionDemo(12,"zaid")));
		System.out.println(new CollectionDemo(21,"nasruddin").equals(new CollectionDemo(21,"nasruddin")));
	*/	
		
		/*List set=new ArrayList();
		set.add("zaid");
		set.add("aleem");
		set.add(45);
		set.add(new CollectionDemo(23,"za"));*/
		//System.out.println(set);
//		
		//List hashSet = new ArrayList();
//		hashSet.add("aleem");
//		hashSet.add(set);
//		hashSet.add("a");
//		hashSet.add("l");
//		hashSet.add("e");
//		hashSet.add("m");
		List hashSet=Arrays.asList("ziad","aleem","aquib");
		Collections.sort(hashSet,Collections.reverseOrder());
		System.out.println(hashSet);
		hashSet.remove(1);
		System.out.println(hashSet.size());
		
		
		 
	
	}

}
