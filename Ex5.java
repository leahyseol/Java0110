package com.exam;

public class Ex5 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	// 멀티 스레딩 적용방법 2가지
	//1.thread 클레스 이용
	//2.runnable 인터페이스 이용
	
	// Runnable 인터페이스를 구현한 클래스를
	// 익명 클래스로 정의하고
	// 기본생성자로 객체생성해서
	// 매개변수에 전달
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true)
					System.out.println("go");
		
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true)
					System.out.println("come");
			}
		});
		
		
		thread1.start();
		thread2.start();
		
				
	}

}
