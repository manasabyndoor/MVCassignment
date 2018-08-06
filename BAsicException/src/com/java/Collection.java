package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection {
	public static void main(String args[]) {
		
		ArrayList<Car> list = new ArrayList<Car>();
		ArrayList<Laptop> list1 = new ArrayList<Laptop>();
		LinkedList<School> list2 = new LinkedList<School>();
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		// adding objects to Hashmap
		map1.put(1, "Sandeeepan");
		map1.put(2, "HMMS");
		map1.put(3, "St.pius");
		Set<Entry<Integer, String>> set1 = map1.entrySet();
		set1.stream().forEach((e) -> System.out.println(e.getKey() + " " + e.getValue()));

		Car car1 = new Car("maruti", 1234, 4676, "adv");
		Car car2 = new Car("Figo", 300000, 19990, "Maruti");
		Car car3 = new Car("Figo", 300000, 19990, "Mercedes");

		// passing instances of cars as parameters for list
		list.add(car1);
		list.add(car2);
		list.add(car3);

		// creating instances of laptop
		Laptop laptop1 = new Laptop("dell", "dell", "windows", "i5");
		Laptop laptop2 = new Laptop("Lenovo", "Lenovo", "Windows", "i3");
		Laptop laptop3 = new Laptop("hp", "hp", "Windows", "i5");

		// passing instances of laptop as parameters
		list1.add(laptop1);
		list1.add(laptop2);
		list1.add(laptop3);

		// creating instances of school
		School school1 = new School("Sandeepan", "Karnataka", "Karnataka", "first");
		School school2 = new School("Viveka", "Karnataka", "Karnataka", "second");
		School school3 = new School("MHPS", "Karnataka", "Karnataka", "third");
		School schoolnew = new School("xyz", "fgg", "fds", "fs");

		list2.add(school1);
		list2.add(school2);
		list2.add(school3);
		

		Iterator<Car> it = list.iterator();

		while (it.hasNext()) {
			Car car = it.next();
			System.out.println(car.name);
			System.out.println(car.price);
			System.out.println(car.model);
			System.out.println(car.feature);

		}
		//printing the values of list
		Iterator<Laptop> it1 = list1.iterator();

		while (it1.hasNext()) {

			Laptop laptop = it1.next();
			System.out.println(laptop.company);
			System.out.println(laptop.model);
			System.out.println(laptop.operatingsys);
			System.out.println(laptop.processor);

		}

		Iterator<School> it2 = list2.iterator();
		while (it2.hasNext()) {
			School school = it2.next();
			System.out.println("name=" + school.name);
			System.out.println("district=" + school.district);
			System.out.println("city=" + school.city);
			System.out.println("ranking=" + school.ranking);

		}
		
		

	}

}
