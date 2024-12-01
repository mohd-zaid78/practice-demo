package interview_prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ListInterfaceDemo {

	public static void main(String[] args) {
		/*Vector<String> v=new Vector<String>();
		v.add("z");
		v.add("a");
		v.add("a");
		v.add("ta");
		v.add("aqb");
		for (Object obj : v) {
			String s =(String)obj;
			System.out.println(s);
		}
		Vector<String> v1=new Vector<String>();
		v1.add("zaid");
		v1.add("aleem");
		v1.add("anas");
		v1.add("talib");
		v1.add("aquib");
		v1.add("aleem");*/
		//v1.set(3, "jahan");
		
//		System.out.println(v1.remove(2));
//		System.out.println("===================");
//		System.out.println(v1.get(2));
//		System.out.println("=-===============");
		
		/*for (String s : v1) {
			if(s.equals("aquib")){
				v1.remove(4);
			}
			System.out.println(s);
			
			
		}*/
	//	System.out.println(v1.get(8));
		
	//System.out.println("==============================stack====================");
	
//	Stack<String> s=new Stack<String>();
//	s.add("zaid");
//	s.add("aleem");
//	s.add("anas");
//	s.add("talib");
//	s.add("aquib");
//	s.addAll(2,v);
//	for (String obj : s) {
//		
//		System.out.println(obj);
//	}
		HashSet<String> al=new HashSet<String>();
		al.add("zaid");
		al.add("aleem");
		al.add("aquib");
		al.add("chak de phadde");
		al.add("chalo");
		
		TreeSet<String> treeSet = new TreeSet<String>(al);
		System.out.println(treeSet);
		
		//Collections.sort();
		
		/*ArrayList<String> al=new ArrayList<String>();
		al.add("zaid");
		al.add("aleem");
		al.add("aquib");
		al.add("chak de phadde");
		al.add("chalo");
		
		String[] array = al.toArray(new String[0]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		*/
		/*System.out.println("===============iterate using the for each loop===========");
		for (String string : al) {
			System.out.println(string);
		}
		System.out.println("===============iterate using the Iterator interface===========");
		Iterator<String> iterator = al.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			//iterator.remove();
			//System.out.println(al.size());
		}
		
		System.out.println("===============iterate using the ListIterator interface==========");
		ListIterator<String> lit = al.listIterator(al.size());
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
			lit.remove();
			System.out.println(al.size());
		}
*/
	}

}
