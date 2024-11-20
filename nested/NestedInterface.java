package com.nested;

interface Test{
	interface Yes{
		void show();
	}
}

class Testing implements Test.Yes{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is nested Interface");
		
	}
	
}
// interface inside another interface is known as nestedinterface

public class NestedInterface {
    public static void main(String[] args) {
    	
    	Testing t=new Testing();
    	t.show();
    	
    	
           }
}
