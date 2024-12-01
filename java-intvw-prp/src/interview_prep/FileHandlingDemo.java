package interview_prep;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException  {
	  /*File file = new File("D:\\filehandling");
	  file.mkdir();
	  System.out.println("folder created");*/
//	  File file=new File("D:\\filehandling\\zaid.text");
//	  try {
//		file.createNewFile();
//		System.out.println("file created");
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//	  
//	  FileWriter fw=new FileWriter("D:\\filehandling\\zaid.text");
//	  fw.write("whats your name  ");
//	  fw.flush();
//	  System.out.println("writter");
//	  
//	  FileReader fr=new FileReader("D:\\filehandling\\zaid.text");
//	  int i;    
//      while((i=fr.read())!=-1)    
//      System.out.print((char)i);    
//      fr.close(); 
		
//	  File file=new File("D:\\ba");
//	  file.mkdir();
//	  //file.createNewFile();
//	  System.out.println("created fofdler");
	  
	  int [] arr=new int [4];
	  arr[0]=10;
	  arr[1]=10;
	  arr[2]=23;
	  arr[3]=new Integer(123);
	//  int q=(Integer)arr[0].intValue();
	//  int c=(Integer)arr[3].intValue();
	  
	  for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	  

	  Object [] arr1=new Object [3];
	  arr1[0]=new Integer(123);
	  arr1[1]=34;
	  arr1[2]=new String("zadc");
	  for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}
	  
	 Set<String> hs=new HashSet<String>();
	 hs.add("zaid");
	 hs.add("ssss");
	 hs.add("ahe");
	 hs.add("sjhc");
	 hs.add("zaid");
	 System.out.println(hs);
	  
	 Set<String> hs1=new HashSet<String>(hs);
	 System.out.println(hs1+" aasc");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
