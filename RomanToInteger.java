import java.util.HashMap;
import java.util.Map;

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
 *Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

 *  $Copyright-End$
 */

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="VII";
		int res=0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		
		
		for(int i =0;i<str.length();i++) {
			if(i!=str.length()-1&&map.get(str.charAt(i))<map.get(str.charAt(i+1))){
				res+=map.get(str.charAt(i+1))-map.get(str.charAt(i));
				i++;
			}
			else
				res+=map.get(str.charAt(i));
		}
		System.out.println(res);

	}

}
