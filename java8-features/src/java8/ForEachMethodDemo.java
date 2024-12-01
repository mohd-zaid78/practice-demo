package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class ForEachMethodDemo {

	public static void main(String[] args) {
		List<String> list=(List) Arrays.asList("zaid,aleem,anas");
		
		/*for (String string : list) {   //printing the collection elements using the for each loop
			System.out.println(string);
			
		}
		
		Iterator<String> it=list.iterator();  //printing the collection elements using the iterator
		while(it.hasNext()){
			String string =(String)it.next();
			System.out.println(string);
		}
		
		Object[] array = list.toArray();       /printing the collection elements using the for  loop
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
*/		
		
//===================================printing collection object using the for each method==========================
//		Consumer<String> action=(i)->System.out.println(i);  //using the for each with lenegthy way
//		list.forEach(action);
	

//===================================using for each making the short way============================
//		list.forEach((i)->System.out.println(i));
		
		
//===================================printing using the method refrencing ======================================
		list.forEach(System.out::println);

	}


}
