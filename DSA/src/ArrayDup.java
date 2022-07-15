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

public class ArrayDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[] {1,2,3,4,5,6,7};
		
		int i =0;
		int j=0;
		for ( i =0;i<arr.length;i++) {
			for (j=i+1;j<arr.length; j++) {
				if(arr[i]==arr[j])
					System.out.println("true");
				break;
			}
		}
	}

}
