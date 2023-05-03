package org.com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayDay7 {
	
public static void main(String[] args) {
	
	//small to big ---upcasting
	//Get the each index value of 10 present in below list 
	// Input:   List = 10,20,30,90,10,10,40,50,10
    List <Integer> li=new ArrayList<Integer>();
	
	li.add(10);               //0
	li.add(20);               //1
	li.add(30);               //2
	li.add(90);               //3
	li.add(10);               //4
	li.add(10);               //5
	li.add(40);               //6
	li.add(50);               //7
	li.add(10);               //8

	int size = li.size();
	System.out.println(size);
	
	 ListIterator<Integer> listIterator2 = li.listIterator();
	 
	 
	
    for (int j = 0; j < li.size(); j++) {
		
    	ListIterator<Integer> listIterator = li.listIterator(5);
    	
    	System.out.println(listIterator);
	}
	
	
}
}
