package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.java.CellPhone;
import com.java.Laptop;

public class Collection1 {
	public static void main(String args[]) {
		Set<String> set = new LinkedHashSet<>();

		//Its not taking objects. check once
		//set.add("manasa");
		set.add("asangi");
			set.add("nana");
			set.add("manasa");
		//set.add(new CellPhone("htc", "g+", "htc", "android", 15000));
		//set.add( new CellPhone("Oneplus", "oneplus6", "Improved version", "android", 19990));
		//set.add(new CellPhone("SAmsung", "j7", "ImprovedVersion", "Android", 300000));
			
			
			
			set.stream().forEach((set1) -> System.out.println(set1));
	}

}
