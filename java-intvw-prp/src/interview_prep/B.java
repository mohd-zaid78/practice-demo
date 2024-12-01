package interview_prep;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class B extends A{
		public static void main(String[] args) {
			Set hashSet = new TreeSet();
			Set hashSet1 = new TreeSet();
			
			hashSet.add(10);
			hashSet.add(23);
			hashSet.add(13);
			hashSet.add(2);
			hashSet.add(4);
			hashSet.add(422);
//			System.out.println(hashSet);
//			System.out.println(hashSet1);
//			hashSet1.addAll(hashSet);
//			System.out.println(hashSet1);
//			hashSet1.removeAll(hashSet);
//			System.out.println(hashSet1);
//			hashSet1.addAll(hashSet);
//			System.out.println(hashSet1);
			hashSet1.add(2);
			hashSet1.add(22);
			hashSet1.add(222);
			hashSet1.add(234);
			hashSet1.add(21);
			
//			System.out.println(hashSet1);
//			hashSet1.retainAll(hashSet);
//			System.out.println(hashSet1);
//			
//			System.out.println(hashSet1.containsAll(hashSet));
//			Object[] array = hashSet1.toArray();
//			System.out.println(hashSet1);
//			for (int i = 0; i < array.length; i++) {
//				System.out.println(array[i]);
//			}
//			System.out.println(hashSet1);
//			System.out.println(hashSet1.isEmpty());
//			
			System.out.println(hashSet.equals(hashSet1));
			System.out.println(hashSet.hashCode());
			System.out.println(hashSet1.hashCode());
		}
	
	
}
