import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 *  $URL$
 *  $Date$
 *  
 *  $Copyright-Start$
 *
 *  Copyright (c) 2022
 *  JDA Corporation
 *  All Rights Reserved
 *
 *  This software is furnished under a corporate license for use on a
 *  single computer system and can be copied (with inclusion of the
 *  above copyright) only for use on such a system.
 *
 *  The information in this document is subject to change without notice
 *  and should not be construed as a commitment by JDA Corporation.
 *
 *  JDA Corporation assumes no responsibility for the use of the
 *  software described in this document on equipment which has not been
 *  supplied or approved by JDA Corporation.
 *
 *  $Copyright-End$
 */

public class SortUsingComaparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		list.add(-1);
		list.add(11);
		list.add(7);
		list.add(2);
		list.add(0);
		list.add(5);
		list.add(2);
		Collections.sort(list, new Comparator<Integer>() {
			
				
			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
			
		});
		if(list.contains(2)) {
			list.remove(2);
			list.add(0, 2);
		}
		System.out.println(list);
	}

}
