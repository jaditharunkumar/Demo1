package com.myfirstproject;

public class TestDemo {

	static int count = 0;

	TestDemo() {
		count++;
	}

	static void meth1() {
		System.out.println("meth1");
		TestDemo t = new TestDemo();
		t.meth2();

	}

	void meth2() {
		meth3();
		System.out.println("meth2");
	}

	static void meth3() {
		TestDemo t = new TestDemo();
		t.meth4();
		System.out.println("meth3");
	}

	void meth4() {
		meth5();
		System.out.println("meth4");
	}

	static void meth5() {
		TestDemo t = new TestDemo();
		t.meth6();
		System.out.println("meth5");
	}

	void meth6() {
		meth7();
		System.out.println("meth6");
	}

	static void meth7() {
		TestDemo t = new TestDemo();
		t.meth8();
		System.out.println("meth7");
	}

	void meth8() {
		meth9();
		System.out.println("meth8");

	}

	static void meth9() {
		TestDemo t = new TestDemo();
		t.meth10();
		System.out.println("meth9");

	}

	void meth10() {
		System.out.println("meth10");

	}

	public static void main(String[] args) {

		System.out.println("Main method Started");
		meth1();

		TestDemo obj1 = new TestDemo();
		TestDemo obj2 = new TestDemo();
		TestDemo obj3 = new TestDemo();
		TestDemo obj4 = new TestDemo();
		TestDemo obj5 = new TestDemo();

		System.out.println("Total objects created :" + count);

		System.out.println("Main method Ended");
		// TODO Auto-generated method stub

	}

}
