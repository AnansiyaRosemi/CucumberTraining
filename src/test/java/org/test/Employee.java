package org.test;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		
		//1 d without header
		
		List<String> l = new ArrayList<String>();
		l.add("java");
		l.add("cucumber");
		l.add("python");
		l.add("selenium");
		l.add("php");
		
		System.out.println(l);
		System.out.println(l.get(4));
	
		
		
	}
}
