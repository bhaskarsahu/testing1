package org.sahu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;
//
abstract class A {
	static private void show() {
		System.out.println("dom...");
	}

	public static void main(String[] args) {
		show();
	}

	public void demo() {
		show();
	}
}

class B {
	private void hello() {
		System.out.println("::::::::::;;;");
	}
}

public class Client1 extends A {
	private void hello() {
		System.out.println("::::::::::;;;");
	}

	public static void main(String args[]) {
		// A.main(null);
		A a1 = new Client1();
		a1.demo();

		Client1 aa = new Client1();

		aa.hello();

		Map<String, String> map = new HashMap<>();
		map.put("dd", "asdf");
		map.put("d1", "asdf");
		map.put("d2", "asdf");
		map.put("d3", "asdf");
		Set ss = map.keySet();
		System.out.println(ss);
		String s1 = new String("abc");
		String s2 = s1.intern(); // SCP object reference
		System.out.println(s1 == s2); // false
		String s3 = "abc";
		System.out.println(s2 == s3); // True s3 reference to SCP object here
		String s4 = new String("abc");
		String s5 = s1.intern();
		System.out.println(s1 == s4);
		System.out.println(s4 == s5);
		System.out.println(s2 == s5);
		String s6 = s3.intern();
		System.out.println(s3 == s6);
	}

}
