package com.java.collection.ListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> newList = new LinkedList<Integer>();

		newList.add(213);

		newList.add(243513);

		newList.add(213453);

		newList.add(345213);

		newList.add(2432513);

		newList.add(23613);

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(1);

		list.add(2);

		list.add(3);

		list.add(null);

		list.add(null);

		list.add(null);

		list.add(null);

		list.add(1);

		list.add(1);

		list.add(5);

		System.out.println(list);

		list.remove(6);

		System.out.println(list);

		System.out.println(list.size());

		System.out.println(list.get(3));

		list.addAll(6, newList);

		System.out.println(list);

		list.add(0, 100);

		System.out.println(list);

		Iterator<Integer> i = list.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("==============================");
		
		Iterator di = list.descendingIterator();
		
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
	}

}
