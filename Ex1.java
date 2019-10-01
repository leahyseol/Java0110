package com.exam;

class Go{
	void go(){
		while(true)
		System.out.println("go");
	}
}

class Come{
	void come(){
		while(true)
		System.out.println("come");
	}
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Go g = new Go();
		Come c = new Come();
		g.go();
		c.come();
	}//main method

}
