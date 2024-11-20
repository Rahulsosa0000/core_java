// iinner class can be declare an method of outer class 

package com.nested;

class outer{
	
	void outermethod() {
		int a=10;
		
		class inner{
			void innermethod() {
				System.out.println("a is:-"+a);
				
			}
		}
		inner in=new inner();
		in.innermethod();
		
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer out=new outer();
		out.outermethod();

	}

}
