package java8;

class ForRefrencemethod{
	 public  static  int addition(int num1,int num2){
		return(num1+num2);
	}
	public ForRefrencemethod(int a,int b){
		 System.out.println("conctructor refrence");
		 System.out.println(a+b);
	}
}
public class Java8Features {
	
	
	public static void main(String[] args) {
		/*A a=new A(){//anonymous class way
			public void m(){
				System.out.println("this response of m method is comes from the anonymous class");
			}

			@Override
			public void m1() {
				System.out.println("this is m1() method giving implementation by anonymous class ");
				
			}
		};*/
		
		/*A a =()->{ //lembda expression way
		System.out.println("m() implementation by lamda expression");
		};
		a.m();*/
//			A a = ForRefrencemethod::addition; 
//			System.out.println("m() implementation by  static method refrence");
//			System.out.println(a.add(10,6));
		
		A a = ForRefrencemethod::new; //constructor refrence way
		System.out.println("refrence comes from constructor of the class");
		a.add(10,6);
		
//		A a = new ForRefrencemethod()::addition; //method refrence way
//		System.out.println("refrence comes from constructor of the class");
//		a.add(10,6);
		
//			A a =(num1,num2)->{ lembda expression with parameter waye
//			System.out.println("m() implementation by lamda expression");
//			  return(num1+num2);
//			};
//			System.out.println(a.add(10,46));
		}
	}

	



