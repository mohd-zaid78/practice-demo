package interview_prep;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CheckaVariableAccesibility {
	static int i = 34;
	static int j = 90;
	static CheckaVariableAccesibility n;

	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the string");
			
			String st=scanner.nextLine();
			char[] vowels={'a','e','i','o','u'};
			int arr[]=new int[256];
			int length=st.length();
			for (int i=0;i<length ; i++) {
				arr[(int)st.charAt(i)]++;
				
			}
			for (int i=0;i<arr.length ;i++ ) {
				int j=0;
				if((arr[i])!=0&&(char)i==vowels[j]){
					System.out.println((char)i+" is comes in string: "+arr[i]+"times");
					j++;
				}
				
			}


	}

}
