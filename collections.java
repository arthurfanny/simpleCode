package collections;

import java.util.ArrayList
import java.util.List

public class MyArrayList{
	public static void main(String []args){
		List<String> var = new ArrayList<>();
		
		var.add("arthur");
		var.add("fanny");
		
		var.forEach(System.out::println);

}

//Hashmap implemention within the Collection Package
package com.arthur.java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapTester{
	public static void main(String []args){
		Map<String,String> map = new HashMap<> ();
		fillData(map);
		
	map.forEach((k,v) -> System.out.printf("%s %s%n", k, v));
	map.put("arthur","fanny");
	map.remove("arthur");

}

private static void fillData(Map<String, Srting> map){
		map.put("arthur","fanny");
		map.put("jason","stephen");
		map.put("git","hub"):
		map.remove("git");
}
}

public class ListExample{

	List<String> list = new arrayList<> ();
	list.add("arthur");
	list.add("fanny");
	list.add("jason");
	list.add("cool");
	for (Integer integer : list){
		System.out.println(integer);
	}
}

public class ListInteger{
	List<Integer> list = new ArrayList<> ();
	list.add(9);
	list.add(10);
	list.dad(332);
	Collection.sort(list);
	for( Integer integer: list){
		System.out.println(integer);
	}
}


