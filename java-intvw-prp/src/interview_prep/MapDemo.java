package interview_prep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String[]> m=new HashMap<Integer, String[]>();
		m.put(1,new String[]{"zaid","zaid","adil"});
		m.put(1, new String[]{"as","sss","s"});
//	System.out.println(m.get(1));
//	System.out.println(m.get(2));

	Map<Integer,String> m1=new TreeMap();
	m1.put(1,new String("zaid"));
	m1.put(2, "zaleem");
	m1.put(3, "aleem");
	m1.put(4, "aleem");
	m1.put(55, "aquib");
	Set<Entry<Integer,String>> keySet = m1.entrySet();
//	for (Entry integer : keySet) {
//		System.out.println(integer.getKey()+" "+integer.getValue());
//	}
//	
	System.out.println(keySet);

	}

}
