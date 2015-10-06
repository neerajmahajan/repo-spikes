package org.java7.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondOperatorInCollections {
public static void main(String[] args) {
	
	Map<String, List<String>> map = new HashMap<>();
	List<String> numbers = new ArrayList<>();		//Diamond Operator <>
	numbers.add("1");
	numbers.add("2");
	numbers.add("3");
	numbers.add("4");
	map.put("numbers", numbers);
	System.out.println(map);
}
}
