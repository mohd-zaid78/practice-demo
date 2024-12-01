package interview_prep;

import java.util.Comparator;

public class CustomSortTreeSet implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		CollectionDemo st1=(CollectionDemo)o1;
		CollectionDemo st2=(CollectionDemo)o2;
		return (st1.name.compareTo(st2.name));
		
	}
	
	

}
