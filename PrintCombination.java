import java.util.HashSet;
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

public class PrintCombination {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="TRUE";
		String str2="";
		combination(str,str2);

		System.out.println(count);
	}

	private static void combination(String str, String str2) {
		// TODO Auto-generated method stub
		
		if(str.length()==0) {
			System.out.println(str2 +" "+ ++count);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			String l=str.substring(0,i);
			String r =str.substring(i+1);
			String fin=l+r;
			combination(fin,str2+c);
		}
		
		
		
	}

}
