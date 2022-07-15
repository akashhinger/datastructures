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

public class StringReverseSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ak@#as@#h";
		int n =str.length();
		int left=0,right=n-1;
		String str2="";
		char[] ch1=str.toCharArray();
		while(left<right&&right>0) {
			if(Character.isLetter(ch1[left])&&Character.isLetter(ch1[right])) {
				char ch =ch1[left];
				ch1[left]=ch1[right];
				ch1[right]=ch;

				left++;
				right--;
				
			}
			if(!Character.isLetter(ch1[left]))
			left++;
			if(!Character.isLetter(ch1[right]))
			right--;
		}
		System.out.println(ch1);
	}

}
