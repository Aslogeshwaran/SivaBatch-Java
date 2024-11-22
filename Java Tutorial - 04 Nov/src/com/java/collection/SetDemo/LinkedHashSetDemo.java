package com.java.collection.SetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet set=new LinkedHashSet();
		
		set.add(23);
		
		set.add(34523);
		
		set.add(56723);
		
		set.add(287673);
		
		set.add(2793);
		
		set.add(null);
		
		set.add(2803);
		
		set.add(23423);
		
		set.add(233567);
		
		set.add(25463);
		
		set.add(22353);
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		set.remove(23);
		
		System.out.println(set);
		
		Iterator<Integer> i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
