package org.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Company {

	//2D without header
	public static void main(String[] args) {
		
		List<ArrayList<String>> l = new LinkedList<ArrayList<String>>();
		
		//inner list
		
		ArrayList<String> a1 = new ArrayList<String> ();
		a1.add("harry");
		a1.add("harry@gmail.com");
		a1.add("java");
		
		ArrayList<String> a2 = new ArrayList<String> ();
		a2.add("potter");
		a2.add("potter@gmail.com");
		a2.add("selenium");
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("raja");
		a3.add("raj@gmail.com");
		a3.add("cucumber");
		
		//adding to outer list
		
		l.add(a1);
		l.add(a2);
		l.add(a3);
		
		ArrayList<String> all = l.get(2);
		String string = all.get(2);
	System.out.println(string);
	}
}
