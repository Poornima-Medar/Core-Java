package com.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;

public class CollectionsSort {
	public static List<Integer> sortList(List<Integer> list) {
		Collections.sort(list);
		return list;
	}

	public static List<Integer> sortSet(Set<Integer> set) {
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		return list;
	}
}
