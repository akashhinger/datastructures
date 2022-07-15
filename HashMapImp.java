import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

public class HashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hm = new HashMap<>();
		hm.put('A', 1);
		hm.put('B', 2);
		hm.put('C', 3);
		
		
		for(Entry<Character, Integer> e: hm.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
