package com.sortingNumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sort.CollectionsSort;

public class NumberData {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(728);
		list.add(879);
		list.add(675);
		list.add(37653);

		CollectionsSort.sortList(list);
		System.out.println(list);

		Set<Integer> set = new HashSet<Integer>();
		set.add(6536);
		set.add(354);
		set.add(5858);
		set.add(365);

		List<Integer> list1 = CollectionsSort.sortSet(set);
		System.out.println(list1);

	}
}
