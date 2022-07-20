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

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println(fact(n));
		System.out.println(printall(n));
	}

	private static int printall(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 0;
		else {
			System.out.println(n);
			return printall(n-1);
			
		}
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	

}
