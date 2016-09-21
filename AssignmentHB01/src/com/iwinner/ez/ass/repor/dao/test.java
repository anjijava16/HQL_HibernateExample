package com.iwinner.ez.ass.repor.dao;

import java.util.ArrayList;
import java.util.List;

public class test {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();
	list.add("aaa");
	list.add("baa");
	list.add("caa");
	list.add("daa");
	list.add("eaa");
	list.add("faa");
	
	System.out.println(list);//[aaa, baa, caa, daa, eaa, faa]
	
	for(String listOfString : list){
		
		System.out.println(listOfString);
	}
	
	
}
}

      