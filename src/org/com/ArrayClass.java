package org.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayClass implements ListIterator<Integer> {
	public static void main(String[] args) {

		// Replace the value 300 into 350 in the list
        // Input : List = 100,200,300,400,500,600,700

		List<Integer> l = new ArrayList<>();

		l.add(100);// 0
		l.add(200);// 1
		l.add(300);// 2
		l.add(400);// 3
		l.add(500);// 4
		l.add(600);// 5
		l.add(700);// 6
	

		System.out.println(l);

		ListIterator<Integer> lhy=new ArrayClass();
		
		
		
		
	
	}

	@Override
	public void add(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Integer previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(Integer arg0) {
		// TODO Auto-generated method stub
		
	}
}
